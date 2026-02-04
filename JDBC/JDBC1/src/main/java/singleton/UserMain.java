package singleton;

public class UserMain {
    public static void main(String[] args) {
        User user=User.getUser();
        user.setUserId(1001);
        user.setUserName("pavan kumar");

        User user1=User.getUser();
        System.out.println(user);
        System.out.println(user1);
    }
}
