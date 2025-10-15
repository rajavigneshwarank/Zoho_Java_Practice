import java.util.Scanner;

public class CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string ");
        String str1 = sc.nextLine();

        char[] src = str1.toCharArray();
        char[] dest = new char[src.length];

        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }

        String str2 = new String(dest);

        System.out.println("Result " + str2);

        
    }
}
