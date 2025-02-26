import java.util.Scanner;
public class DecimaltoBinary {
    @SuppressWarnings("ConvertToTryWithResources") // Suppressing warning no need to rememner this
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to convert in binary");
        int n = scanner.nextInt();
        int i = 0;
        int binary[] = new int[32];
        if(n==0){
            System.out.println("0");
        }
        else{
            while(n>0){
                binary[i] = n%2;
                i++;
                 n = n/2;
            }
            for(int j = i-1; j>=0;j--){
                System.out.print(binary[j]);
           }
        }
        scanner.close();
    }
}