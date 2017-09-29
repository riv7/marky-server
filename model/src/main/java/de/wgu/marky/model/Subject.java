package de.wgu.marky.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
    private Long id;
    private String name;
    private String scope;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

}
