package HomeWork4_ZhuravlevD;
/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер
 телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
 */
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {

        System.out.println("Первое задание : ");
        String[] words = new String[]{"File","Edit","View","Navigation","Code","File","Help","Code","View","Run"};
        System.out.println(Arrays.toString(words));

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.get(word) == null){
                map.put(word,1);
            }
            else {
                map.put(word, map.get(word) + 1);
            }
        }
        System.out.println(map);

        System.out.println("Второе задание : ");

        Phones phones = new Phones();
        phones.add("Ivanov","34535345");
        phones.add("Ivanov","57654754");
        phones.add("Petrov","65475435");
        phones.add("Volkov","65475435");
        phones.add("Haritonov","65475435");


        phones.get("Ivanov");
        phones.get("Volkov");




    }

}
