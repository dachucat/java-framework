package course.linkflower.link.oneframework.members.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.members.vo.member.LoginMemberVo;
import course.linkflower.link.oneframework.members.vo.member.MemberVo;

public interface MemberService {
    Result<LoginMemberVo> loginByAccount(String account, String password);
    Result<LoginMemberVo> loginByPhone(String tel);

}
