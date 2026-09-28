package com.example.usermanagement.UserRepository;

import com.example.usermanagement.UserModel.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
