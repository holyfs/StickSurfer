package stick.surfer.Stick.Surfer.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public String addNewUser(User user) {
        Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        userRepository.save(user);
        return "Ok";
    }

    public void deleteUser(Long userId) {
         boolean exist = userRepository.existsById(userId);
         if(!exist){
             throw new IllegalStateException("User with id " + userId +" does not exist");
        }
         userRepository.deleteById(userId);
    }
    @Transactional
    public void updateUserMaxScore(Long userId, Long userLastScore) {
        User user = userRepository.findById(userId).orElseThrow(()-> new IllegalStateException("user with id "+ userId+" does not exist"));
        if(userLastScore>user.getMaxScore()){
            user.setMaxScore(userLastScore);
           // userRepository.save(user);
        }
        user.setLastScore(userLastScore);
    }
}
