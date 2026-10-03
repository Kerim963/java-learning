import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        === for ===
        for (начало; условие; шаг) {
         тело цикла;
         }

        начало - с чего начинаем (например, int i = 1)
        условие - пока истинно, крутимся (например, i <= 10)
        шаг - что делаем после каждой итерации (например, i++)

        Пример:
        for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        }

       По шагам:
       1. i = 1
       2. Проверка: 1 <= 10 -> true -> println(1)
       3. i++ -> i + 1 = 1 + 1 = 2
       4. Проверка: 2 <= 10 -> true -> println(2)
       5. ...
       6. i = 11
       7. Проверка: 11 <=10 -> false -> выход из цикла

       Терминал (Вывод):
       1
       2
       3
       ...
       10

       Обратный отсчёт:
       for (int i = 10; i >= 1; i--) {
       System.out.println(i);
       }

       Шаг = не по 1 (i++), а 2 (i+=2:
       for (int i = 1; i <= 10; i+=2) {
       System.out.println(i);
       }

      Сумма чисел от 1 до 100
      int sum = 0;
       for (int i = 1; i <= 100; i++) {
           sum += i;
       }
       System.out.println("Сумма: " + sum);


       === while ===
       начало;
       while (условие) {
       тело;
       шаг;
       }

       int i = 1;
       while (i <= 10) {
       System.out.println(i);
       i++;
       }

       !!! Приоритет имеет for для использования !!!

       === do-while ===
       начало;
       do {
       тело;
       } while (условие);

       (6 не подходит для условия (i <= 5), поэтому, будь это просто while, цикл бы прервался и ничего бы не выдалось в терминале, а так, из-за do тело выдается 1 раз и цикл прерывается)
       int i = 6;
        do {
            System.out.println("do-while: " + i);
        } while (i <= 5);



        Пример "МЕНЮ"
        System.out.println("Выбор команды: ");
        int выбор;
        do {
            System.out.println("1. Привет");
            System.out.println("2. Пока");
            System.out.println("0. Выход");
            System.out.print("Выбор:");
            выбор = scanner.nextInt();

            if (выбор == 1) System.out.println("Привет!");
            if (выбор == 2) System.out.println("Пока!");
        } while (выбор != 0);

        === break и continue ===
        break - выйти из цикла на этом моменте
        Например:
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;   //Цикл прервался на 1, 2, 3, 4. Так как условие i == 5.
            }
            System.out.println(i);
        }
        //Цикл прервался на 1, 2, 3, 4. Так как условие i == 5.

        //continue - пропустить итерацию
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;   //Пропускаем те, что делятся на 2 без остатка (i % 2 == 0). Т.е все Чётные
            }
            System.out.println(i);
        }


        //=== Вложенные циклы ===
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + "" + j + " ");
            }
            System.out.println();
        }
        //На каждое значение i прогоняются все значения j. Т.е на одно значение Внешнего цикла, прогоняются все значения внутреннего
        //Например:
        //Таблица Умножения:
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j );
            }
            System.out.println();
        }

        //Ёлочка:
        int n = 10;
        for (int i = 1; i <= n; i+=1) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        //Счётчик
        (Был счёт 0 (int счёт = 0). Начинаем наш цикл с числа 1 (int i = 1). Счёт получает +1 (счёт++) когда в цикле появляется число, которое делится на 3 без остатка (i % 3 == 0))
        Т.е: число 1 (%3 != 0), значит счёт не меняется и остается 0. Число 2 также. Число 3 подходит, поэтому счёт становится 1.
        int счёт = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) счёт++;
            System.out.println("Cчёт: " + счёт);
        }

        //Аккумулятор
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
           }
         */

        //Задача 1. От 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2. Обратный отсчёт
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%-3d", i);
        }
        System.out.println(" Поехали!");

        //Задача 3. Сумма от 1 до 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Сумма: " + sum);

        //Задача 4. Только чётные
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.printf("%-3d", i);
            }
        }

        System.out.println("\n");

        //Задача 5. Таблица Умножения на 7
        int i = 7;
        for (int k = 1; k <= 10; k++) {
            System.out.printf("%d * %d = %d%n", i, k, i * k);
        }
        System.out.println();

        //Задача 6. Факториал
        System.out.print("Введи n: ");
        int n = scanner.nextInt();
        long f = 1;
        for (int i1 = 1; i1 <= n; i1++) {
            f *= i1;
        }
        System.out.println(n + "!= " + f);

        //Задача 7. Сумма до нуля
        int sum1 = 0;
        while (true) {
            System.out.print("Введи число: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum1 += number;
        }
        System.out.println("Сумма: " + sum1);


        //Задача 8. Угадай число
        int secret = 0;
        int attemps = 0;  //Счётчик команд. Пока равен 0
        while (true) {
            System.out.print("Угадай число: ");
            int chose = scanner.nextInt();
            attemps++;             //+1 к счётчику Команд за каждый раз, когда Цикл запускается. А цикл запускается при каждом вводе Цифры.
            if (chose == 42) {
                break;
            } else if (chose > 42) {
                System.out.println("Меньше!");
            } else if (chose < 42) {
                System.out.println("Больше!");
            }
        }
        System.out.printf("Угадал за %d попыток%n", attemps);


        //Задача 9. Ёлочка
        int f2 = 6;
        for (int k = 1; k <= f2; k += 1) {
            for (int m = 1; m <= k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Задача 10. Обратная Ёлочка
        int f1 = 6;
        for (int k = f1; k >= 1; k--) {
            for (int m = k; m >= 1; m--) {
                System.out.print("*");
            }
            System.out.println();
        }


        //Задача 11. Таблица Умножения
        for (int i3 = 1; i3 <= 9; i3++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i3 * j);
            }
            System.out.println();
        }

        
    }
}
