package spring.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		System.out.println("my spring application");
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


}
