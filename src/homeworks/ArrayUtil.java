package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
//1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //2
        System.out.println("First element: " + numbers[0]);
        //3
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        //4
        System.out.println("Array length: " + numbers.length);
        //5
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);
        //6
        if (numbers.length <= 2){
            System.out.println("Can't print middle values");
        }
        else {
            if (numbers.length % 2 != 0){
                int midIndex = numbers.length / 2;
                System.out.println("Middle element: " + numbers[midIndex]);
            }
            else {
                int midIndex1 = (numbers.length / 2) - 1;
                int midIndex2 = numbers.length / 2;
                System.out.println("Middle elements: " + numbers[midIndex1] + " " + numbers[midIndex2]);
            }
        }
        //7
        int evenNums = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenNums = evenNums + 1;
            }
        }
        System.out.println("Even numbers count: " + evenNums);
        //8
        int oddNums = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                oddNums = oddNums + 1;
            }
        }
        System.out.println("Odd numbers count: " + oddNums);
        //9
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum: " + sum);
        //10
        System.out.println("Average: " + sum / numbers.length);
        //bonus 1
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
        //bonus 2
        int positiveNums = 0;
        int negativeNums = 0;
        int zereoNums = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                positiveNums++;
            }
            if (numbers[i] < 0){
                negativeNums++;
            }
            if (numbers[i] == 0){
                zereoNums++;
            }
        }
        System.out.println("Positive Numbers: " + positiveNums);
        System.out.println("Negative Numbers: " + negativeNums);
        System.out.println("Zereo Numbers: " + zereoNums);
        //bonus 3
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
