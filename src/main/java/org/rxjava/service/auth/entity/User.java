package org.rxjava.service.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.rxjava.web.core.BaseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * @author happy
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class User extends BaseEntity implements UserDetails {
    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;

    @Override
    public List<GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }

}
