package example;

public class AccessValidator {
    public boolean validate(String userID) {
        System.out.println("在数据库中验证用户'" + userID + "'是否为合法用户？");
        if (userID.equalsIgnoreCase("合法用户")) {
            System.out.println("'" + userID + "'登录成功！");
            return true;
        } else {
            System.out.println("'" + userID + "'登录失败！");
            return false;
        }
    }
}
