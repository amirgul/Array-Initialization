import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Enter a list of non-negative whole numbers");
        System.out.println("Enter a negative number at the end");
        int[] list = new int[10];
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int i = 0;
        while ((i < list.length)&&(number >= 0))
        {
            System.out.println("number:" + (i+1));
            list[i] = number;
            i++;
            number = keyboard.nextInt();
        }
        System.out.println("We hit the 10: "+ i);
    }
}
