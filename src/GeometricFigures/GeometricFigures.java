package GeometricFigures;

//построение простых геометрических фигур
public class GeometricFigures {

    public static void main(String[] args) {

//рисуем обратный слеш
        System.out.println("рисуем обратный слеш");

        for (int i = 0; i < 6; i++) {

            System.out.print("\t");

            for (int j = 0; j < 6; j++) {

                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
//рисуем прямой слеш
        System.out.println("рисуем прямой слеш");
        for (int i = 6; i > 0; i--) {

            System.out.print("\t");

            for (int j = 0; j < 6; j++) {

                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
// рисуем треугольник с прямым углом снизу
        System.out.println("рисуем треугольник с прямым углом снизу");
        for (int i = 0; i < 6; i++) {

            System.out.print("\t");

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// рисуем треугольник с прямым углом сверху
        System.out.println("рисуем треугольник с прямым углом сверху");
        for (int i = 6; i > 0; i--) {

            System.out.print("\t");

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// рисуем равнобедренный треугольник
        int a = 0;
        System.out.println("рисуем равнобедренный треугольник");
        for (int i = 6; i > 0; i--) {

            System.out.print("\t");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= a * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
            a++;
        }
//рисуем прямоугольник
        System.out.println("рисуем прямоугольник");
        for (int i = 0; i < 6; i++) {

            System.out.print("\t");

            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//рисуем круг
        System.out.println("рисуем круг");
        for (int i = 0; i < 10; i++) {

            System.out.print("\t");

            for (int j = 0; j < 10; j++) {

                if (i == 0 && j == 4 || i == 0 && j == 5 || i == 1 && j == 7 || i == 2 && j == 8 ||
                        i == 4 && j == 9 || i == 5 && j == 9 || i == 7 && j == 8 || i == 8 && j == 7 ||
                        i == 8 && j == 2 || i == 7 && j == 1 || i == 5 && j == 0 || i == 4 && j == 0 ||
                        i == 9 && j == 4 || i == 9 && j == 5 || i == 2 && j == 1 || i == 1 && j == 2) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();
        }
    }
}