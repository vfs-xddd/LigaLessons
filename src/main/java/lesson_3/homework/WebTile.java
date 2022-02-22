package lesson_3.homework;

import lesson_3.homework.abc.Category;
import lesson_3.homework.interfaces.Element;

public class WebTile extends Category implements Element {
    protected String type = "Tile";

    WebTile(int width, int height) {
        super(width, height, "No name", "Созданный объект Плитка");
    }

    WebTile(int width, int height, String name) {
        super(width, height, name, "Созданный объект Плитка");
    }

    WebTile(int width, int height, String name, String iconDescription) {
        super(width, height, name, iconDescription);
    }

    WebTile(int width, int height, String name, String iconDescription, String source) {
        super(width, height, name, iconDescription, source);
    }

    WebTile(int width, int height, String name, String iconDescription, String source, String background_img_source) {
        super(width, height, name, iconDescription, source);
        this.set_background_img(background_img_source);
    }

    @Override
    public void status() {
        System.out.println("On Page");
    }


    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void on_click() {
        System.out.println(this.type + "." + this.name + ": клик, открываю ресурс: " + this.source);
    }

    @Override
    public void on_focus() {
        System.out.println(this.type + "." + this.name + ": в фокусе, показываю описание - " + this.get_iconDescription());
    }

    @Override
    public void if_Active() {

    }

    @Override
    public void if_inActive() {

    }
}
