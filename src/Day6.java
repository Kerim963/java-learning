import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        
        //Задача 1. Логические операторы
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a < b && b < c);
        System.out.println(a > b || b < c);
        System.out.println(a == b);
        System.out.println(a < b && b > c);
        System.out.println(a == 10 || b == 100 || c == 30);
        System.out.println((a < b && b < c) || (a > c));


        //Задача 2. Классический switch
        System.out.print("Введи день недели (1-7): ");
        int dayName = scanner.nextInt();
        switch (dayName) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочий день.");
                break;
            case 6:
            case 7:
                System.out.println("Выходной.");
                break;
            default:
                System.out.println("Неверный день.");
        }
        //Задача 3. Современный switch
        System.out.print("Выберите день недели: ");
        int day = scanner.nextInt();
        String dayName1 = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Неверный день";
        };
        System.out.println("День: " + dayName1);


        //Задача 4. Мини-калькулятор
        System.out.print("Первое число: ");
        double num31 = scanner.nextInt();
        System.out.print("Второе число: ");
        double num32 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Операция (+, -, *, /): ");
        String operation = scanner.nextLine();
        double result = switch (operation) {
            case "+" -> num31 + num32;
            case "-" -> num31 - num32;
            case "*" -> num31 * num32;
            case "/" -> {
                if (num32 == 0) {
                    System.out.println("Деление на ноль невозможно");
                    yield 0;
                }
                yield num31 / num32;
            }
            default -> 0;
        };
        System.out.printf("Результат: %.2f%n%n", result);


        //Задача 5. Сезон по месяцу
        System.out.print("Месяц: ");
        int numMonth = scanner.nextInt();
        String season = switch (numMonth) {
            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Неверный месяц";
        };
        System.out.printf("Сезон: %s%n%n", season);


        //Задача 6. Проверка возраста с && и ||
        System.out.print("Ваш возраст: ");
        int age6 = scanner.nextInt();
        System.out.print("Разрешение родителей: ");
        boolean hasPermission = scanner.nextBoolean();
        if (age6 >= 18) {
            System.out.println("Доступ разрешен");
        }else if (age6 <=17 && age6 >= 14 && hasPermission) {
            System.out.println("Доступ с разрешения родителей");
        }else {
            System.out.println("Доступ запрещен.");
        }



        //Задача 7. Оценка буквой
        System.out.print("Ваши Баллы: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Некорректные баллы");
        } else {
            int grade = score / 10;
            String finScore = switch (grade) {
                case 10, 9 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                case 6 -> "D";
                case 5 -> "F";
                default -> "Некорректные баллы";
            };
            System.out.printf("Ваша Оценка: %s%n%n", finScore);
        }


        //Задача 8. Меню программы
        System.out.printf("=== МЕНЮ ===%n1. Привет%n2. Пока%n3. Помощь%n0. Выход%n");
        System.out.print("Ваш выбор: ");
        int chose = scanner.nextInt();
        String answer = switch (chose) {
            case 1 -> "Привет, Керим!";
            case 2 -> "Пока! Удачи тебе в учёбе.";
            case 3 -> "Это тестовое меню для практики";
            case 0 -> "Выход из программы";
            default -> "неизвестная команда";

        };
        System.out.printf("%s%n%n", answer);


        //Задача 9. Календарь
        System.out.print("Номер месяца: ");
        int num91 = scanner.nextInt();
        System.out.print("Год: ");
        int year = scanner.nextInt();
        int days = switch (num91) {
            case 1, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 29;
            default -> 0;
        };
        System.out.printf("В месяце %d - %d дней", num91, days);


        scanner.close();
    }

}
