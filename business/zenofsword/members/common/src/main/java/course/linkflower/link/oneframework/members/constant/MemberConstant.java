package course.linkflower.link.oneframework.members.constant;

public class MemberConstant {
    public final static String passwordSalt = "swordPassword";

    public static String getPasswordSalt(String password) {
        return password + passwordSalt;
    }
}
