public class Day2 {
    public static void main(String[] args){
        byte myByte = 100;
        System.out.println("byte: " + myByte);
        short myShort = 25000;
        System.out.println("short: " + myShort);
        int myInt = 850000;
        System.out.println("int: " + myInt);
        long myLong = 980000000L;
        System.out.println("long: " + myLong);
        float myFloat = 3.14f;
        System.out.println("float: " + myFloat);
        double myDouble = 3.14;
        System.out.println("double: " + myDouble);
        char myChar = 'K';
        System.out.println("char:" + myChar);
        boolean myBoolean = true;
        System.out.println("boolean: " + myBoolean);


        int a = 20;
        int b = 10;
        int Сумма = a + b;
        System.out.println("Сумма: " + Сумма);
        int Разность = a - b;
        System.out.println("Разность: " + Разность);
        int Произведение = a * b;
        System.out.println("Произведение: " + Произведение);
        int ЦелочисленноеДеление = a / b;
        System.out.println("ЦД: " + ЦелочисленноеДеление);
        int Остаток = a % b;
        System.out.println("Остаток: " + Остаток);
        int Деление = a / b;
        System.out.println("Деление " + Деление);


        String firstName = "Kerim";
        String lastName = "Mamilov";
        String fullName = firstName+" "+lastName;
        System.out.println("Полное Имя: " + fullName);


        double price = 199.99;
        int guantity = 3;
        double Итог = price * guantity;
        System.out.println("Итого: " + Итог);


        var city = "Москва";
        var population = 645000;
        var isCapital = true;
        System.out.println("Название Города: " + city);
        System.out.println("Популяция: " + population);
        System.out.println("Столица?: " + isCapital);


        final double PI = 3.14159;
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Площадь круга: " + area);


        char Symbol = 'K';
        System.out.println("Символ: " + Symbol);
        System.out.println("Код символа: " + (int) Symbol);






    }



}
