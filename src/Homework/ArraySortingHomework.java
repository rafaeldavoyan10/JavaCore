package Homework;

public class ArraySortingHomework {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        //1
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int temp;
                if (numbers[j] < numbers[i]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
        //2
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int x : numbers){
            System.out.print(x + " ");
        }
    }
}
