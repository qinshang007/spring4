import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring4.model.User;
import com.spring4.service.UserService;


public class UserTest {

	private UserService userService;
    
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
     
    @Test
    public void addUser(){
        User user = new User();
        user.setUserName("mybatis");
        user.setPassword("mybatis");
        user.setLevel(2);
        user.setEmail("mail@163.com");
        user.setPhone("15088785126");
        System.out.println(userService.insertUser(user));
    }
	
}
