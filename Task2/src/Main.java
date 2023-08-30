import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String Name = name.nextLine();
        if (Name.equals("Вячеслав")){
            System.out.println("Привет , Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}