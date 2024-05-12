import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[2]);

        System.out.println();
        System.out.println();

        System.out.println("Задача 2");

        double[] dnumbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < dnumbers.length; i++) {
            System.out.print(dnumbers[i]);
            if (i < dnumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        for (int i = dnumbers.length - 1; i >= 0; i--) {
            System.out.print(dnumbers[i] + ", ");
        }

        System.out.println();
        System.out.println();

        {
            System.out.println("Задача 4");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    numbers[i] = numbers[i] + 1;

                }
            }
            System.out.println(Arrays.toString(numbers));
        }

    }
}