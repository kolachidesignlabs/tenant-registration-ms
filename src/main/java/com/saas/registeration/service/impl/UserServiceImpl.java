package com.saas.registeration.service.impl;

import com.saas.registeration.entity.User;
import com.saas.registeration.repository.UserRepository;
import com.saas.registeration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user){
        return userRepository.save(user);
    }
}
