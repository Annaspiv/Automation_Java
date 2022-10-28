package Lecture1;

public class MyLibrary {
    public static void printIncrement(int start, int stop) {
        int i = start;
        while (i <= stop) {
            System.out.println(i);
            i++;
        }
    }

    public static void printDecrement(int start, int stop) {
        int i = start;
        while (i > stop) {
            System.out.println(i);
            i--;
        }
    }
}
