public class Main {
    public static void main(String[] args) {

        // Задание 1, домашнее задание 1
        System.out.println("Задание 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        /// Задание 2
        System.out.println("Задание 2");
        int childAge = 25;

        if (childAge <= 7) {
            System.out.println("Ребенок ходит в сад");
        }

        if (childAge >= 7 && age <= 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (childAge >= 18 && childAge <= 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (childAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        /// Задача 3
        System.out.println("Задание 3");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int standigPlace = wagonCapacity - seatPlace;
        int passenger = 80;
        if (passenger <= seatPlace) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (seatPlace <= passenger && passenger <= wagonCapacity) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (passenger >= wagonCapacity) {
            System.out.println("В вагоне нет мест");
        }
        /// Задание 6, домашнее задание 2
        System.out.println(" Домашнее задание 2. Задание 1");
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        /// Задание 2
        System.out.println("Задание 2");

        if (childAge >= 7 && age <= 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (childAge >= 18 && childAge <= 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        /// Задание 3
        System.out.println("Задание 3");
        if (passenger <= seatPlace) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (seatPlace <= passenger && passenger <= wagonCapacity) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
    }
}