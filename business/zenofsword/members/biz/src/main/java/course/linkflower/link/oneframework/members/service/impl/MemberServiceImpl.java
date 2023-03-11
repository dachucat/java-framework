package course.linkflower.link.oneframework.members.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.common.utils.MD5Util;
import course.linkflower.link.oneframework.members.constant.MemberConstant;
import course.linkflower.link.oneframework.members.dao.MemberMapper;
import course.linkflower.link.oneframework.members.service.MemberService;
import course.linkflower.link.oneframework.members.vo.member.LoginMemberVo;
import course.linkflower.link.oneframework.members.vo.member.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Result<LoginMemberVo> loginByAccount(String account, String password) {
        if (memberMapper.countByAccountAndPassword(account, MD5Util.MD5(MemberConstant.getPasswordSalt(password))) == 0) {
            return Result.failed(-1, "");
        }

        return null;
    }

    @Override
    public Result<LoginMemberVo> loginByPhone(String tel) {
        return null;
    }


    public Result<MemberVo> getInfo() {
        return null;
    }
}
