package HomeWork3_ZhuravlevD;

/*      1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        2. Задача:
        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        Для хранения фруктов внутри коробки можно использовать ArrayList;
        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
        которую подадут в compare() в качестве параметра. true – если их массы равны, f
        alse в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
        которые были в первой;
        Не забываем про метод добавления фрукта в коробку.

 */

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        Object[] array = new Object[]{2,5};
        swapObj(array,0,1);
        System.out.println("Результат замены двух эллементов в массиве: " + Arrays.toString(array));

        Box<Apple> appleBox = new Box<Apple>(new ArrayList());
        appleBox.getBox().add(new Apple());
        appleBox.getBox().add(new Apple());
        appleBox.getBox().add(new Apple());
        appleBox.getBox().add(new Apple());
        appleBox.getBox().add(new Apple());

        System.out.println("Вес коробки №1 с яблоками    : " + appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        orangeBox.getBox().add(new Orange());
        orangeBox.getBox().add(new Orange());
        orangeBox.getBox().add(new Orange());

        System.out.println("Вес коробки с Апельсинами    : " + orangeBox.getWeight());


        System.out.println("Сравнение коробки с яблоками и апельсинами :" + appleBox.compare(orangeBox));

        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        appleBox1.getBox().add(new Apple());
        appleBox1.getBox().add(new Apple());
        appleBox1.getBox().add(new Apple());

        System.out.println("Вес коробки №2 с яблоками    : " + appleBox1.getWeight());

        appleBox.emptyTo(appleBox1);
        System.out.println("Теперь вес коробки №1 с яблоками    : " + appleBox.getWeight());
        System.out.println("А вес коробки №2 с яблоками         : " + appleBox1.getWeight());
        
    }
    static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }
}

