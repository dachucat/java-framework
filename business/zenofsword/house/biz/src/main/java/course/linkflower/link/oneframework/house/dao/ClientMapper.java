package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.vo.clientwallet.ClientWalletVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface ClientMapper extends SuperMapper<ClientMapper> {
    List<ClientWalletVo> listWalletByClientId(@Param("id") long id);

    List<Client> listByIds(@Param("ids") Collection<Long> ids);
}
