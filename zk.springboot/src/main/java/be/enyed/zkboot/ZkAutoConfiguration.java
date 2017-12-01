package be.enyed.zkboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zkoss.zk.au.http.DHtmlUpdateServlet;
import org.zkoss.zk.ui.http.HttpSessionListener;
import org.zkoss.zk.ui.http.RichletFilter;

@Configuration
@EnableConfigurationProperties(ZkProperties.class)
public class ZkAutoConfiguration {

  private final ZkProperties zkProperties;

  public ZkAutoConfiguration(ZkProperties zkProperties) {
	this.zkProperties = zkProperties;
  }

  @Bean
  public ServletRegistrationBean dHtmlUpdateServlet() {
	return new ServletRegistrationBean(new DHtmlUpdateServlet(), zkProperties.getUpdateUri());
  }

  @Bean
  @ConditionalOnProperty(prefix = "zk", name = "richlet-enabled")
  public FilterRegistrationBean richletFilter() {
	FilterRegistrationBean reg = new FilterRegistrationBean(new RichletFilter());
	reg.addUrlPatterns(zkProperties.getRichletUri());
	return reg;
  }

  @Bean
  public HttpSessionListener httpSessionListener() {
	return new HttpSessionListener();
  }
}
