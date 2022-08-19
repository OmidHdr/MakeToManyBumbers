import java.util.Arrays;
import java.util.Scanner;

public class MakeTomanyBumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        String number = input.nextLine();
        int num = Integer.parseInt(number);
        int len = number.length();
        int[] list = new int[num+1];
        System.out.println(list.length);
        if(num <= 9){
            for(int i = 0 ; i <= num ; i++){
                list[i]= i;
            }
        }
        System.out.print(Arrays.toString(list));


    }
}
