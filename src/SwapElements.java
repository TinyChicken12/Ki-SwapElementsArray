import java.util.Scanner;

public class SwapElements {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter size <20 of the array: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        int a[] = new int[size];
        if (size > 20) {
            System.out.println("Invalid size");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.print("a[" + i + "]= ");
                a[i] = scanner.nextInt();
            }
            System.out.printf("%-20s%s", "Elements in array: ", "");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + "\t");
            }
            for (int j = 0; j < a.length / 2; j++) {
                int temp = a[j];
                a[j] = a[size - 1 - j];
                a[size - 1 - j] = temp;
            }
            System.out.printf("%-20s%s", "Reverse array: ", "");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + "\t");
            }

        }
    }
}
