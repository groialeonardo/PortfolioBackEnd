
package com.groialeonardo.lgportfolio.repository;

import com.groialeonardo.lgportfolio.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
