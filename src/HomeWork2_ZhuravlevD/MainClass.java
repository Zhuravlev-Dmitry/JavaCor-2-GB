package HomeWork2_ZhuravlevD;

/* 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
MyArrayDataException и вывести результат расчета.
 */

public class MainClass {


    public static void arrayMethod(String[][] array) {
        try {
            if (array.length != 4) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException MyArraySizeException) {
            System.out.println("Вы создали массив неверного размера!");
        }

        int sum = 0;
           for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException MyArrayDataException){
                        System.out.println("В ячейке ["+ i +","+ j + "] лежат неверные данные! :" + array[i][j]);
                }
            }
            }
        System.out.println("Результаты расчета : " + sum);
    }

    public static void main(String[] args) {
        // Создал массив с неверными данными, для проверки всех исключений.
        arrayMethod(new String[][]{{"1","2","3","4"},{"1","g","6","4"},{"1","l","3","4"}});

    }
}


