package lesson_3.homework;

public class Run {

    public static void main(String[] args){
        WebTile tile = new WebTile(100, 50, "Смартфоны", "Категории сматфонов", "http://smartphones");
        WebTile tile2 = new WebTile(500, 80);
        tile.status();
        System.out.println(tile.type);
        tile.show_description();
        tile.on_click();
        tile.on_focus();


    }
}
