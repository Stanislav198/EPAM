package OptionalThirdTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        char stackReverse;

        Stack stack = new Stack();
        System.out.println("Enter your number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] numbers = String.valueOf(n).toCharArray();

        for (char count : numbers) {
            stack.push(count);
        }
            while(!stack.empty()) {

                stackReverse = (Character)stack.pop();
                System.out.print(stackReverse);
            }

    }
}