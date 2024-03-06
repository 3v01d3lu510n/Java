package j1.s.p0066;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J1SP0066 {

    public enum Car {
        AUDI, MERCEDES, BMW
    }

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public static Day getDay(String day) {
            try {
                return Day.valueOf(day.toUpperCase());
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
    }

    public enum Color {
        NO_COLOR, WHITE, YELLOW, ORANGE, GREEN, BLUE, PURPLE, PINK, RED, BROWN;

        public static Color getColor(String color) {
            try {
                return Color.valueOf(color.toUpperCase());
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
    }

    public static List<Integer> getPrices(Car car, Color color) {
    switch (car) {
        case AUDI:
            if (color == Color.NO_COLOR) {
                return Arrays.asList(5400, 2900, 4400); 
            } else {
                return Arrays.asList(5500, 3000, 4500);
            }
        case MERCEDES:
            if (color == Color.NO_COLOR) {
                return Arrays.asList(4900, 5900, 8400); 
            } else {
                return Arrays.asList(5000, 6000, 8500);
            }
        case BMW:
            if (color == Color.NO_COLOR) {
                return Arrays.asList(2300, 2900, 3400); 
            } else {
                return Arrays.asList(2400, 3000, 3500);
            }
        default:
            return null;
    }
}


    public static List<Color> getColors(Car car) {
        switch (car) {
            case AUDI:
                return Arrays.asList(Color.WHITE, Color.YELLOW, Color.ORANGE, Color.NO_COLOR);
            case MERCEDES:
                return Arrays.asList(Color.GREEN, Color.BLUE, Color.PURPLE, Color.NO_COLOR);
            case BMW:
                return Arrays.asList(Color.PINK, Color.RED, Color.BROWN, Color.NO_COLOR);
            default:
                return null;
        }
    }

    public static List<Day> getDaySells(Car car) {
        switch (car) {
            case AUDI:
                return Arrays.asList(Day.FRIDAY, Day.SUNDAY, Day.MONDAY);
            case MERCEDES:
                return Arrays.asList(Day.TUESDAY, Day.SATURDAY, Day.WEDNESDAY);
            case BMW:
                return Arrays.asList(Day.MONDAY, Day.SUNDAY, Day.THURSDAY);
            default:
                return null;
        }
    }

    public static Car getCar(String car) {
        try {
            return Car.valueOf(car.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public static class ExceptionCar extends Exception {
        public ExceptionCar(String message) {
            super(message);
        }
    }

    public static Car checkCar(Car car, Color color, Day day, int price) throws ExceptionCar {
        if (car == null || color == null || day == null) {
            throw new ExceptionCar("Invalid input");
        }
        List<Color> colors = getColors(car);
        if (!colors.contains(color)) {
            throw new ExceptionCar("\nColor Car does not exist");
        }        
        List<Integer> prices = getPrices(car,color);
        if (price < 0) {
            throw new ExceptionCar("\nPrice greater than zero");
        }
        if (!prices.contains(price)) {
            throw new ExceptionCar("\nPrice is not valid for this car model");
        }
        List<Day> days = getDaySells(car);
        if (!days.contains(day)) {
            throw new ExceptionCar("\nCar can't sell today");
        }
        return car;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moreCars = "Y";
        while ("Y".equalsIgnoreCase(moreCars)) {
            try {
                System.out.println("Enter car name (AUDI, MERCEDES, BMW):");
                String carName = scanner.nextLine();
                Car car = getCar(carName);
                if (car == null) {
                    System.out.println("Can't sell car");
                    System.out.println("Car break");
                    continue;
                }
                System.out.println("Enter car color (WHITE, YELLOW, ORANGE, GREEN, BLUE, PURPLE, PINK, RED, BROWN, NO COLOR):");
                String colorName = scanner.nextLine();
                Color color = Color.getColor(colorName);
                if (color == null) {
                    System.out.println("Can't sell car");
                    System.out.println("Color Car does not exist");
                    continue;
                }
                System.out.println("Enter price of car:");
                String priceStr = scanner.nextLine();
                int price = 0;
                try {
                    price = Integer.parseInt(priceStr);
                } catch (NumberFormatException e) {
                    System.out.println("Can't sell car");
                    System.out.println("Price is Digit");
                    continue;
                }
                System.out.println("Enter today's day (MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY):");
                String dayName = scanner.nextLine();
                Day day = Day.getDay(dayName);
                if (day == null) {
                System.out.println("Invalid input for day");
                continue;
                }
                car = checkCar(car, color, day, price);
                System.out.println("Sell Car");
                } catch (ExceptionCar e) {
                System.out.println("Can't sell Car: " + e.getMessage());
                }
                System.out.println("Do you want to find more? (Y/N)");
                moreCars = scanner.nextLine();
                }
                }
                }
