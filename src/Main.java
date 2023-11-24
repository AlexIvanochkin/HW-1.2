//Задание №2. Бонусы от оператора


public class Main {

    public static void main(String[] args) {


        int initialAccount = 777; // Начальный счет клиента

        int accountReplenishmentAmount = 500; // Сумма пополнения

        int amountAfterReplenishment = (initialAccount + accountReplenishmentAmount); // Сумма после пополнения

        int conditionsForReceivingBonuses = 100; // Условия для получения бонусов

        int amountAsAGift = 1; // Рублей в подарок

        int numberOfBonusesAsAGifts = (amountAfterReplenishment / 100); // Количество бонусов, которые получит клиент

        int totalAmount = (initialAccount + accountReplenishmentAmount + numberOfBonusesAsAGifts); // Итоговая сумма на счету после получения бонусов

        if (amountAfterReplenishment >= 1000) {

            System.out.println("Количество бонусных рублей:");

            System.out.println(numberOfBonusesAsAGifts);

            System.out.println("Итоговая сумма на счету:");

            System.out.println(totalAmount);


        } else {

            System.out.println("Количество бонусных рублей:");

            System.out.println("0");

            System.out.println("Итоговая сумма на счету:");

            System.out.println(amountAfterReplenishment);


        }

    }

}

