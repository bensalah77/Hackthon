package com.example.Hackthon.Repository;

import com.example.Hackthon.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
User findByName(String name);
User findByUsername(String username);

}
