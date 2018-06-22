package pl.jakubgajewski.userapi.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import pl.jakubgajewski.userapi.models.Login;
import pl.jakubgajewski.userapi.models.User;
import pl.jakubgajewski.userapi.models.UserDAO;

public class UserService {

    //TODO: field injection
    @Autowired
    public UserDAO userDAO;

    public void register(User user) {
        userDAO.register(user);
    }

    public User validateUser(Login login) {
        return userDAO.validateUser(login);
    }
}
