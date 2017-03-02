package ru.javawebinar.topjava.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * User: DmyP
 * Date: 22.02.2017
 */
public enum Role implements GrantedAuthority {
    ROLE_USER,
    ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
