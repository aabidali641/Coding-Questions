import java.util.Scanner;
public class Access {   
    public static void main(String [] args){
        Scanner  sc = new Scanner(System.in);
        
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("Enter the index of element you want to access : ");
        int index = sc.nextInt();
        if(index >= 0 && index <arr.length){
            System.out.println("Element at index " + index + " is : " + arr[index]);
            
        } else {
            System.out.println("Invalid index");
        }


    }
}