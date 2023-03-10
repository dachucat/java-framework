package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;

public interface MemberMapper extends SuperMapper<MemberMapper> {

    /**
     * sql: select * from member where (`account` = #{account} or (`mail` = #{account} or (`mobile` = #{account}) and password = #{password}
     * @param account
     * @param password
     * @return
     */
    int countByAccountAndPassword(String account, String password);
}
