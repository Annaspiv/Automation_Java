package RedRoverSchool;
public class HW2 {
    public static void main(String[] args) {
        /*  Задача №1     Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести
            результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление.*/
        int a = 100;
        int b = 20;

        int sum = a + b;
        int mul = a * b;
        int sub = a - b;
        int div = a / b;
        int ost = a % 2;
        System.out.println("сумма = " + sum + ", \nумножение = " + mul + ", \nвычитание = " + sub + ", \nделение = " + div);

        //Экстра задача    Также вывести остаток от деления и сделать проверку на четность этих переменных
        if (ost == 0) {
            System.out.println(a + " - это четное число");
        } else {
            System.out.println(a + " - это не четное");
        }

        //Экстра задача    Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
        System.out.println("\uD83D\uDE01");
    }
}
