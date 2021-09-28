package com.nus.shopit.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nus.shopit.config.Constants;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Timestamp;

/**
 * A user.
 */
@Table("jhi_account")
public class Account extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long accountId;

    //@NotNull
    //@Pattern(regexp = Constants.LOGIN_REGEX)
    //@Size(min = 1, max = 50)
    @Column (name = "userName", nullable = false, unique = true, length = 50)
    private String userName;

//    @JsonIgnore
//    @NotNull
//    @Size(min = 60, max = 60)
//    @Column("password_hash")
    @Column (name = "password", nullable = false, length = 35)
    private String password;

    @Column (name = "name", nullable = false, length = 100)
    private String name;

    @Column (name = "accountType", nullable = false, length = 10)
    private String accountType;

    @Column (name = "accountCreationDate", nullable = false)
    private java.sql.Timestamp accountCreationDate;
    
    @Column (name = "lastLogin", nullable = false)
    private java.sql.Timestamp lastLogin;

//    @JsonIgnore
//    @Transient
//    private Set<Authority> authorities = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getuserName() {
        return userName;
    }

    public void userName(String userName) {
        this.userName = StringUtils.lowerCase(userName, Locale.ENGLISH);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public DateTime getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(DateTime accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public DateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(DateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof User)) {
//            return false;
//        }
//        return id != null && id.equals(((User) o).id);
//    }

//    @Override
//    public int hashCode() {
//        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
//        return getClass().hashCode();
//    }
//
//    // prettier-ignore
//    @Override
//    public String toString() {
//        return "User{" +
//            "login='" + login + '\'' +
//            ", firstName='" + firstName + '\'' +
//            ", lastName='" + lastName + '\'' +
//            ", email='" + email + '\'' +
//            ", imageUrl='" + imageUrl + '\'' +
//            ", activated='" + activated + '\'' +
//            ", langKey='" + langKey + '\'' +
//            ", activationKey='" + activationKey + '\'' +
//            "}";
//    }
}
