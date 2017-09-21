package org.csu.coder.lee.domain;

import java.util.Date;

/**
 * Created by lixiang on 2017 09 21 10:47.
 */
public class User {

    private Long id;
    private String name;
    private Boolean sex;
    private Date created;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getSex() {
        return sex;
    }

    public User setSex(Boolean sex) {
        this.sex = sex;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public User setCreated(Date created) {
        this.created = created;
        return this;
    }
}
