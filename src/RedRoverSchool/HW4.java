package RedRoverSchool;

public class HW4 {
    public static void main(String[] args) {

//Задача №1 Необходимо вывести числа от 0 до 15.
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }

//Задача №2 Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
        int n = 5;
        while (n < 10000) {
            System.out.println(n);
            n = n * 5;
        }

        for (int k = 5; k < 10000; k = k * 5) {
            System.out.println(k);
        }

// Задача №3 Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно. Реализовать 2 варианта:
//1 использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//2 без использования конструкции if (шаг цикла на ваше усмотрение).
        for (int i = 40; i <= 60; i++) {
            if ((i % 4) == 0) {
                System.out.println(i + " - кратно 4");
            }
        }
    }
}
