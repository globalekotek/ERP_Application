package com.practise.springapp.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.springapp.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Serializable>
{

}
