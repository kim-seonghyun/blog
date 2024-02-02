package com.seonghyun.blog.service.impl;

import com.seonghyun.blog.dto.UserRequestDto;
import com.seonghyun.blog.entity.Users;
import com.seonghyun.blog.repository.UsersRepository;
import com.seonghyun.blog.service.UsersService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    @Transactional
    public void register(UserRequestDto userRequestDto) {
        Users newUser = Users.builder().userEmail(userRequestDto.getUserEmail()).userName(userRequestDto.getUserName()).userPassword(userRequestDto.getUserPassword()).build();
        usersRepository.save(newUser);
    }
}
