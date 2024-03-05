import java.util.*;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence  :");

        String str1 = sc.nextLine();
        String arr1[] = str1.split(" ");
        String res = arr1[arr1.length - 1];


        for (int i = 0; i < arr1.length - 1; i++) {
            res+=" "+arr1[arr1.length-2-i];
        }
        System.out.println("Reverse the Word in the Sentence : " + res);

    }
}
