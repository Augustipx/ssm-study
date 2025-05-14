import com.ssm.dao.IUserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void test01() {


        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserDao bean = ioc.getBean(IUserDao.class);
        bean.getUser();
    }
}
