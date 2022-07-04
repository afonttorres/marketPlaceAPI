package com.factoria.marketPlace.controllers;

import com.factoria.marketPlace.dto.UserReqDto;
import com.factoria.marketPlace.models.User;
import com.factoria.marketPlace.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    IUserService userService;

    public UserController(IUserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping("/users")
    User create(@RequestBody UserReqDto userDto){
        return userService.create(userDto);
    }
}
