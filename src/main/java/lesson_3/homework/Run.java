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

    }
}
