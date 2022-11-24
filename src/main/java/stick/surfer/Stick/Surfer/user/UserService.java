package stick.surfer.Stick.Surfer.user;

import java.util.List;

public class UserService {
    public List<User> getUsers(){
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
