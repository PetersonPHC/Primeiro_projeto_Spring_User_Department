package com.phcproject.userdepartament.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phcproject.userdepartament.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
