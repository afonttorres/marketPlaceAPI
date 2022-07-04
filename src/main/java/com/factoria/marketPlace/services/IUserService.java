package com.factoria.marketPlace.services;

import com.factoria.marketPlace.dto.UserReqDto;
import com.factoria.marketPlace.models.User;

import java.util.List;

public interface IUserService {
    User getById(Long id);

    List<User> findAll();

    User create(UserReqDto user);
}
