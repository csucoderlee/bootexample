package org.csu.coder.lee.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by lixiang on 2017 09 26 15:19.
 */
@Entity
public class Reader implements UserDetails{

    @Id
    private String username;
    private String fullname;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("READER"));  //授予READER权限
    }

    @Override
    public boolean isAccountNonExpired() { //不过期
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {  //不加锁
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {  //不禁用
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
