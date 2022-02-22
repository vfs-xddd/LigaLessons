package lesson_3.homework;

public class Run {

    public static void main(String[] args){
        System.out.println("===Test WebTile===============================================");
        WebTile tile = new WebTile(100, 50, "Смартфоны", "Категории сматфонов", "http://smartphones");
        WebTile tile2 = new WebTile(500, 80);
        tile.status();
        System.out.println(tile.type);
        tile.show_description();
        tile.on_click();
        tile.on_focus();

        System.out.println("===Test WebContainer===============================================");
        WebContainer container = new WebContainer(1000, 200, "Контейнер поиска", "Контейнер для строки поиска и мюню поиска рядом");
        WebContainer container2 = new WebContainer(2000, 200, "Контейнер поиска2", "Контейнер для строки поиска и мюню поиска рядом");
        container.add_obj(tile);
        container.add_obj(tile2);
        container2.add_obj(tile);
        container.status();
        System.out.println(container.type);
        container.show_description();
        container.on_click();
        container.on_focus();
        System.out.println("Объекты в контейнере: " + container.show_obj_list());
        System.out.println("Объекты в контейнере: " + container2.show_obj_list());

        System.out.println("===Test WebContainerMenuElem===============================================");
        WebContainerMenuElem elem1 = new WebContainerMenuElem(100, 25, "Бытовая Техника", "Элемент меню <Бытовая ехника>");
        WebContainerMenuElem elem2 = new WebContainerMenuElem(100, 25, "Телевизоры", "Элемент меню <Телевизоры>", "Разные виды телевизоров");
        elem1.status();
        System.out.println(elem1.type);
        elem1.show_description();
        elem1.on_click();
        elem1.on_focus();
        elem1.show_my_list();
        elem2.show_my_list();

        System.out.println("===Test WebContainerMenu===============================================");
        WebContainerMenu container_menu = new WebContainerMenu(1000, 200, "Контейнер меню", "Контейнер для элементов меню");
        container_menu.add_obj(elem1);
        System.out.println("Объекты в контейнере: " + container_menu.show_obj_list());

        System.out.println("===Test SearchField===============================================");
        SearchFeild search_field1 = new SearchFeild(1000, 200, "Строка поиска", "Поиск");
        search_field1.status();
        System.out.println(search_field1.type);
        search_field1.show_description();
        search_field1.on_click();
        search_field1.on_focus();
        search_field1.find("Jocker");
    }
}
