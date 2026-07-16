import java.util.Scanner;

public class ArrayUpdation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index to update: ");
        int index = sc.nextInt();

        System.out.print("Enter new value: ");
        int value = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        }

        System.out.println("Updated Array:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}