package test;

public class Cycles {
    public static void main(String[] args) {
        main1(3,3);
        main1(10,10);
    }
    public static void main1(int i1, int j1) {

        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < j1; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("$");
                } else if (i == 0) {
                    System.out.print("#");
                } else if (i == i1-1) {
                    System.out.print("#");
                } else if (j == 0) {
                    System.out.print("$");
                } else if (j == j1-1) {
                    System.out.print("$");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}