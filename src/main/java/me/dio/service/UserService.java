package me.dio.service;

import me.dio.domain.model.User;

public interface UserService extends CrudService<Long, User> {

public default List<User> searchUsers(String name, String email) {
    return userRepository.findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(name, email);
}
    }
