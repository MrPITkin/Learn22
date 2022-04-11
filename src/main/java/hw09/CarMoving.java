package hw09;

import java.util.Random;

public class CarMoving {

    public static void main(String[] args) {
        char testo = 'Ё';
        System.out.printf("write русскую букову \"%s\".\n", testo);

        int minLimit = 3; // минимальное число тачек
        int maxLimit = 7; // минимальное число тачек
        float distance = 987.65f; // требуемая дистанция
        PassengerCar[] car = new PassengerCar[autoQuantity(minLimit, maxLimit)];
        System.out.printf("Автопарк легковушек состоит из %d тачек.\n", car.length);
        passingerArray(minLimit, maxLimit, car); // наполнение автопарка легковушек
        carRace(car, distance); // в дорогу
    }

    private static void passingerArray(int minLimit, int maxLimit, Automobile[] car) {
        for (int i = 0; i < car.length; i++) {
            float probeg = new Random().nextFloat(98.76f);
            car[i] = new PassengerCar();
            car[i].move(probeg);
            System.out.printf("пробег легковушки %f км.\n", car[i].getWay());
        }
    }

    private static void carRace(Automobile[] car, float goal) {
        float currentWay = 0;
        do {
            for (int i = 0; i < car.length && currentWay < goal; i++) {
                currentWay += car[i].getWay();
                System.out.printf("Тачкa %d достигла отметки %f км.\n", i+1, currentWay);
            }
            System.out.printf("Весь автопарк проехал %f км.\n", currentWay);
        } while (currentWay < goal);
    }

    private static int autoQuantity(int minLimit, int maxLimit) {
        int quantity;
        do {
            quantity = new Random().nextInt(maxLimit)+1;
        } while (quantity < minLimit);
        return quantity;
    }
}
