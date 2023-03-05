package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.house.dao.ClientMapper;
import course.linkflower.link.oneframework.house.dto.base.IdDto;
import course.linkflower.link.oneframework.house.service.ClientService;
import course.linkflower.link.oneframework.house.vo.clientwallet.ClientWalletVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientMapper clientMapper;
}
