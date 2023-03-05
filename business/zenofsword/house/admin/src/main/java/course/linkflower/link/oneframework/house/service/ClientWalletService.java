package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.base.IdDto;
import course.linkflower.link.oneframework.house.vo.clientwallet.ClientWalletVo;

import java.util.List;

public interface ClientWalletService {
    List<ClientWalletVo> listWalletByClientId(IdDto idDto);
}
