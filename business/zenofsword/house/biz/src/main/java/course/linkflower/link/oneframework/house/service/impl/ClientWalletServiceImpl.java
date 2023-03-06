package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.house.dao.ClientWalletMapper;
import course.linkflower.link.oneframework.house.dto.base.IdDto;
import course.linkflower.link.oneframework.house.service.ClientWalletService;
import course.linkflower.link.oneframework.house.vo.clientwallet.ClientWalletVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientWalletServiceImpl implements ClientWalletService {
    @Autowired
    private ClientWalletMapper clientWalletMapper;

    @Override
    public List<ClientWalletVo> listWalletByClientId(IdDto idDto) {
        return clientWalletMapper.listWalletByClientId(Long.parseLong(idDto.getId()));
    }
}
