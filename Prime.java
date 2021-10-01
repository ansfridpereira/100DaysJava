import java.util.Scanner;
public class Prime
{
    public static void main(String args[]){
        int num, a,b = 0;
        Scanner f=new Scanner(System.in);

        System.out.print("Enter any integer number: ");
        num= f.nextInt();

        for(a=2; a<=(num/2); a++)
        {
            if(num%a==0)
            {
                b=1;
                break;
            }
        }
        if(b==0)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}