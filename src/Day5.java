import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача 1
        int a = 42;
        double b = 3.14159;
        String c = "Java";
        boolean d = true;
        char e = 'X';
        System.out.printf("Целое: %d%n" + "Дробное: %.2f%n" + "Строка: %s%n" + "Логическое: %b%n" + "Символ: %c%n", a, b, c, d, e);


        //Задача 2
        double price1 = 199.99;
        double price2 = 45.50;
        double price3 = 1234.567;
        System.out.printf("Цена 1: %.2f%n" + "Цена 2: %.2f%n" + "Цена 3: %.3f%n", price1, price2, price3);


        //Задача 3
        double aa = 10.5;
        double bb = 3.7;
        double sum = aa + bb;
        double dif = aa - bb;
        double prod = aa * bb;
        System.out.printf("Сумма: %.2f%n" + "Разность: %.2f%n" + "Произведение: %.2f%n", sum, dif, prod);



        //Задача 4
        String name1 = "Аня";
        String name2 = "Керим";
        String name3 = "Абдулла";
        String name4 = "Ева";
        int age1 = 22;
        int age2 = 19;
        int age3 = 25;
        int age4 = 20;
        System.out.printf("%-15s%5d%n" + "%-15s%5d%n" + "%-15s%5d%n" + "%-15s%5d%n", name1, age1, name2, age2, name3, age3, name4, age4 );




        //Задача 5
        System.out.print("Введи число: ");
        int number = scanner.nextInt();
        if (number %2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }


        //Задача 6
        System.out.print("Баллы: ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("Оценка: 5");
        } else if (score >=70) {
            System.out.println("Оценка: 4");
        } else if (score >=50) {
            System.out.println("Оценка: 3");
        } else {
            System.out.println("Оценка: 2");
        }


        //Задача 7
        System.out.print("Введите число ");
        int number1 = scanner.nextInt();
        if (number1 >0) {
            System.out.println("Положительное");
        } else if (number1 <0) {
            System.out.println("Отрицательное");
        }else {
            System.out.println("Ноль");
        }
        scanner.nextLine();


        //Задача 8
        System.out.print("Ты изучаешь Java? ");
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            System.out.println("Отлично! Продолжай!");
        }else if (answer.equals("нет")) {
            System.out.println("Удачи начать!");
        }



        System.out.print("Сумма: ");
        double pay = scanner.nextDouble();
        System.out.print("Чаевые: ");
        int perscent1 = scanner.nextInt();
        double sum1 = (pay * perscent1)/100;
        pay = sum1 + pay;
        System.out.println("Итого: " + pay);

        scanner.nextLine();

        System.out.print("Ваш пол: ");
        String mf = scanner.nextLine();
        System.out.print("Ваш возраст: ");
        int age11 = scanner.nextInt();
        if (mf.equals("Муж")) {
            if (age11 >= 63) {
                System.out.println("Ты можешь выйти на Пенсию");
            } else {
                int diff = 63 - age11;
                System.out.printf("Тебе еще рано, подожди %d", diff);
            }
        }else if (mf.equals("Жен")) {
            if (age11 >= 58) {
                System.out.println("Ты можешь выйти на Пенсию");
            } else {
                int diff = 58 - age11;
                System.out.printf("Тебе еще рано, подожди %d", diff);
            }
        }


    }
}
