package HomeWork5_ZhuravlevD;

import java.io.*;

/*
1. Реализовать сохранение данных в csv файл;
2. Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура csv файла:
| Строка заголовок с набором столбцов |
| Набор строк с целочисленными значениями |
| * Разделитель между столбцами - символ точка с запятой (;) |
Пример:
Value 1;Value 2;Value 3
100;200;123
300;400;500
Для хранения данных использовать класс вида:
public class AppData {
  private String[] header;
  private int[][] data;
 // ...
}
Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String[] header = new String[]{"Value1", "Value2", "Value3", "Value4"};
        int[][] intData = new int[][]{{457, 564, 123, 234}, {567, 789, 578, 478}, {456, 987, 758, 987}};

        AppData appData = new AppData(header, intData);
        String fileName = "appData.csv";

        File file = new File("src/HomeWork5_ZhuravlevD/appData.csv");
        file.createNewFile();
        if (!file.exists()) {
            throw new IOException("Файла не существует");
        }
        System.out.println("Файл <" + fileName + "> создан.");


        //Запись данных
        try (PrintWriter valueData = new PrintWriter(file)) {
            for (int i = 0; i < appData.getHeader().length - 1; i++) {
                valueData.print(appData.getHeader()[i] + "; ");
            }
            valueData.println(appData.getHeader()[appData.getHeader().length - 1]);

            for (int i = 0; i < appData.getData().length; i++) {
                for (int j = 0; j < appData.getData()[i].length - 1; j++) {
                    valueData.print(appData.getData()[i][j] + "; ");
                }
                valueData.println(appData.getData()[i][appData.getData()[i].length - 1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение файла
        System.out.println("Загрузка данных из csv файла : ...");
        char buffer[] = new char[200];

        FileInputStream fileInputStream = new FileInputStream(file);
        int tmp = 0;
        int iter = 0;
        while ((tmp = fileInputStream.read()) != -1) {
            buffer[iter] = (char) tmp;
            iter++;
        }

        // Метод вывода файла в консоль
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i]);
        }


    }


}
