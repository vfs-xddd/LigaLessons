package lesson_2.homework;

import lesson_3.homework.Element;

public class SearchField implements Element {

    private String value = "";

    SearchField() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        System.out.println("Вводим значение \"" + value + "\" в поисковую строку");
    }

    public void clickOnSearchButton() {
        System.out.println("Нажимаем на кнопку поиска");
    }

    @Override
    public String getType() {
        return "Search input field";
    }

    @Override
    public void click() {
        System.out.println("Нажимаем на строку ввода поискового запроса");
    }
}
