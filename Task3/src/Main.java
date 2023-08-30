public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        System.out.println("Элементы массива, кратные 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
