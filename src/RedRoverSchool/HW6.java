package RedRoverSchool;

public class HW6 {
    public static void main(String[] args) {
   /* Задача №1 Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести сумму всех значений массива.*/
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

    /* Задача №2 Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести максимальное значение массива.*/

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);


    /* Задача №3 Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести минимальное значение массива.*/
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);

    /* Задача №4 Дан массив:
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    необходимо вывести среднее арифметическое всех значений массива.*/
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
        int mid = 0;
        for (int i = 0; i < array2.length; i++) {
            mid += array2[i];
        }
        mid = mid / array2.length;
        System.out.println(mid);

    /* Задача №5 Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести сумму элементов массива.*/
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sumM = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                sumM += array3[i][j];
            }
        }
        System.out.println(sumM);

    /* Задача №6 Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести максимальное значение массива.*/
        int maxM = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (maxM < array3[i][j])
                    maxM = array3[i][j];
            }
        }
        System.out.println(maxM);
    }
}
