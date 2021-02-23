import com.spring5.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = context.getBean("people",People.class);
        System.out.println(people);
        people.getDog().shout();
        people.getCat().shout();
        people.getCat1().shout();
    }
}
