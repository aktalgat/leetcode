package io.talgat.easy;

public class DesignParkingSystem {
    public static void main(String[] args) {
        DesignParkingSystem dp = new DesignParkingSystem();
        dp.run();
    }

    private void run() {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // return true because there is 1 available slot for a big car
        System.out.println(parkingSystem.addCar(2)); // return true because there is 1 available slot for a medium car
        System.out.println(parkingSystem.addCar(3)); // return false because there is no available slot for a small car
        System.out.println(parkingSystem.addCar(1));
    }

    class ParkingSystem {
        private int big;
        private int medium;
        private int small;
        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            switch (carType) {
                case 1 -> {
                    if (big > 0) {
                        big--;
                        return true;
                    }
                }
                case 2 -> {
                    if (medium > 0) {
                        medium--;
                        return true;
                    }
                }
                case 3 -> {
                    if (small > 0) {
                        small--;
                        return true;
                    }
                }
            }

            return false;
            
        }
    }
}
