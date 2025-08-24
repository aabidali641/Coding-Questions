import java.util.Scanner;

public class RemoveSpaces{
    public void removeSpaces(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String must not be null");
        }

        String result = str.replaceAll("\\s+", ""); // Remove all spaces
        System.out.println("String after removing spaces: " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        RemoveSpaces remover = new RemoveSpaces();
        remover.removeSpaces(input);
        sc.close();

    }
}