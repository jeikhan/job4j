package ru.job4j.stream;

/**
 * Задача. Создать модель данных и реализацию
 * класса с помощью шаблона проектирования Builder.
 *
 * @author Evgenii Kapaev
 * @since 03.09.21
 */
public class Car {
    private String carType;
    private int seats;
    private double engineVolume;
    private String typeTransmission;
    private boolean tripComputer;
    private boolean gpsNavigator;

    static class Builder {
        private String carType;
        private int seats;
        private double engineVolume;
        private String typeTransmission;
        private boolean tripComputer;
        private boolean gpsNavigator;

        Builder buildCarType(String carType) {
            this.carType = carType;
            return this;
        }

        Builder buildSeats(int seats) {
            this.seats = seats;
            return this;
        }

        Builder buildEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        Builder buildTypeTransmission(String typeTransmission) {
            this.typeTransmission = typeTransmission;
            return this;
        }

        Builder buildTripComputer(boolean tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        Builder buildGpsNavigator(boolean gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.carType = carType;
            car.seats = seats;
            car.engineVolume = engineVolume;
            car.typeTransmission = typeTransmission;
            car.tripComputer = tripComputer;
            car.gpsNavigator = gpsNavigator;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder().buildCarType("Cabriolet")
                .buildSeats(4)
                .buildEngineVolume(3.3)
                .buildTypeTransmission("Auto")
                .buildTripComputer(true)
                .buildGpsNavigator(true)
                .build();
        System.out.println(car);
    }

    @Override
    public String toString() {
        return "CAR CHARACTERISTICS:" + "\n"
                + "carType = '" + carType + '\'' + "\n"
                + "seats = " + seats + "\n"
                + "engineVolume = " + engineVolume + "\n"
                + "typeTransmission = '" + typeTransmission + '\'' + "\n"
                + "tripComputer = " + tripComputer + "\n"
                + "gpsNavigator = " + gpsNavigator;
    }
}
