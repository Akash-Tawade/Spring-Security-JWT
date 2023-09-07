package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JWTResponse {

    private String jwtToken;
    private String username;
}
