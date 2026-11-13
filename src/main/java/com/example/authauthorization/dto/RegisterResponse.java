package com.example.authauthorization.dto;

import com.example.authauthorization.entity.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterResponse {

    private Long id;
    private String username;
    private Role role;
}
