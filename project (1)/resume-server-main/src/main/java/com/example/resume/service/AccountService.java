package com.example.resume.service;

import com.example.resume.dto.Account;
import com.example.resume.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void join(Account account) {
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        account.setRole("ADMIN");
        
        userRepository.save(account);
    }
}
