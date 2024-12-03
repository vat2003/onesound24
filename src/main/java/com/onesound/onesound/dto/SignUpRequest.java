package com.onesound.onesound.dto;

import lombok.Data;

@Data
public class SignUpRequest {

    private String email;
    private String fullname;
    private String username;
    private String password;
}
