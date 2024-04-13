import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerformanceAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Sequential  Access Performance analysis ");
        System.out.println("Enter the number of elements to add ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Integers one by one");
        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        long endTime = System.nanoTime();

        System.out.println((endTime - startTime) + " nano seconds to add elements.");

        System.out.println("Sequential access for list 1");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        long time2 = System.nanoTime();

        System.out.println((time2 - endTime) + "  nano seconds to print list elements");

        System.out.println("Enter the number of elements to add ");
        int nt = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Integers one by one");
        long startTime1 = System.nanoTime();

        for (int i = 0; i < nt; i++) {
            list1.add(sc.nextInt());
        }
        long endTime1 = System.nanoTime();

        System.out.println((endTime1 - startTime1) + " nano seconds to add elements.");

        System.out.println("Sequential access for list  2 ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        long time3 = System.nanoTime();

        System.out.println((time3 - endTime1) + "  nano seconds to print list elements");

        System.out.println("Random access for list  1 ");
        System.out.println(" Enter the number to check in the first list");
        int number = sc.nextInt();
        sc.nextLine();
        long time4 = System.nanoTime();

        if (list.contains(number)) {
            number = 0;
        }
        long time5 = System.nanoTime();
        System.out.println((time5 - time4) + "  nano seconds to search an element in the first list ");

        System.out.println(" Enter the number to check in the Second list");
        number = sc.nextInt();
        sc.nextLine();
        long time6 = System.nanoTime();

        if (list.contains(number)) {
            number = 0;
        }
        long time7 = System.nanoTime();
        System.out.println((time7 - time6) + "  nano seconds to search an element in the Second list ");

    }
}
