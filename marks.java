import java.util.Scanner;
public class Main{
    static void main(){
        Scanner scan = new Scanner(System.in);
        int k = -1; // Кол-во. -1, т.к. 0 в do-while тоже считается
        double s = 0; // Сумма
        double n = 0; // Двойки
        int mark = 0; // Ввод оценок
        double z = 0; // Пятерки

        // Ввод
        System.out.println("Введите оценки. Когда закончите, введите 0:");
        do {
            mark = scan.nextInt();
            k++;
            s += mark;
        }while (mark != 0);

        System.out.print("Введите желаемую оценку (3, 4, 5): ");
        int wanted = scan.nextInt();

        // Подсчет
        if(wanted == 5){
            n = (s-4.6*k)/2.6;
            z = (4.6*k-s)/0.4;
        }
        else if(wanted == 4){
            n = (s-3.6*k)/1.6;
            z = (3.6*k-s)/1.4;
        }
        else if (wanted == 3){
            n = (s-2.6*k)/0.6;
            z = (2.6*k-s)/2.4;
        }

        // Проверка
        if(z < 0){
            z = 0;
        }
        else if(n < 0){
            n = 0;
        }

        n += 0.000000001; // 18/5=3.599999 (фикс проблемы точных компов)
        int resultn = (int) n;
        int resultz = (int) Math.ceil(z);

        // Вывод
        System.out.println("\nДвоек можно получить: " + resultn);
        System.out.println("Пятерок надо получить: " + resultz);
        scan.close();
    }
}
