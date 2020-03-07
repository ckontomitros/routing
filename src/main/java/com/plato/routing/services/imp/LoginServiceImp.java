package com.plato.routing.services.imp;

import com.plato.routing.services.LoginService;
import com.plato.routing.services.ResponseService;
import dto.LoginDto;
import dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    ResponseService responseService;

    @Override
    public Future<UserDto> authenticateUser(LoginDto dto) {
       responseService
                .sendRequest("accounts.authenticate",dto);
       return null;
    }

    @Override
    public Future<UserDto> createUser(UserDto userDto) {
        return null;
    }
}
