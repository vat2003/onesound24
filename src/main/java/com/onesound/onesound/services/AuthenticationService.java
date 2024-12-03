package com.onesound.onesound.services;

import com.onesound.onesound.dto.JwtAuthenticationResponse;
import com.onesound.onesound.dto.RefreshTokenRequest;
import com.onesound.onesound.dto.SignUpRequest;
import com.onesound.onesound.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signIn(SignUpRequest signUpRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
