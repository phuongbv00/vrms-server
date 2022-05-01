package io.github.censodev.vrms.vrmsserver.data.models.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginRes {
    private String token;
    private Integer expires;
}