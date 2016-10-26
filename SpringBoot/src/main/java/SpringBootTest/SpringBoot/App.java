package SpringBootTest.SpringBoot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        System.out.println("Let's check Spring boot beans: ");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames){
        	System.out.println(beanName+' ');
        }
    }
}
