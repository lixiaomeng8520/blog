package cc.pecid.blog;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BlogApplication.class, args);
		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		// applicationContext.get
		// System.out.println(2111);
	}

}
