package com.ct.CrudThymeleaf.Controllers;

import com.ct.CrudThymeleaf.Model.User;
import com.ct.CrudThymeleaf.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // Mostrar todos los usuarios registrados
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userService.listUsers();
        model.addAttribute("users", users);
        return "users";
    }

    // Mostrar formulario para agregar un nuevo usuario en la BD
    @GetMapping("/newUser")
    public String showFormNewUser(Model model) {
        model.addAttribute("user", new User());
        return "formUser";
    }

    // Guardar un nuevo usuario
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    // Mostrar formulario para editar un usuario existente
    @GetMapping("/edit/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        User user = userService.findUserId(id);
        model.addAttribute("user", user);
        return "formUser";
    }

    // Eliminar un usuario
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
