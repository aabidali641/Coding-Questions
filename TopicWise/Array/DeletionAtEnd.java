class DeletionAtEnd{
    public static void main(String[] args) {
        int arr[] = {10, 20 , 30 , 40 , 50};

        DeletionAtEnd obj = new DeletionAtEnd();
        int lastElement = obj.findlastElement(arr);
        System.out.println("Last Element: " + lastElement);
        lastElement = 0; // Deleting last element
        System.out.println("Last Element after deletion: " + lastElement);

    }
     int findlastElement(int arr[]){
        return arr[arr.length - 1];
    }
}