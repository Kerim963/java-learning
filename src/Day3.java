public class Day3 {
    public static void main(String[] args) {
        int x = 20;
        int y = 7;

        int Sum = x + y;
        System.out.println("Сумма: " + Sum);
        int Difference = x - y;
        System.out.println("Разность: " + Difference);
        int Product = x * y;
        System.out.println("Произведение: " + Product);
        int Quotient = x / y;
        System.out.println("Частное: " + Quotient);
        int Percent = x % y;
        System.out.println("Процент: " + Percent);


        int a = 10;
        int b = 10;
        int c = 15;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
        System.out.println("a > c: " + (a > c));
        System.out.println("a < c: " + (a < c));

        System.out.println("b == c: " + (b == c));
        System.out.println("b != c: " + (b != c));
        System.out.println("b > c: " + (b > c));
        System.out.println("b < c: " + (b < c));


        int age = 19;
        boolean hasLicense = true;
        System.out.println("Может водить: " + (age >= 18 && hasLicense));
        System.out.println("Нужно учиться: " + (age < 18 || !hasLicense));


        int score = 100;
        score +=50;
        System.out.println("После +=50: " + score);
        score -=30;
        System.out.println("После -=30: " + score);
        score *=2;
        System.out.println("После *=: " + score);
        score /=4;
        System.out.println("После /=: " + score);


        int counter = 0;
        System.out.println("Начало: " + counter);
        counter++;
        System.out.println("После ++: " + counter);
        counter--;
        System.out.println("После --: " + counter--);


        int temperature = 25;
        String weather = (temperature > 20) ? "тепло" : "Холодно";
        System.out.println("Погода " + weather);

        System.out.println(2 + 3 * 4);
        System.out.println((2 + 3) * 4);
        System.out.println(10 - 4 + 2);
        System.out.println(10 - (4 + 2));
        System.out.println(2 + 3 > 4);
        System.out.println(5 == 5 && 3 > 2);
        System.out.println(!(5 > 3));






    }
}
