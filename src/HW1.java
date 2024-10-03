import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        String helloWorld = "2008Emirlan";
        int NUM = 2008;
        String word = "Emirlan";
        System.out.println(NUM + word);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрецательное число");
        }
        if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохраноли ноль");
        }
            String name;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваше имя");
            name = scanner.nextLine();
            System.out.println("Привет, " + name);
    }
}