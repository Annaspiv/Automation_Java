package Lecture1;

import java.util.Scanner;

/*1) сгенерировать фрагмент кода с помощью Refactor - Extract Method
в отдельную функцию что бы можно было использовать несколько раз в других функциях
2) вынести отдельные функции в отдельный класс и прописать название класс точка
(пр MyLibrary.) перед методами
3) вывод текста и сделать цикл switch для выбора варианта
4) ввод текста с экрана: Scanner Ctrl+L импортирует обьект сканер
5) добавить сканер перед MyLibrary.printDecrement и в скобках написать старт и стоп
*/
public class Program {


    public static void main2 (String[] args) {
        while (true) {
            menuPrint();

            if (!menuResult()) break;
        }
    }

    private static void menuPrint() {
        System.out.println("------------------Menu------------------");
        System.out.println("Введи 0: Выйти из программы");
        System.out.println("Введи 1: Показать как работает инкремент");
        System.out.println("Введи 2: Показать как работает декремент");
        System.out.println("Введи 3: Показать как работает цикл do-while на примере ввода оценки");
        System.out.println("Введи 4: Показать как работает цикл for на примере ввода максимального числа");
    }

    private static boolean menuResult() {
        Scanner sc = new Scanner(System.in);

//nextInt если цифра, nextDouble если нужно дабл и тд
        int choice = sc.nextInt();
        switch (choice) {
//  case 0 пример как прервать работу цикла без выполнения
            case 0:
                return false;
            case 1: {
                System.out.println("enter start");
                int start = sc.nextInt();
                System.out.println("enter stop");
                int stop = sc.nextInt();
                MyLibrary.printIncrement(start, stop);
                return true;
            }
            case 2: {
                System.out.println("enter start");
                int start = sc.nextInt();
                System.out.println("enter stop");
                int stop = sc.nextInt();
                MyLibrary.printDecrement(start, stop);
                return true;
            }
            case 3: {
                // проверяет действие до проверки условия
                int mark = 0;
                do {
                    System.out.println("enter mark");
                    mark = sc.nextInt();
                } while (mark < 1 || mark > 12);
                System.out.println("your mark = " + mark);
                return true;
            }
            case 4: {
                System.out.println("enter start");
                int i = sc.nextInt();
                System.out.println("enter stop");
                int stop = sc.nextInt();

               // int start = i;
                for (; i <= stop; i++) {
                    System.out.println(i);
                }
                return true;
            }
            default:
                System.out.println("Error");
                return true;
        }

    }
}
