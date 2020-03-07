package com.plato.routing.services;

import dto.LoginDto;
import dto.UserDto;

import java.util.concurrent.Future;

public interface LoginService {
    public Future<UserDto> authenticateUser(LoginDto dto);
    public Future<UserDto> createUser(UserDto userDto);
}
