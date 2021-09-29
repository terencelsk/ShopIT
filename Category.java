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

/**
 * A user.
 */
@Table("category")
public class Category {

    private static final long serialVersionUID = 1L;

    @Id
    private Long categoryId;

    @NotNull
    @Size(min = 1, max = 1000)
    private String categoryName;

    @NotNull
    @Size(min = 1, max = 1000)
    private String categoryDescription;

    public Long getId() {
        return categoryId;
    }

    public void setId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Category{" +
            "categoryName='" + categoryName + '\'' +
            ", categoryDescription='" + categoryDescription + '\'' +
            "}";
    }
}