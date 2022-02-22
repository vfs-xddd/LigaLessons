package lesson_3.homework;

import lesson_3.homework.abc.Category;
import lesson_3.homework.interfaces.Element;
import lesson_3.homework.interfaces.SearchField;

public class SearchFeild extends Category implements Element, SearchField {
    protected String type = "SearchFeild";
    protected int search_field_width = 10;
    protected int search_field_height = 10;

    SearchFeild(int width, int height) {
        super(width, height, "No name", "Созданный объект Строка поиска");
    }

    SearchFeild(int width, int height, String name) {
        super(width, height, name, "Созданный объект Строка поиска");
    }

    SearchFeild(int width, int height, String name, String iconDescription) {
        super(width, height, name, iconDescription);
    }

    SearchFeild(int width, int height, String name, String iconDescription, String source) {
        super(width, height, name, iconDescription, source);
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
        System.out.println("клик, курсор установлен в строку поиска");
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
