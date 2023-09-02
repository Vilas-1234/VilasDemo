package in.vp.main;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.asm.Advice.Return;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = {"in.vp.repository"})
public class OnlineBookMyShowApplication extends SpringBootServletInitializer{

git@Override

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(OnlineBookMyShowApplication.class);
	}
	
	
	public static void main(String[] args) {
	System.out.println("Application Started...");
		SpringApplication.run(OnlineBookMyShowApplication.class, args);
		System.out.println("Application Closed...");
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
}
}
