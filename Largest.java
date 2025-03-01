import java.util.*;
public class Largest {
    @SuppressWarnings("ConvertToTryWithResources") // Suppressing warning no need to rememner this
    public static void main(String[] args) {
        Scanner ss =new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int no = ss.nextInt();
        int arr[] = new int[no];
        System.out.println("enter the elements of array");
        for(int i=0; i<no ; i++){
            arr[i] = ss.nextInt();
        }
        int max = arr[0];
        for(int i =0 ; i<no ; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("The largest element in the array is "+max);
        ss.close();
    }
}
