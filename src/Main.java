//Задание №2. Бонусы от оператора


public class Main {

    public static void main(String[] args) {


        int x = 777; // Начальный счет клиента

        int y = 500; // Сумма пополнения

        int s = (x + y); // Сумма после пополнения

        int b = 100; // Условия для получения бонусов

        int m = 1; // Рублей в подарок

        int p = (s / 100); // Количество бонусов, которые получит клиент

        int n = (x + y + p); // Итоговая сумма на счету после получения бонусов

        if (s >= 1000) {

            System.out.println("Количество бонусных рублей:");

            System.out.println(p);

            System.out.println("Итоговая сумма на счету:");

            System.out.println(n);


        } else {

            System.out.println("Количество бонусных рублей:");

            System.out.println("0");

            System.out.println("Итоговая сумма на счету:");

            System.out.println(s);


        }

    }

}

