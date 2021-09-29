package com.nus.shopit.service.dto;

import com.nus.shopit.domain.Category;

/**
 * A DTO representing a user, with only the public attributes.
 */
public class CategoryDTO {

    private Long categoryId;

    private String categoryName;
    
    private String categoryDescription;

    public CategoryDTO() {
        // Empty constructor needed for Jackson.
    }

    public CategoryDTO(Category category) {
        this.categoryId = category.getId();
        // Customize it here if you need, or not, firstName/lastName/etc
        this.categoryName = category.getCategoryName();
        
        this.categoryDescription = category.getCategoryDescription();
    }

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
        return "CategoryDTO{" +
            "id='" + categoryId + '\'' +
            ", categoryName='" + categoryName + '\'' +
            ", categoryDescription='" + categoryDescription + '\'' +
            "}";
    }
}
