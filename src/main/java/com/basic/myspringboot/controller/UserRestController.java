package com.basic.myspringboot.controller;

import com.basic.myspringboot.entity.User;
import com.basic.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {
    private final UserRepository userRepository;


//    public UserRestController(UserRepository userRepository) {
//        log.info("UserRepository 구현 클래스명 : {}", userRepository.getClass().getName());
//        this.userRepository = userRepository;
//    }

    //User 등록
    @PostMapping
    public User create(@RequestBody User userDetail){
        return userRepository.save(userDetail);
    }

    //User 등록 조회
    @GetMapping
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
}
