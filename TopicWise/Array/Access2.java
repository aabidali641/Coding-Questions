import java.util.Scanner;
class Access2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println("Element at index " + i + " is : " + arr[i]);
        }
    }
}