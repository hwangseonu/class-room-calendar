package me.mocha.calendar.user.repository;

import me.mocha.calendar.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<String, User> {
}
