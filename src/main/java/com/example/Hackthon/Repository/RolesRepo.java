package com.example.Hackthon.Repository;

import com.example.Hackthon.Model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepo extends JpaRepository<Roles,Long> {
    Roles findByName(String name);
}
