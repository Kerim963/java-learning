import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        /*
         === Объявление и создание массива. ===
         Три способа:
         1. Пустой массив на 5 ячеек (Значение по умолчанию)
         int[] numbers = new int[5];

         2. Массив с указанием Значений
         int[] numbers = {2, 3, 5, 7, 11};

         3. Комбинированный (полезно при передаче в Метод)
         int[] numbers = new int[]{2, 4, 6, 8}

         !!! ЗАМЕТКА(1):
         Массив нельзя создать на будущее
         int[] num = new int[]; - ОШИБКА


         === Индексация, Чтение и Запись ===
            int[] num = {10, 20, 30, 40, 50};
         Индекс (ячейка): 0   1   2   3   4

         System.out.println(num[0]); - первый индекс (10)
         System.out.println(num[4]); - последний индекс (50)

         num[2] = 99;                - записали в ячейку 2 новое значение (99)
         System.out.println(num[2]); - выдаст 99, вместо 30

         !!! ЗАМЕТКА(2):
         num[num.length-1] - последний элемент


         === Обход Массива ===
         1. Классический for с Индексом - когда нужен номер Элемента:
         int[] num = {10, 20, 30};
         for (int i = 0; i < num.length; i++) {
             System.out.println("num[" + i + "] = " + num[i]);
         }

         2. for-each (enhanced for) - когда нужен только сам элемент, без Индекса:
         int[] num = {10, 20, 30};
         for (int value : num) {
             System.out.println(value);
         }

         !!! ЗАМЕТКА(3):
         Полезный Класс - import java.util.Arrays;
         Даёт Методы:
         - Arrays.toString(arr) - превращает Массив в строку [1, 2, 3], удобно для печати
         - Arrays.sort(arr)     - Сортирует по возрастанию (меняет исходный)
         - Arrays.fill(arr, 0)  - Заполняет все ячейки значением
         - Arrays. copyOf(arr, n) - копия первых n элементов
         - Arrays.equals(a, b)  - Сравнивает содержимое двух массивов (А не ссылки)


         !!! ЗАМЕТКА(4):

         System.out.println(num) - ОШИБКА, так ка "num" это ссылка на Массив, а не содержимое Массива
         System.out.println(Array.toString(num));
         */

        //Практика 1-2: Создание Массива и его Вывод в Терминале
        int[] numbers = new int[5];
        double[] temps = new double[3];
        boolean[] flags = new boolean[2];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(temps));
        System.out.println(Arrays.toString(flags));

        //Практика 3: Вывод определенных элементов и Замена некоторых.
        int[] numbers3 = {10, 20, 30, 40, 50};
        System.out.println(numbers3[0]);
        System.out.println(numbers3[numbers3.length - 1]);

        numbers3[2] = 999;
        System.out.println(numbers3[2]);

        //Практика 4: Вывод ДЛИНЫ Массива и Строки.
        int[] numbers4 = {5, 10, 15, 20};
        String word = "Java";

        System.out.println("Длина Массива: " + numbers4.length);
        System.out.println("Длина Строки: " + word.length());

        //Практика 5: Сканер и вывод значения по Индексу
        int[] numbers5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс (0-2): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < numbers5.length) {
            System.out.println("Элемент: " + numbers5[index]);
        } else {
            System.out.println("Неверный Индекс. Допустимо от 0 до " + (numbers5.length - 1));
        }

        //Практика 5: for и for-each
        int[] numbers6 = {3, 7, 1, 9, 4};
        //for
        for (int i = 0; i < numbers6.length; i++) {
            System.out.println("Индекс: " + i + " Значение: " + numbers6[i]);
        }

        //for-each
        for (int kerim : numbers6) {
            System.out.println(kerim);
        }

        //Умножение на 2
        for (int i = 0; i < numbers6.length; i++) {
            numbers6[i] = numbers6[i] * 2;
        }
        System.out.println(Arrays.toString(numbers6));

        //Практика 7: Утилиты java.util.Arrays;
        int[] numbers7 = {5, 2, 8, 1, 9, 3};
        Arrays.sort(numbers7);
        System.out.println(Arrays.toString(numbers7));

        int[] copy = Arrays.copyOf(numbers7, 3);
        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.equals(numbers7, copy));

        //Практика 8: Массив Строк
        String[] names8 = {"Аня", "Борис", "Вера", "Аня"};
        int count = 0;

        for (String kerim : names8) {
            System.out.println(kerim);
            if (kerim.equals("Аня")) {
                count++;
            }
        }
        System.out.println("Аня встречается " + count + " раз");

        //Практика 9: Сумма, Среднее, МИН и МАКС
        int[] numbers9 = {7, 2, 9, 4, 11, 6};
        int sum = 0;
        int min = numbers9[0];
        int max = numbers9[0];

        for (int kerim : numbers9) {
            sum += kerim;
            if (kerim < min) min = kerim;
            if (kerim > max) max = kerim;
        }

        double average = (double) sum / numbers9.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);

        //Разворот Массива
        int[] numbers10 = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers10.length / 2; i++) {
            int j = numbers10.length - 1 - i;
            int temp = numbers10[i];
            numbers10[i] = numbers10[j];
            numbers10[j] = temp;
        }
        System.out.println(Arrays.toString(numbers10));

        //Подсчёт четных
        int[] numbers11 = {5, 2, 8, 1, 9, 3, 4};
        int evenCount = 0;
        for (int kerim : numbers11) {
            if (kerim % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Чётных: " + evenCount);

    }
}
