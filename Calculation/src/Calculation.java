import java.util.Scanner;
class Calculation
{
    public static void main(String args[])
    {
        int ch;
        double ar;
        int length, breadth, height, side;
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Right Angle Triangle");
        System.out.println("2: Area of Equilateral Triangle");
        System.out.println("3: Area of Square");
        System.out.println("4: Area of Rectangle");
        System.out.println("5:Exit");
        lp : while(true)
        {
            System.out.print("Make your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the height of Right Angle Triangle \n");
                    height = sc.nextInt();
                    System.out.print("Enter the base of Right Angle Triangle \n");
                    breadth = sc.nextInt();
                    ar = (height * breadth) / 2;
                    System.out.println("Area of the Right Angle Triangle is " + ar + "\n\n");
                    break;
                case 2:
                    System.out.print("Enter the side of an Equilateral Triangle \n");
                    side = sc.nextInt();
                    ar = (side * side * Math.sqrt(3)) / 4;
                    System.out.println("Area of the Equilateral Triangle is " + ar + "\n\n");
                    break;
                case 3:
                    System.out.print("Enter the side of a Square \n");
                    side = sc.nextInt();
                    ar = side * side;
                    System.out.println("Area of the Square is " + ar + "\n\n");
                    break;
                case 4:
                    System.out.print("Enter the length of a Rectangle \n");
                    length = sc.nextInt();
                    System.out.print("Enter the breadth of the Rectangle \n");
                    breadth = sc.nextInt();
                    ar = length * breadth;
                    System.out.println("Area of the Rectangle is " + ar + "\n\n");
                    break;
                case 5:
                    System.out.print("Exit \n");
                    System.exit(1);
                    break;
            }
            }
        }
    }