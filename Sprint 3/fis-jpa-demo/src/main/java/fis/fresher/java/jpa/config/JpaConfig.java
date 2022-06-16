package fis.fresher.java.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "fis.fresher.java.jpa.repository")
public class JpaConfig {

}
