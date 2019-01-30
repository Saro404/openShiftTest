package sa.elm.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class OpenshiftApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
		System.out.println("*************************");
		System.out.println("\n \n Hello it's me \n \n");
		System.out.println("*************************");
	}
}
