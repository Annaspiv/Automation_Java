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


    public static void main(String[] args) {
        System.out.println("------------------Menu------------------");
        System.out.println("Введи 1: Показать как работает инкремент");
        System.out.println("Введи 2: Показать как работает декремент");

        if (menuResult() == false) {
            return;
        }
        menuResult();

    }

    private static boolean menuResult() {
        Scanner sc = new Scanner(System.in);

//nextInt если цифра, nextDouble если нужно дабл и тд
        int choice = sc.nextInt();
        switch (choice) {
//  case 0 пример как прервать работу цикла без выполнения
            case 0:
                return false;
            case 1:
                System.out.println("enter start");
                int start = sc.nextInt();
                System.out.println("enter stop");
                int stop = sc.nextInt();
                MyLibrary.printIncrement(start, stop);
                break;
            case 2:
                System.out.println("enter start");
                int start2 = sc.nextInt();
                System.out.println("enter stop");
                int stop2 = sc.nextInt();
                MyLibrary.printDecrement(start2, stop2);
                break;
            default:
                System.out.println("Error");
                break;
        }

        return true;
    }
}

