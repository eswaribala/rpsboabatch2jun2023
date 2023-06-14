package com.boa.jwtsecurity.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Role_Id")
    private long roleId;
    @Column(name="Role_Name",length=50)
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(String role) {
        this.roleName = role;
    }



}
