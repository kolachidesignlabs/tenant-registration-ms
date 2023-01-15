package com.kolachidesignlabs.tenant.registration.service.impl;

import com.kolachidesignlabs.tenant.registration.entity.User;
import com.kolachidesignlabs.tenant.registration.repository.UserRepository;
import com.kolachidesignlabs.tenant.registration.service.UserService;
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
