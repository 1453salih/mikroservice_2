package com.korkmaz.service;

import com.korkmaz.dto.request.LoginResponseDto;
import com.korkmaz.dto.request.RegisterRequestDto;
import com.korkmaz.entity.Auth;
import com.korkmaz.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository repository;

    public Auth register(RegisterRequestDto dto) {

        return repository.save(Auth.builder()
                .userName(dto.getUserName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build());
    }


    public Boolean login(LoginResponseDto dto) {
        return repository.existsByUserNameAndPassword(dto.getUserName(),dto.getPassword());
    }
}
