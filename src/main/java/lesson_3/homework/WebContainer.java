package lesson_3.homework;

import lesson_3.homework.abc.Category;
import lesson_3.homework.interfaces.Element;

import java.util.ArrayList;
import java.util.List;

public class WebContainer extends Category implements Element {
    protected String type = "WebContainer";
    private final List<Category> obj_list = new ArrayList<>();

    WebContainer(int width, int height) {
        super(width, height, "No name", "Созданный объект Контейнер");
    }

    WebContainer(int width, int height, String name) {
        super(width, height, name, "Созданный объект Контейнер");
    }

    WebContainer(int width, int height, String name, String iconDescription) {
        super(width, height, name, iconDescription);
    }

    public void add_obj(Category obj) {
        this.obj_list.add(obj);
    }

    public  List<Category> show_obj_list() {
        return this.obj_list;
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
