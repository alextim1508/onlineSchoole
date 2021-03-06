package com.alextim.security.token;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class SecondaryAuthenticationToken extends UsernamePasswordAuthenticationToken {

    public SecondaryAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public SecondaryAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}