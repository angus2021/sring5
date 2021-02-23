import com.spring5.config.AppConfig;
import com.spring5.pojo.Dog;
import com.spring5.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user==user1);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }

}
