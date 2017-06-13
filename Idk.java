import java.util.*;
public class Idk{
    
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int[] input = new int[2];
        //even indexes are sleep
        //odd indexes are study
        System.out.println("enter hour of sleep: ");
        input[0] = ent.nextInt();
        System.out.println("enter hours of study: ");
        input[1] = ent.nextInt();
        System.out.println(input.process());
    }
}