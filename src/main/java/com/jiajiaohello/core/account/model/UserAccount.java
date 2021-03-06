package com.jiajiaohello.core.account.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Entity;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * User: bohan
 * Date: 9/16/14
 * Time: 5:33 PM
 */
@Entity
public class UserAccount extends Account {
    static final String DEFAULT_ROLE = "ROLE_USER";
    static List<SimpleGrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority(DEFAULT_ROLE));

    public UserAccount() {
    }

    public UserAccount(String username) {
        super(username);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
}
