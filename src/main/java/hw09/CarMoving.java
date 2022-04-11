package hw09;

import java.util.Random;

public class CarMoving {

    public static void main(String[] args) {
        char testo = 'Ё';
        System.out.printf("write русскую букову \"%s\".\n", testo);

        int minLimit = 3; // минимальное число тачек
        int maxLimit = 7; // минимальное число тачек
        float distance = 987.65f; // требуемая дистанция
        passingerArray(minLimit, maxLimit, distance); // наполнение автопарка легковушек
    }

    private static void passingerArray(int minLimit, int maxLimit, float goal) {
        PassengerCar[] car = new PassengerCar[autoQuantity(minLimit, maxLimit)];
        System.out.printf("Автопарк легковушек состоит из %d тачек.\n", car.length);
        for (int i = 0; i < car.length; i++) {
            float probeg = new Random().nextFloat(98.76f);
            //System.out.printf("пробег тачи %f км.\n", probeg);
            car[i] = new PassengerCar();
            car[i].move(probeg);
            System.out.printf("пробег через getter тачи %f км.\n", car[i].getWay());
        }
        float currentWay = 0;
        do {
            for (int i = 0; i < car.length && currentWay < goal; i++) {
                currentWay += car[i].getWay();
                System.out.printf("пройденный путь %f км.\n", currentWay);
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
