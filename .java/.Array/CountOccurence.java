import java.util.Scanner;

public class CountOccurence {

    public static void main(String args[]) {
        String str;
        int i, len;
        int counter[] = new int[256];
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        str = sc.nextLine();
        sc.close();
        len = str.length();
        for (i = 0; i < len; i++) {
            counter[(int) str.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}