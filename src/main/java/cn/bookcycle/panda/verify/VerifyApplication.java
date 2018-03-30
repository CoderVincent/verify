package cn.bookcycle.panda.verify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class VerifyApplication{
	public static void main(String[] args) throws Exception{
		SpringApplication.run(VerifyApplication.class, args);
	}
}

