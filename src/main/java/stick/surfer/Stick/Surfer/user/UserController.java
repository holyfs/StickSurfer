package stick.surfer.Stick.Surfer.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    };

    @PostMapping
    public String registerNewUser(@RequestBody User user){
        return userService.addNewUser(user);
    }
    @DeleteMapping(path="{userId}")
    public void deleteUser(@PathVariable("userId")Long userId){
        userService.deleteUser(userId);
    }

    @PutMapping(path="{userId}")
    public void updateUserMaxScore(@RequestBody User user){

        userService.updateUserMaxScore(user.getId(), user.getLastScore());
    }
}
