package com.factoria.marketPlace.services;

import com.factoria.marketPlace.models.User;
import com.factoria.marketPlace.repositories.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }
}
