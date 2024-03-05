import java.util.*;

public class captializeFirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence :");

        String str1 = sc.nextLine();
        String arr1[] = str1.split(" ");
        String res ="";


        for (int i = 0; i < arr1.length; i++) {
            res+=" "+arr1[i].substring(0,1).toUpperCase()+arr1[i].substring(1);
        }
        System.out.println("Capitalize the word of the sentence is  : " + res);

    }
}
