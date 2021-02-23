import com.spring5.pojo.Student;
import com.spring5.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextNameSpace.xml");
        User user1 = (User)context.getBean("user");
        User user11 = (User)context.getBean("user");
        User user2 = (User)context.getBean("user2");
        User user21 = (User)context.getBean("user2");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1==user11);
        System.out.println(user2==user21);
    }

}
