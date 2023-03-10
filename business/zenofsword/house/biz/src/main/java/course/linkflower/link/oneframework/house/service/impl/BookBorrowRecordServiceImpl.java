package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.PageModelResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.*;
import course.linkflower.link.oneframework.house.dto.book.BookShortInfoVo;
import course.linkflower.link.oneframework.house.dto.bookShelf.BookShelfInfoVo;
import course.linkflower.link.oneframework.house.dto.bookborrowrecord.AddBookBorrowRecordDto;
import course.linkflower.link.oneframework.house.dto.bookborrowrecord.DeleteBookBorrowRecordDto;
import course.linkflower.link.oneframework.house.dto.bookborrowrecord.SearchBookBorrowRecordDto;
import course.linkflower.link.oneframework.house.dto.bookborrowrecord.UpdateBookBorrowRecordDto;
import course.linkflower.link.oneframework.house.dto.borrowRecord.SearchByDateDto;
import course.linkflower.link.oneframework.house.model.*;
import course.linkflower.link.oneframework.house.service.BookBorrowRecordService;
import course.linkflower.link.oneframework.house.vo.book.BookDetailVo;
import course.linkflower.link.oneframework.house.vo.bookInfo.BookInforShortVo;
import course.linkflower.link.oneframework.house.vo.bookborrowrecordvo.BookBorrowRecordVo;
import course.linkflower.link.oneframework.house.vo.borrowcard.BorrowCardInfoVo;
import course.linkflower.link.oneframework.house.vo.client.ClientInfoVo;
import course.linkflower.link.oneframework.house.vo.publisher.PublisherInfoVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BookBorrowRecordServiceImpl implements BookBorrowRecordService {
    @Autowired
    BookBorrowRecordMapper bookBorrowRecordMapper;
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookInfoMapper bookInfoMapper;
    @Autowired
    BookShelfMapper bookShelfMapper;
    @Autowired
    PublisherMapper publisherMapper;
    @Autowired
    ClientMapper clientMapper;
    @Autowired
    BorrowCardMapper borrowCardMapper;
    @Override
    public void addBookBorrowRecord(AddBookBorrowRecordDto addBookBorrowRecordDto) {
            bookBorrowRecordMapper.save(addBookBorrowRecordDto.toModel());
    }

    @Override
    public void updateBookBorrowRecord(UpdateBookBorrowRecordDto updateBookBorrowRecordDto) {
            bookBorrowRecordMapper.update(updateBookBorrowRecordDto.toModel());
    }

    @Override
    public void deleteBookBorrowRecord(DeleteBookBorrowRecordDto deleteBookBorrowRecordDto) {
            bookBorrowRecordMapper.delete(Long.parseLong(deleteBookBorrowRecordDto.getId()));
    }

    @Override
    public BookBorrowRecordVo getBookBorrowRecordById(SearchBookBorrowRecordDto searchBookBorrowRecordDto) {
        return new BookBorrowRecordVo().loadFrom(bookBorrowRecordMapper.getBookBorrowRecordById(Long.parseLong(searchBookBorrowRecordDto.getId())));
    }
    @Override
    public Result<PageModelResult<List<BookDetailVo>>> listBookByDate(SearchByDateDto searchByDateDto) {
        PageModelResult<List<BookDetailVo>> ret = new PageModelResult<>();
        List<BookDetailVo> retList = new ArrayList<>();
        ret.setData(retList);

        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        try {
            Date startDate = sdf.parse(searchByDateDto.getStartDate());
            Date endDate;
            if (!StringUtils.isEmpty(searchByDateDto.getEndDate())) {
                endDate = sdf.parse(searchByDateDto.getEndDate());
            } else {
                endDate = new Date();
            }
            //??????????????????????????????????????????
            List<BookBorrowRecord> records = bookBorrowRecordMapper.listByDate(startDate, endDate,
                    searchByDateDto.getPageCount() * searchByDateDto.getPageNo(),
                    searchByDateDto.getPageCount());

            //??????????????????????????????????????????
            int total = bookBorrowRecordMapper.getByDateTotal(startDate, endDate);
            //??????????????????
            int pageCount = total / searchByDateDto.getPageCount();
            if ((total - (pageCount * searchByDateDto.getPageCount())) > 0) {
                pageCount += 1;
            }
            ret.setPageCount(pageCount);
            ret.setTotal(total);

            //??????????????????????????????id???bookIds??????
            List<Long> bookIds = new ArrayList<>();
            Map<Long, Boolean> clientIds = new HashMap<>();
            Map<Long,Boolean> borrowCardIds = new HashMap<>();
            for (BookBorrowRecord r : records) {
                bookIds.add(r.getBookId());
                //???????????????????????????????????????id
                clientIds.put(r.getClientId(),Boolean.TRUE);
                //?????????????????????????????????id
                borrowCardIds.put(r.getBorrowCardId() , Boolean.TRUE);
            }

            Map<Long, Boolean> bookInfoIdMap = new HashMap<>();
            Map<Long, Book> bookMap = new HashMap<>();
            Map<Long, Boolean>  bookShelfIds = new HashMap<>();
            //??????sql in ???????????? select * from book where id in (1, 2, 3), select * from book where id in ()
            if (bookIds.size() > 0) {
                for (Book b :bookMapper.listByIds(bookIds)) {
                    //??????book id ??????????????????book ????????? bookMap
                    bookMap.put(b.getId(), b);
                    //??????bookInforId ???????????????map??????
                    bookInfoIdMap.put(b.getBookInforId(), Boolean.TRUE);
                    bookShelfIds.put(b.getBookShelfId(), Boolean.TRUE);
                }
            }


            Map<Long, Boolean>  publisherIds = new HashMap<>();
            Map<Long, BookInfo> bookInfoMap = new HashMap<>();
            //??????????????????

            if (bookInfoIdMap.size() > 0) {
                //??????????????????bookInforId?????????????????????????????????bookInfoMap
                for (BookInfo bi : bookInfoMapper.listByIds(bookInfoIdMap.keySet())) {
                    bookInfoMap.put(bi.getId(), bi);
                    publisherIds.put(bi.getPublisherId(), Boolean.TRUE);
                }
            }

            Map<Long, Publisher> publisherMap = new HashMap<>();
            if (publisherIds.size() > 0) {
                //??????????????????bookInforId?????????????????????????????????bookInfoMap
                for (Publisher pi : publisherMapper. listByIds(publisherIds.keySet())) {
                    publisherMap.put(pi.getId(), pi);
                }
            }

            Map<Long, Bookshelf> bookShelfMap = new HashMap<>();
            if (bookShelfIds.size() > 0) {
                //??????????????????bookInforId?????????????????????????????????bookInfoMap
                for (Bookshelf bs : bookShelfMapper.listByIds(bookShelfIds.keySet())) {
                    bookShelfMap.put(bs.getId(), bs);
                }
            }


            Map<Long , Client> clientMap = new HashMap<>();
            if (clientIds.size() > 0){
                //??????????????????clientId?????????????????????????????????clientMap
                for (Client client : clientMapper.listByIds(clientIds.keySet())){
                    clientMap.put(client.getId(), client);
                }
            }
            Map<Long , BorrowCard> borrowCardMap= new HashMap<>();
            if(borrowCardIds.size()>0){
                //??????????????????borrowcardid?????????????????????????????????borrowcardmap
                for (BorrowCard borrowCard : borrowCardMapper.listByIds(borrowCardIds.keySet())){
                    borrowCardMap.put(borrowCard.getId(),borrowCard);
                }
            }

            for (BookBorrowRecord r : records) {
                BookDetailVo bd = new BookDetailVo();
                Book b = bookMap.get(r.getBookId());
                BookInfo bisi = null;
                Publisher p = null;
                Bookshelf bs = null;
                Client c = null;
                BorrowCard bc = null;
                if (b != null) {
                    bisi = bookInfoMap.get(b.getBookInforId());
                    if (bisi != null) {
                        p = publisherMap.get(bisi.getPublisherId());
                    }
                    bs = bookShelfMap.get(b.getBookShelfId());
                    c = clientMap.get(r.getClientId());
                    bc = borrowCardMap.get(r.getBorrowCardId());
                }


                bd.loadFrom(r);
                bd.setBook(new BookShortInfoVo().loadFrom(b));
                bd.setBookInfo(new BookInforShortVo().loadFrom(bisi));
                bd.setBookShelf(new BookShelfInfoVo().loadFrom(bs));
                bd.setPublisher(new PublisherInfoVo().loadFrom(p));
                bd.setBorrower(new ClientInfoVo().loadFrom(c));
                bd.setBorrowCard(new BorrowCardInfoVo().loadFrom(bc));
                /*
                ok
                {
                    "id": null,
                    "bookInfo": {
                        "id": null,
                        "name": null
                    },
                    "book": {
                        "id": null
                    }
                }
                error
                {
                    "id": null,
                    "bookInfo": null,
                    "book": null
                }
                if (bd.bookInfo && bd.bookInfo.id != null) {
                }
                 */
                retList.add(bd);
            }

        } catch (ParseException pe) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeFormatError, BaseErrorContst.BaseMsgTimeFormatError);
        }
        return Result.succeed(ret);
    }
}
