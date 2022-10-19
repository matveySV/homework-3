public class Main {

    public static void main(String[] args) {
        int[] array1 = {3, 0, -6, 8, 11, 33, 25, -14, 21, 44, -22};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println("\n---------------------------------------------");

        var daysOfWeek = WeekDays.SATURDAY;

        switch (daysOfWeek) {
            case MONDAY -> System.out.println("Ponedilok");
            case TUESDAY -> System.out.println("Vivtorok");
            case WEDNESDAY -> System.out.println("Sereda");
            case THURSDAY -> System.out.println("Chetver");
            case FRIDAY -> System.out.println("Pyatnica");
            case SATURDAY, SUNDAY -> System.out.println("Weekend");
        }

    }
}
