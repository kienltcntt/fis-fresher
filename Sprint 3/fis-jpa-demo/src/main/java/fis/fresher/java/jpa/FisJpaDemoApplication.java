package fis.fresher.java.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="fis.fresher.java.jpa.*")
@EntityScan("fis.fresher.java.jpa.*")
public class FisJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisJpaDemoApplication.class, args);
	}
}
