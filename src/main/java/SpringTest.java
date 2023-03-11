import com.kayak.pay.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = classPathXmlApplicationContext.getBean("people", People.class);
        System.out.println(people.toString());

    }

}

