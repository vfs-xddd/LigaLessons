package lesson_2.homework;

import lesson_3.homework.Category;

public class CatalogCategory extends Category {

    private String name;

    private CatalogCategory(String name) {
        this.name = name;
    }

    static CatalogCategory getCategory(String name) {
        return new CatalogCategory(name);
    }

    @Override
    public void open() {
        System.out.println("Наводим курсор мыши на категорию: " + name);
        System.out.println("Категория " + name + " развернута");
    }
}
