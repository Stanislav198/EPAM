package MainFirstTask;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println( "             Menu " );
        System.out.println( "*******************************" );
        System.out.println( " 1. Hello" );
        System.out.println( " 2. Reverse arguments" );
        System.out.println( " 3. Out numbers" );
        System.out.println( " 4. Password" );
        System.out.println( " 5. Sum" );
        System.out.println( " 6. Month" );
        System.out.println(" 0. Quit" );
        System.out.println( "*******************************" );

        boolean quit = false;
        int menuItem;

        do {
            System.out.print("Choose menu item: ");
            menuItem = in.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.println("You've chosen Hello");
                    System.out.print("Enter your name:");
                    String name = in.next();
                    System.out.println("Hello, " + name);
                    break;
                case 2:
                    System.out.println("You've chosen Reverse arguments");
                    System.out.print("Enter numbers: ");
                    String str = in.next();
                    String reverse = new StringBuffer(str).reverse().toString();
                    System.out.println("Reverse numbers: " + reverse);
                    break;
                case 3:
                    System.out.println("You've chosen Out numbers");
                    int array[] = {1, 2, 3, 4};
                    for (int i = 0; i < 4; i++) {
                        System.out.println(array[i]);
                        System.out.print(array[i]);
                    }
                    break;
                case 4:
                    System.out.println("You've chosen Password");
                    System.out.print("Enter password: ");
                    String p1 = in.next();
                    String p2 = "1111";
                    if (p1.equals(p2))
                        System.out.println("Correct");
                    else System.out.println("Incorrect");
                    break;
                case 5:
                    System.out.println("You've chosen Sum");
                    System.out.print("Enter numbers: ");
                    int num = in.nextInt();
                    int sum = 0;
                     while (num != 0) {
                        sum += num % 10;
                        num = num / 10;
                    }
                    System.out.println("Sum: " + sum);
                    break;
                case 6:
                    System.out.println("You've chosen Month");
                    System.out.println("Enter the number of month:");
                    int month = in.nextInt();
                    switch (month) {
                        case 1:
                            System.out.println("January");
                            break;
                        case 2:
                            System.out.println("February");
                            break;
                        case 3:
                            System.out.println("March");
                            break;
                        case 4:
                            System.out.println("April");
                            break;
                        case 5:
                            System.out.println("May");
                            break;
                        case 6:
                            System.out.println("June");
                            break;
                        case 7:
                            System.out.println("July");
                            break;
                        case 8:
                            System.out.println("August");
                            break;
                        case 9:
                            System.out.println("September");
                            break;
                        case 10:
                            System.out.println("October");
                            break;
                        case 11:
                            System.out.println("November");
                            break;
                        case 12:
                            System.out.println("December");
                            break;
                        default:
                            System.out.println("Error!");
                    }
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (!quit);
        System.out.println("Bye!");
    }
}

