package com.korkmaz.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterRequestDto {
    private String userName;
    private String password;
    private String repassword;
    private String email;
}
