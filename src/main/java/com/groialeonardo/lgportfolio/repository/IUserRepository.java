
package com.groialeonardo.lgportfolio.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface IUserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
