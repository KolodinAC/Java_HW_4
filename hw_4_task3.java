
// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class hw_4_task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        double res;
        System.out.println("Добро пожаловать в уникальный калькулятор с возможностью отмены последней операции!");
        System.out.println("Доступные действия: +, -, *, /, отмена!");
        System.out.print("Введите первое число: ");
        res = Double.parseDouble(iScanner.next());
        Stack<Double> result = new Stack<>();
        result.add(res);
        while (true) {
            System.out.printf("\nРезультат: %.2f", result.peek());
            System.out.print("\nУкажите доступное действие или \"отмена\", \"выход\": ");
            String act = iScanner.next();
            if(Objects.equals(act, "выход")){
                break;
            }
            if((Objects.equals(act, "отмена")) && !result.empty()){
                result.pop();
                if(result.empty()){
                    result.add(0.0);
                }
                continue;
            }
            System.out.print("Введите второе число: ");
            res = calculator(result.peek(), Double.parseDouble(iScanner.next()), act);
            result.push(res);
            //System.out.println(result);
            System.out.println("Ответ: " + result.peek());
        }
        iScanner.close();
    }
    public static double calculator(double n1, double n2, String action) {
        double result = 0;
        if (Objects.equals(action, "-")) result = n1 - n2;
        if (Objects.equals(action, "+")) result = n1 + n2;
        if (Objects.equals(action, "/") && n2 != 0) result = n1 / n2;
        if (Objects.equals(action, "*")) result = n1 * n2;
        return result;
    }

}
