package com.example.board.global.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "jwt")
public class JwtConfig {
    private String issuer;
    private String clientSecret;
    private int accessExpirySeconds;
    private int refreshExpirySeconds;
}
