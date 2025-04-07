package com.example.usermanagement.model;

/**
 * 菜品类别枚举
 */
public enum DishCategory {
    MAIN_COURSE("主菜"),    // 主菜
    APPETIZER("开胃菜"),    // 开胃菜
    DESSERT("甜点"),       // 甜点
    BEVERAGE("饮品"),      // 饮品
    SIDE_DISH("配菜");     // 配菜

    private final String displayName;

    DishCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
} 