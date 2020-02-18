
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ustc.wzh.pojo.Student;
import ustc.wzh.pojo.User;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user2 = (User) context.getBean("user2");
        System.out.println(user2);
    }
}
