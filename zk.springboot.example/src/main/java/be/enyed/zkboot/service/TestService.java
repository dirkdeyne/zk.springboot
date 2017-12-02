package be.enyed.zkboot.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TestService {
  public Date getTime() {
	return new Date();
  }

  public List<String> getData() {
	return Arrays.asList("Hallo World", "Hello ZK", "Hello Spring Boot");
  }
}
