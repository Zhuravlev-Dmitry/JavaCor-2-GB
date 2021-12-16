package HomeWork4_ZhuravlevD;

import java.util.ArrayList;
import java.util.HashMap;

public class Phones {
    HashMap <String, ArrayList<String>> phonebook = new HashMap<>();
    ArrayList<String> numbers = new ArrayList<>();


    public void add(String surname, String number) {
        if (phonebook.containsKey(surname)) {
            numbers = phonebook.get(surname);
            numbers.add(number);
            phonebook.put(surname, numbers);
        } else {
            numbers = new ArrayList<>();
            numbers.add(number);
            phonebook.put(surname, numbers);
        }
            }



    public void get(String surname){
            System.out.println("Фамилия : " + surname + ", Номер телефона : " + phonebook.get(surname));

    }


}
