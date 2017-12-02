package be.enyed.zkboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import be.enyed.zkboot.service.TestService;

@Controller
public class ZkbootController {

  private final TestService service;

  public ZkbootController(TestService service) {
	this.service = service;
  }

  @GetMapping("/data")
  public String getData(Model model) {
	model.addAttribute("data", service.getData());
	return "data";
  }

}
