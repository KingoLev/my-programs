import java.util.Scanner;
public class Main{
    static void main(){
        Scanner scan = new Scanner(System.in);
        double result = 0;

        // Ввод чисел и знака
        System.out.print("Впишите первое число: ");
        double num1 = scan.nextDouble();

        System.out.print("Впишите знак (+, -, *, /): ");
        char znak = scan.next().charAt(0);

        System.out.print("Впишите второе число: ");
        double num2 = scan.nextDouble();

        // Вывод ответа
        if (znak == '/' && num2 == 0){
            System.out.println("Низя!");
        }
        else {
            switch (znak) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
            }
                System.out.printf("Ответ: %.2f", result);
        }
        scan.close();
    }
}
