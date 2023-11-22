//Задание №2. Бонусы от оператора


public class Main {

    public static void main(String[] args) {


        int initial_account = 777; // Начальный счет клиента

        int account_replenishment_amount = 500; // Сумма пополнения

        int amount_after_replenishment = (initial_account + account_replenishment_amount); // Сумма после пополнения

        int conditions_for_receiving_bonuses = 100; // Условия для получения бонусов

        int mamount_as_a_gift = 1; // Рублей в подарок

        int number_of_bonuses_as_a_giftp = (amount_after_replenishment / 100); // Количество бонусов, которые получит клиент

        int total_amount = (initial_account + account_replenishment_amount + number_of_bonuses_as_a_giftp); // Итоговая сумма на счету после получения бонусов

        if (amount_after_replenishment >= 1000) {

            System.out.println("Количество бонусных рублей:");

            System.out.println(number_of_bonuses_as_a_giftp);

            System.out.println("Итоговая сумма на счету:");

            System.out.println(total_amount);


        } else {

            System.out.println("Количество бонусных рублей:");

            System.out.println("0");

            System.out.println("Итоговая сумма на счету:");

            System.out.println(amount_after_replenishment);


        }

    }

}

