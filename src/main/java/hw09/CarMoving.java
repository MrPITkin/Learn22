package hw09;

import java.util.Random;

public class CarMoving {

    public static void main(String[] args) {
        char testo = 'Ё';
        System.out.printf("write русскую букову \"%s\".\n", testo);

        int minLimit = 5; // MIN число тачек
        int maxLimit = 7; // MAX число тачек
        float distance = 987.65f; // требуемая дистанция

        PassengerCar[] car = new PassengerCar[autoQuantity(minLimit, maxLimit)];
        System.out.printf("Автопарк легковушек состоит из %d тачек.\n", car.length);
        carArray(car); // наполнение автопарка легковушек
//        carRace(car, distance); // запускаем гонку
        System.out.println("******** Тяжёлыё машины  Hard Truck ********");
        Automobile[] bigCar = new Truck[autoQuantity(minLimit, maxLimit)];
        System.out.printf("Автопарк грузовиков состоит из %d тачек.\n", bigCar.length);
        bigСarArray(bigCar); // наполнение автопарка грузовиков
//        carRace(bigCar, distance); // запускаем гонку
        System.out.println("******** смешанный транспорт  Mixed Car ********");
        Automobile[] allCars = new Automobile[Math.min(car.length, bigCar.length)];
        System.out.printf("Общий автопарк состоит из %d тачек.\n", allCars.length);
        for (int i = 0; i < allCars.length; i++) {
            if (new Random().nextBoolean()) {
                allCars[i] = new PassengerCar(car[i].getName(), car[i].getWay());
            } else {
                allCars[i] = new Truck(bigCar[i].getName(), bigCar[i].getWay());
            }
            System.out.printf("пробег тачи %s %d = %f км.\n", allCars[i].getName(),
                    i + 1, allCars[i].move(allCars[i].getWay()));
        }
        carRace(allCars, distance); // запускаем гонку

    }

    private static void bigСarArray(Automobile[] bigCar) {
        for (int i = 0; i < bigCar.length; i++) {
            float probeg = new Random().nextFloat(98.76f);
            bigCar[i] = new Truck("Грузовушка №", probeg);
            System.out.printf("пробег тачи %s %d = %f км. %b\n", bigCar[i].getName(),
                    i + 1, bigCar[i].getWay(), bigCar[i].type);
        }
    }

    private static void carArray(PassengerCar[] car) {
        for (int i = 0; i < car.length; i++) {
            float probeg = new Random().nextFloat(98.76f);
            car[i] = new PassengerCar("Лехкавичёк №", probeg);
            System.out.printf("пробег тачи %s %d = %f км. %b\n", car[i].getName(),
                    i + 1, car[i].getWay(), car[i].type);
        }
    }

    private static void carRace(Automobile[] car, float goal) {
        float currentWay = 0;
        do {
            for (int i = 0; i < car.length && currentWay < goal; i++) {
                currentWay += car[i].getWay();
                System.out.printf("Тачкa %s %d достигла отметки %f км.\n",
                        car[i].getName(), i + 1, currentWay);
            }
            //System.out.printf("Весь автопарк проехал %f км.\n", currentWay);
        } while (currentWay < goal);
    }

    private static int autoQuantity(int minLimit, int maxLimit) {
        int quantity;
        do {
            quantity = new Random().nextInt(maxLimit) + 1;
        } while (quantity < minLimit);
        return quantity;
    }
}
