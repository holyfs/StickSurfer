package stick.surfer.Stick.Surfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import stick.surfer.Stick.Surfer.user.User;

import java.util.List;

@SpringBootApplication
@RestController
public class StickSurferApplication {

	public static void main(String[] args) {
		SpringApplication.run(StickSurferApplication.class, args);
	}

	@GetMapping
	public List<User> hello(){
		return List.of(new User(
				1L,
				15351L,
				55151351L,
				"Ely",
				"ely@ely.com",
				"1234"
		));
	}

}
