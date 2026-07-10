public class InsertAtEnd {

    public static void main(String[] args) {

        int[] arr = new int[10];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;

        arr[n] = 60;
        n++;
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}