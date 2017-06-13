import java.util.*;
public class MainFrame{
    public static void main(String args[]){
        Scanner ent = new Scanner(System.in);
        int[] input = new int[2];
        //even indexes are sleep
        //odd indexes are study
        System.out.println("enter hour of sleep: ");
        input[0] = ent.nextInt();
        System.out.println("enter hours of study: ");
        input[1] = ent.nextInt();
        Neurons one = new Neurons(input[0]);
        Neurons two = new Neurons(input[1]);
        Neurons three = new Neurons();
        Neurons four = new Neurons();
        Synapse onethree = new Synapse(one, three);
        Synapse twothree = new Synapse(two, three);
        Synapse threefour = new Synapse(three, four);
        System.out.println(four.getOutput());
    }
}