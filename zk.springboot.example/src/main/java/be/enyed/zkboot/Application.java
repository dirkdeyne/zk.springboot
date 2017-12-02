package be.enyed.zkboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@EnableZk
public class Application {

  public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
  }

  @Bean
  public ViewResolver viewResolver() {
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	resolver.setPrefix("/zkau/web/pages/");
	resolver.setSuffix(".zul");
	return resolver;
  }

}
