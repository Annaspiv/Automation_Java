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
//
    }
}