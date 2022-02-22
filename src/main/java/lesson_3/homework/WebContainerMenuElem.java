package lesson_3.homework;


import lesson_3.homework.abc.Category;
import lesson_3.homework.interfaces.Element;
import lesson_3.homework.interfaces.MenuElem;

public class WebContainerMenuElem extends Category implements Element, MenuElem {
    protected String type = "WebContainerMenuElem";
    protected String inputList;

    WebContainerMenuElem(int width, int height) {
        super(width, height, "No name", "Созданный объект Элемент меню");
        this.inputList = "Пустой список";
    }

    WebContainerMenuElem(int width, int height, String name) {
        super(width, height, name, "Созданный объект Элемент меню");
        this.inputList = "Пустой список";
    }

    WebContainerMenuElem(int width, int height, String name, String iconDescription) {
        super(width, height, name, iconDescription);
        this.inputList = "Пустой список";
    }
    WebContainerMenuElem(int width, int height, String name, String iconDescription, String inputList) {
        super(width, height, name, iconDescription);
        this.inputList = inputList;
    }
    @Override
    public void status() {
        System.out.println("On Page");
    }

    @Override
    public String getType() {
        return null;
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

    @Override
    public void show_my_list() {
        System.out.println("Разворачиваю свой список: " + inputList);
    }
}
