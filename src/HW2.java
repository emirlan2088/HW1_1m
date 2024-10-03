import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            double temperature = (Math.random() * 60) - 20;
            System.out.println("возрост человека: " + age + ", температура на улице: " + temperature + ", результат: " + permission(age, temperature));
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static String permission(int age, double temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "можна идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "можно идти гулять";
        } else if (age >= 45 && (temperature >= -10 && temperature <= 25)) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
}