package com.jumpstart.food_ordering_system.service;

import com.jumpstart.food_ordering_system.dto.MenuDto;
import java.util.List;

public interface MenuService {
    MenuDto createMenu(MenuDto dto);
    List<MenuDto> getAllMenus();
    MenuDto getMenuById(Long id);
}