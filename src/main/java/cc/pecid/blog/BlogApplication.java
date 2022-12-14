package cc.pecid.blog;

import java.util.Arrays;

import cc.pecid.blog.domain.Article;
import cc.pecid.blog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
public class BlogApplication {



	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BlogApplication.class, args);
//		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		// applicationContext.get
		// System.out.println(2111);
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(BlogApplication.class);
		String[] names = ctx.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
//		User user = ctx.getBean(User.class);
//		System.out.println(user);
	}


//	@Bean
//	@Validated
//	public User user() {
//		return new User(1, "lxm", 400, null);
//	}




}
