package com.example.genericrepositoryjpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by yasergh on 04/07/17.
 */
@Entity
@Table(name = Group.tableName)
public class Group  implements Serializable {
    public static final String tableName = "groups";

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "group_id" ,insertable = false, updatable = false)
    private Long groupId;

    @Column(name = "group_name")
    private String groupName;


    @OneToMany(mappedBy = "group")
    @JsonBackReference
    private Set<User> users ;


    public Group() {
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString(){
        return "Group:{groupId:" + this.groupId + ", groupName:" + this.groupName + "}";
    }

}
