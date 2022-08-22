import com.zb.pojo.UserDao;
import com.zb.pojo.UserMysqlImpl;
import com.zb.service.UserService;
import com.zb.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl)userService).setUserDao(new UserMysqlImpl());
//        userService.UserService();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao dao = (UserDao) context.getBean("oracle");
        dao.getUserDao();
    }
}
