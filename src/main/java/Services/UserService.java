package Services;
import com.example.Hackthon.*;
import com.example.Hackthon.Model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}