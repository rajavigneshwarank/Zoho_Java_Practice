import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                digit++;
            else
                special++;
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special characters: " + special);

       
    }
}
