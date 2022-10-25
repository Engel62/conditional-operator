public class Main {
    public static void main(String[] args) {

        // Задание 1, домашнее задание 1
        System.out.println("Задание 1");
        int age = 1;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        /// Задание 2
        System.out.println("Задание 2");
        int childAge = 15;

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
        int passenger = 150;
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
        /// Задание 8, Задача 1.
        System.out.println("Задание 8, Задача 1.");

        int menAge = 22;
         boolean ageKindergarten = 2 <= menAge && menAge <= 6;
         boolean ageSchool = 7 <= menAge && menAge <= 18;
         boolean ageUniversity = menAge >= 18 && menAge <= 24;
         boolean ageWork = menAge > 24;

        if (ageKindergarten)
            System.out.println("Если возраст человека равен " + menAge + " нужно ходить в детский сад");
         else if (ageSchool)
            System.out.println("Если возраст человека равен " + menAge + " нужно ходить в школу");
        else if (ageUniversity)
            System.out.println("Если возраст человека равен " + menAge + " нужно ходить в университет");
         else if(ageWork)
            System.out.println("Если возраст человека равен " + menAge + " нужно ходить на работу");

        /// Задание 8, Задача 1.
        System.out.println("Задание 8, Задача 2.");
        int babyAge = 15;
        boolean noRide = babyAge < 5;
        boolean withParentsRide = babyAge > 5 && babyAge <14;
        boolean withoutParentsRide = babyAge > 14;
        if (noRide)
            System.out.println("Если ребенку " + babyAge + " лет, то он не может кататься на аттракционе");
        else if (withParentsRide)
            System.out.println("Если ребенку " + babyAge + " лет,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        else if (withoutParentsRide)
            System.out.println("Если ребенку " + babyAge + " лет,то он может кататься без сопровождения взрослого.");
        /// Задание 8, Задача 3.
        System.out.println("Задание 8, Задача 3.");
        int one = 10;
        int two = 6;
        int free = 3;
        if (one > two && one > free)
            System.out.println(one);
        else if (two > one && two > free )
            System.out.println(two);
        else if (free > one && free > two)
            System.out.println(free);




    }
}