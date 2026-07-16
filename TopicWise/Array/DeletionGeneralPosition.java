
import java.util.Scanner;

class DeletionGeneralPosition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20 , 30, 40 , 50};

        System.out.print("Enter position to delete: ");
        int position = sc.nextInt();
        
        if(position < 1 || position > arr.length){
            System.out.println("Invalid Position");
        } else {
            for(int i = position-1 ; i < arr.length - 1; i++){
                arr[i] = arr[i + 1];
            }
        }
        System.out.println("Array after deletion:");
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}