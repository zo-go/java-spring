import com.zb.config.ZbConfig;
import com.zb.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext Context = new AnnotationConfigApplicationContext(ZbConfig.class);
        User getUser = Context.getBean("getUser",User.class);

        System.out.println(getUser.getName());
    }
}
