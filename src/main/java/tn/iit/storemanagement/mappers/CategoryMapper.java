package tn.iit.storemanagement.mappers;

import tn.iit.storemanagement.domain.Category;
import tn.iit.storemanagement.dto.CategoryDto;

public class CategoryMapper {
    public static CategoryDto categoryToCategoryDto(Category category)
    {
        CategoryDto categoryDto = new CategoryDto ();
        categoryDto.setId (category.getId ());
        categoryDto.setName (category.getName ());
        return categoryDto;
    }

    public static Category categoryDtoToCategory(CategoryDto categoryDto)
    {
        Category category = new Category ();
        category.setId (categoryDto.getId ());
        category.setName (categoryDto.getName ());
        return category;
    }
}
