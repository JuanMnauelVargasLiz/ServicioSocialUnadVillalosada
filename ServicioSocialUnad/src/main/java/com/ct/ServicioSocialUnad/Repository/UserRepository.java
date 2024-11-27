package com.ct.CrudThymeleaf.Repository;

import com.ct.CrudThymeleaf.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
