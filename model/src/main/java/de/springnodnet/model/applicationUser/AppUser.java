package de.springnodnet.model.applicationUser;

import javax.persistence.Entity;

import de.springnodnet.model.BaseEntity;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "applicationUser")
@AttributeOverride(name = "id", column = @Column(name = "applicationUser_id",
        nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class AppUser extends BaseEntity {

    private String username;
    private String userPassword;
    private String userType;

    public AppUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
