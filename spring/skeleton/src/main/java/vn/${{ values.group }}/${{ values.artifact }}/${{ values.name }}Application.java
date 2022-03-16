package ${{ values.group }}.${{ values.artifact }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${{ values.name }}Application {

	public static void main(String[] args) {
		SpringApplication.run(${{ values.name }}Application.class, args);
	}

}
