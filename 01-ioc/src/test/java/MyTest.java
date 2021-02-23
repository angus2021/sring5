
import com.spring5.dao.UserDao;
import com.spring5.dao.UserDaoImpl;
import com.spring5.dao.UserMySqlDaoImpl;
import com.spring5.dao.UserOracleDaoImpl;
import com.spring5.service.UserService;
import com.spring5.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        UserDao userDao = (UserDao) context.getBean("userMySqlDaoImpl");
        userService.getUser(userDao);
        userDao = (UserDao) context.getBean("userOracleDaoImpl");
        userService.getUser(userDao);
        userDao = (UserDao) context.getBean("userDaoImpl");
        userService.getUser(userDao);
    }
}
