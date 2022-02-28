package lesson_6;

import java.util.*;
import java.util.stream.Collectors;

public class Tests {
    public static void main(String[] args) {
        //test_1();
        //test_2();
        //test_3();
        //test_4();
        //test_5();
        //test_6();
        //test_7();
        //test_8();
        //test_9();
    }

    /**
     * Получить List чисел в виде текстовых элементов
     */
    public static void test_1() {
        List<Integer> integerList = getIntList();
        List<String> stringList = integerList.stream().map(Object::toString).toList();
        System.out.println(stringList);
    }

    /**
     * Отсортировать список по убыванию
     */
    public static void test_2() {
        List<Integer> integerList = getIntList();
        integerList.sort(Comparator.reverseOrder());
        System.out.println(integerList);
    }

    /**
     * Получить одну строку текста. Каждый элемент должен начинаться с текста "Number - ".
     * Элементы должны разделяться запятой и пробелом.
     * В начале итоговой строки должен быть текст "Number list: "
     * В конце итоговой строки должен быть текст "end of list.".
     */
    public static void test_3() {
        List<String> stringList = getStringList();
        String newString = stringList.stream()
                .map(el -> el.replace(el, "Number - " + el))
                .collect(Collectors.joining(", "));

        System.out.println(newString);
    }

    /**
     * Получить мапу со значениями, ключи которых больше трех и меньше девяти
     */
    public static void test_4() {

        Map<Integer, String> map = getMap();
        Map <Integer, String> newMap = map.entrySet().stream()
                .filter(entry -> entry.getKey()>3 & entry.getKey()<9)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(newMap);
    }

    /**
     * Перемешать все элементы в мапе.
     * Пример результата:
     * Элемент 1: ключ - 5, значение "five"
     * Элемент 2: ключ - 7, значение "seven"
     * Элемент 3: ключ - 2, значение "two"
     * и так далее.
     */
    public static void test_5() {
        Map<Integer, String> map = getMap();
        ArrayList<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        Collections.shuffle(list);

        Map<Integer, String> newMap = new LinkedHashMap<>();
        list.forEach(key -> newMap.put(key.getKey(), key.getValue()));
        System.out.println(newMap);
    }

    /**
     * Установить во всех элементах isDisplayed = true, и оставить в списке только элементы с value NULL.
     */
    public static void test_6() {
        List<WebElement> elements = getElements();
        List<WebElement> newList = elements.stream()
                .peek(el -> el.setDisplayed(true))
                .filter(el -> el.getValue() == null)
                .toList();
        System.out.println(newList);
    }

    /**
     * Инвертировать isDisplayed параметр каждого элемента и отсортировать список по типу элемента
     * со следующим приоритетом:
     * 1. TEXT
     * 2. INPUT_FIELD
     * 3. CHECKBOX
     * 4. BUTTON
     * 5. RADIO_BUTTON
     * 6. IMAGE
     */
    public static void test_7() {
        List<WebElement> elements = getElements();

                List <WebElement> newList = elements.stream()
                .peek(el -> el.setDisplayed(!el.isDisplayed()))
                .sorted(Comparator.comparingInt((WebElement w) -> w.getType().ordinal()))
                .toList();
        System.out.println(newList);
    }

    /**
     * Создать мапу:
     * ключ - текст
     * значение - тип элемента
     */
    public static void test_8() {
        List<WebElement> elements = getElements();
        ArrayList <AbstractMap.SimpleEntry<String, Type>> newEntry = new ArrayList<>();
        elements.forEach(el -> newEntry
                .add(new AbstractMap.SimpleEntry<>(el.getText(), el.getType())));
        System.out.println(newEntry);
    }

    /**
     * Получить список элементов, у которых текст или значение оканчивается на число от 500 и более.
     * И отсортировать по увеличению сначала элементы с текстом, а затем по убыванию элементы со значением.
     */
    public static void test_9() {
        List<WebElement> elements = getElements();

        List<WebElement> newList = elements.stream()
                .filter(el -> el.getText() != null && Integer.parseInt(el.getText().substring(16))>=500)
                .sorted((WebElement w1, WebElement w2) -> {
                    if (w1.getText()== null & w2.getText()== null) {return 0;}
                    if (w1.getText()== null) {return -1;}
                    if (w2.getText()== null) {return 1;}
                    int compare1 = w1.getText().compareTo(w2.getText());
                    if (compare1==0) {
                        if (w1.getValue()== null & w2.getValue()== null) {return 0;}
                        if (w1.getValue()== null) {return -1;}
                        if (w2.getValue()== null) {return 1;}
                        return w1.getValue().compareTo(w2.getValue());}
                    return compare1;})
                .toList();
        System.out.println(newList);

    }

    public static Map<Integer, String> getMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        return map;
    }

    public static List<String> getStringList() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("one");
        list.add("nine");
        list.add("ten");
        return list;
    }

    public static List<Integer> getIntList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        return list;
    }

    public static List<WebElement> getElements() {
        List<WebElement> result = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            result.add(new WebElement());
        }
        return result;
    }
}
