package lesson_3.homework.abc;

public abstract class Category {
    protected String iconDescription;
    protected String name;
    protected int width = 0;
    protected int height = 0;
    protected int border = 1;
    protected int background_color = 16777215;

    public abstract void open();


    // getters $ setters default
    //=======================================================
    public int get_width(){
        return this.width;
    }

    public void set_width(int width) {
        this.width = width;
    }

    public int get_height(){
        return this.height;
    }

    public void set_height(int height) {
        this.height = height;
    }

    public int get_border(){
        return this.border;
    }

    public void set_border(int border) {
        this.border = border;
    }

    public int get_background_color(){
        return this.background_color;
    }

    public void set_background_color(int background_color) {
        this.background_color = background_color;
    }

    protected String get_name() {
        return this.name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    protected String get_iconDescription() {
        return this.iconDescription;
    }

    public void set_iconDescription(String iconDescription) {
        this.iconDescription = iconDescription;
    }
    //===============end getters & setters default block=========================================================


    public void show_name(){
        System.out.println(get_name());
    }

    public void show_description(){
        System.out.println(get_iconDescription());
    }
}
