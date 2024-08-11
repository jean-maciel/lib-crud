package br.com.jean.simple_crud.service;

import br.com.jean.simple_crud.entity.User;
import br.com.jean.simple_crud.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {

        String email = user.getEmail();
        User foundUser = userRepository.findByEmail(email);

        if(foundUser == null) {
            return userRepository.save(user);
        }

        throw new RuntimeException("Email already taken");
    }
}
