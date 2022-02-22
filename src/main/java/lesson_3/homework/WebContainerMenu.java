package lesson_3.homework;


import lesson_3.homework.abc.Category;
import lesson_3.homework.interfaces.MenuElem;

import java.util.ArrayList;
import java.util.List;

public class WebContainerMenu extends WebContainer{
    protected String type = "WebContainerMenu";
    private final List<MenuElem> obj_list = new ArrayList<>();

    WebContainerMenu(int width, int height) {
        super(width, height, "No name", "Созданный объект Контейнер элементов меню");
    }

    WebContainerMenu(int width, int height, String name) {
        super(width, height, name, "Созданный объект Контейнер элементов меню");
    }

    WebContainerMenu(int width, int height, String name, String iconDescription) {
        super(width, height, name, iconDescription);
    }

//    public void add_obj(MenuElem obj) {
//        this.obj_list.add(obj);}

}
