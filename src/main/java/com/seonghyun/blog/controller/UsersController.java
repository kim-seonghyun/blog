package com.seonghyun.blog.controller;

import com.seonghyun.blog.dto.UserRequestDto;
import com.seonghyun.blog.service.UsersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @GetMapping("/register")
    public String getRegisterPage(){
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute @Valid UserRequestDto userRequestDto){
        usersService.register(userRequestDto);
        return "redirect:/login";
    }
}
