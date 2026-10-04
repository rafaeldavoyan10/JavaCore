package Lesson6;

public class Homework6 {
    public static void main(String[] args) {
        //1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_______");
        //2
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_______");
        int n = 5;
        //3
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("______");
        //4
        for (int i = n; i >= 1; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("_______");
    }
}
