package com.onesound.onesound.repositories;


import com.onesound.onesound.entities.Role;
import com.onesound.onesound.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);

    User findByRole(Role role);
}
