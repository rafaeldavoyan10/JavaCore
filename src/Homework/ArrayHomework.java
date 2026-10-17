package Homework;

public class ArrayHomework {
    public static void main(String[] args) {
        //1
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]){
                count++;
            }
        }
        System.out.println("Count of " + n + ": " + count);
        //2
        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        for (int i = 0; i < numbers2.length / 2; i++) {
            int temp = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = temp;
        }
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        //4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'ա' || c == 'ե' || c == 'է' || c == 'ը' || c == 'ի' || c == 'ո' || c == 'օ') {
                vowelsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);
    }
}
