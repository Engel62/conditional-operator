public class Main {
    public static void main(String[] args){
        int age = 19;
        boolean canNotGoToTheSchool = age < 7 || age > 18;
        if (age >= 18 && age < 21) {
            System.out.println(" Ты достаточно взрослый, чтобы водить, но не достаточно, чтобы пить алкоголь");
        }
        if (canNotGoToTheSchool) {
            System.out.println(" Я думаю ты не ходишь в школу");
        }

    }
}