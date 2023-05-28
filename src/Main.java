import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Завдання 1: Виведення випадкового натурального числа з проміжку [-20; 20]
        Random random = new Random();
        int randomNumber = random.nextInt(41) - 20;
        System.out.println("Випадкове число: " + randomNumber);

        // Завдання 2: Визначення та вивід площі та периметру прямокутного трикутника
        int a = 3;
        int b = 4; 
        double hypotenuse = Math.sqrt(a * a + b * b);
        double perimeter = a + b + hypotenuse;
        double area = 0.5 * a * b;
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площа: " + area);

        // Завдання 3: Визначення та вивід кількості цифр у випадково згенерованому числі
        int randomNum = random.nextInt(101);
        int digitCount = String.valueOf(randomNum).length();
        System.out.println("Випадкове число: " + randomNum);
        System.out.println("Кількість цифр: " + digitCount);

        // Завдання 4: Прототип гри "лотерея"
        int[] lotteryNumbers = new int[3];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = random.nextInt(3) + 1;
        }
        System.out.println("Вгадайте послідовність трьох чисел від 1 до 3!");

        int[] userNumbers = new int[3];
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = random.nextInt(3) + 1;
            System.out.println("Ваше число " + (i + 1) + ": " + userNumbers[i]);
        }

        boolean isWin = true;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] != userNumbers[i]) {
                isWin = false;
                break;
            }
        }

        if (isWin) {
            System.out.println("Ви виграли!");
        } else {
            System.out.println("Ви не вгадали!");
        }
    }
}
