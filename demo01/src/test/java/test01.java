import com.ssm.config.SpringConfig;
import com.ssm.dao.IUserDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void test01() {


        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserDao bean = ioc.getBean(IUserDao.class);
        bean.getUser();
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        IUserDao bean = ioc.getBean(IUserDao.class);
        bean.getUser();
    }
}
