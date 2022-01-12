package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryMapperTest {

    public static final String NAME = "Ludovit";
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    void categoryToCategoryDTO() {

        Category category = new Category();
        category.setName(NAME);
        category.setId(1L);

        // When
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        // Then
        assertEquals(Long.valueOf(1L), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());

    }
}