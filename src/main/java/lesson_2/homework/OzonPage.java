package lesson_2.homework;

public class OzonPage {

    private SearchField searchField;

    private OzonPage() {
        searchField = new SearchField();
    }

    public static OzonPage getPage() {
        return new OzonPage();
    }

    public void search(String query) {
        searchField.click();
        searchField.setValue(query);
        searchField.clickOnSearchButton();
    }

    public int getProductCountOfAllCategories() {
        return 398709;
    }
}
