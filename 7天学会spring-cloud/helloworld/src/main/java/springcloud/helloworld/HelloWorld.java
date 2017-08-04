package springcloud.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloWorld {


	@RequestMapping(value = "/")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(HelloWorld.class, args);
	}

}
