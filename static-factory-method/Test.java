
public class Test {
    public static void main(String[] args) {
        String loginType = "password";
        String name = "name";
        String password = "password";
        Login login = LoginManager.factory(loginType);
        boolean bool = login.verify(name, password);
        if (bool) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
