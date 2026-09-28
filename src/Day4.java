import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("Как тебя зовут?: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "! Добро Пожаловать в Java!");
        System.out.print("Сколько тебе лет? ");
        byte age = scanner.nextByte();
        System.out.println("Тебе " + age +" лет. Через год будет "+ (age+1));
        */

        /*
        System.out.print("Введи первое число: ");
        byte num1 = scanner.nextByte();
        System.out.print("Введите второе число: ");
        byte num2 = scanner.nextByte();
        System.out.println("Сумма: "+ (num1 + num2));

        System.out.print("Оценка 1: ");
        double num11 = scanner.nextDouble();
        System.out.print("Оценка 2: ");
        double num22 = scanner.nextDouble();
        System.out.print("Оценка 3: ");
        double num33 = scanner.nextDouble();
        System.out.println("Средний балл: "+ ((num11 + num22 + num33)/3));
        */



        /*
        System.out.print("Как тебя зовут?: ");
        String name1 = scanner.nextLine();
        System.out.println("Привет, " + name1);
        System.out.print("Сколько тебе лет? ");
        byte age1 = scanner.nextByte();
        System.out.println(name1 + ", Тебе " + age1 +" лет.");



        System.out.print("Сколько тебе лет? ");
        byte age11 = scanner.nextByte();
        scanner.nextLine();
        System.out.print("Как тебя зовут?: ");
        String name11 = scanner.nextLine();
        System.out.println(name11 + ", Тебе " + age11 +" лет.");
        */




        /*System.out.print("Ширина Прямоугольника: ");
        double a = scanner.nextDouble();
        System.out.print("Длина Прямоугольника: ");
        double b = scanner.nextDouble();
        System.out.println("Площадь: " + (a * b) + "\n" + "Периметр: " + (2 * (a +b)));
        */


        System.out.print("Ваше Имя: ");
        String name111 = scanner.nextLine();
        System.out.print("Ваш Город: ");
        String city = scanner.nextLine();
        System.out.print("Ваш Возраст: ");
        byte age111 = scanner.nextByte();
        System.out.print("Ваш рост: ");
        double height = scanner.nextDouble();
        System.out.print("Ваша любимая цифра: ");
        int number = scanner.nextInt();
        System.out.println("=== АНКЕТА ===" +"\n" + "Имя: " + name111 +"\n"+ "Город: " + city +"\n"+ "Возраст: " + age111 +"\n"+ "Рост: " + height + " м." +"\n"+ "Любимая цифра: " + number);







    }
}

