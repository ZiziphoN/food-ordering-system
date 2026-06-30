package com.jumpstart.food_ordering_system.service;

import com.jumpstart.food_ordering_system.dto.MenuDto;
import com.jumpstart.food_ordering_system.entity.Category;
import com.jumpstart.food_ordering_system.entity.Menu;
import com.jumpstart.food_ordering_system.repository.MenuRepository;
import com.jumpstart.food_ordering_system.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository, CategoryRepository categoryRepository) {
        this.menuRepository = menuRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public MenuDto createMenu(MenuDto menuDto) {
        Category category = categoryRepository.findById(menuDto.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + menuDto.getCategoryId()));

        Menu menu = mapToEntity(menuDto, category);
        Menu savedMenu = menuRepository.save(menu);
        return mapToDto(savedMenu);
    }

    @Override
    public List<MenuDto> getAllMenus() {
        return menuRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MenuDto getMenuById(Long id) {
        Menu menu = menuRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu item not found with id: " + id));
        return mapToDto(menu);
    }

    private MenuDto mapToDto(Menu menu) {
        MenuDto dto = new MenuDto();
        dto.setId(menu.getId());
        dto.setName(menu.getName());
        dto.setDescription(menu.getDescription());
        dto.setPrice(menu.getPrice() != null ? menu.getPrice().doubleValue() : 0.0);
        dto.setImageUrl(menu.getImageUrl());
        if (menu.getCategory() != null) {
            dto.setCategoryId(menu.getCategory().getId());
        }
        return dto;
    }

    private Menu mapToEntity(MenuDto dto, Category category) {
        Menu menu = new Menu();
        menu.setId(dto.getId());
        menu.setName(dto.getName());
        menu.setDescription(dto.getDescription());
        menu.setPrice(dto.getPrice() != null ? java.math.BigDecimal.valueOf(dto.getPrice()) : java.math.BigDecimal.ZERO);
        menu.setImageUrl(dto.getImageUrl());
        menu.setCategory(category);
        return menu;
    }
}