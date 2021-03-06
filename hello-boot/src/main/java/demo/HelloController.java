package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	HelloProperties props;

	@RequestMapping("/hello")
	public String hello(@RequestParam String user) {
		return props.getGreeting()+user;
	}
}