package com.korkmaz.controller;


import com.korkmaz.document.UserProfile;
import com.korkmaz.dto.request.CreateUserRequestDto;
import com.korkmaz.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static com.korkmaz.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class UserProifleController {
    private final UserProfileService userProfileService;

    @PostMapping(CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto dto){
        userProfileService.createUser(dto);
        return ResponseEntity.ok(true);
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<UserProfile>> getAll(){
        return ResponseEntity.ok(userProfileService.getAll());
    }
}
