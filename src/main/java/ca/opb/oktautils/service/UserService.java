package ca.opb.oktautils.service;

//import ca.opb.oktautils.repository.UserRepository;
import ca.opb.oktautils.entity.User;
import ca.opb.oktautils.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public Iterable<User> save(List<User> users) {
        return userRepository.saveAll(users);
    }

}