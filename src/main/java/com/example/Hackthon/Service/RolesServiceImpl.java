package com.example.Hackthon.Service;

import com.example.Hackthon.Model.Roles;
import com.example.Hackthon.Repository.RolesRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class RolesServiceImpl implements RoleService {
    private final RolesRepo rolesRepo;


    @Override
    public Roles addRole(Roles roles) {
        return rolesRepo.save(roles);
    }
}
