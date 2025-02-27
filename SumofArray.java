import java.util.Scanner;

public class SumofArray {
    @SuppressWarnings("ConvertToTryWithResources") // Suppressing warning no need to rememner this
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int r = ss.nextInt();
        int arr[] = new int[r];
        int sum = 0;
        System.out.println("Enter the elements of array");
        for(int i = 0;i<r ;i++){
            arr[i] = ss.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum of digits in array is "+sum);
        ss.close();
    }
}