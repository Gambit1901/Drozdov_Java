import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива, кратные 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
