package Homework;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        //1
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        //2
        System.out.println("Characters count: " + chars.length);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);
        //3
        char c = 'a';
        int charsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c){
                charsCount++;
            }
        }
        System.out.println("Character " + c + " count: " + charsCount);
        //4
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'A' ||
                    chars[i] == 'e' || chars[i] == 'E' ||
                    chars[i] == 'i' || chars[i] == 'I' ||
                    chars[i] == 'o' || chars[i] == 'O' ||
                    chars[i] == 'u' || chars[i] == 'U'
            ){
                vowelsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);
        //5
        int consonantsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                if (
                        chars[i] != 'a' && chars[i] != 'A' &&
                                chars[i] != 'e' && chars[i] != 'E' &&
                                chars[i] != 'i' && chars[i] != 'I' &&
                                chars[i] != 'o' && chars[i] != 'O' &&
                                chars[i] != 'u' && chars[i] != 'U'
                ) {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Consonants count: " + consonantsCount);
        //6
        int spaceCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                spaceCount++;
            }
        }
        System.out.println("Spaces count: " + spaceCount);
        //7
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 -i];
            chars[chars.length - 1 - i] = temp;
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        //9
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 -i];
            chars[chars.length - 1 - i] = temp;
        }
        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < chars.length; i++) {
            if (oldChar == chars[i]){
                chars[i] = newChar;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        //10
        boolean palindrome = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 -i]){
                palindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + palindrome);
    }
}
