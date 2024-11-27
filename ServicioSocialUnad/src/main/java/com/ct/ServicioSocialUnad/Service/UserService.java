package com.ct.CrudThymeleaf.Service;

import com.ct.CrudThymeleaf.Model.User;
import com.ct.CrudThymeleaf.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Método para obtener todos los usuarios
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    // Método para guardar un usuario
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Método para encontrar un usuario por su ID
    public User findUserId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Método para eliminar un usuario por su ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
