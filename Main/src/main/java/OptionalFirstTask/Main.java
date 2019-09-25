package OptionalFirstTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();

        if (n <= 0){
            System.out.println("Invalid");
            System.exit(0);
        }
        int arr[] = new int[n];
        int mas[] = new int[n];
        int sum = 0;

        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] <= 0) {
                System.out.println("Invalid");
                System.exit(0);
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println("Shortest - " + arr[0] + "; length - " + (int)(Math.log10(arr[0])+1));
        System.out.println("Longest - " + arr[arr.length-1] + "; length - " + (int)(Math.log10(arr[arr.length-1])+1));
        System.out.print("Sorted elements:");

        for (int i = 0; i < n; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.log10(arr[i]) + 1);
        }

        for (int i = 0; i < n; i++) {
            sum += mas[i];
        }
        double av = ((double) sum) / ((double) n);
        System.out.println("Average length: " + av);
        System.out.print("Numbers, which length < average length: ");
        for (int i = 0; i < n; i++) {
            if (((int)(Math.log10(arr[i]) + 1)) < av)
                System.out.print(" " + arr[i] + " (length - " + (int)(Math.log10(arr[i])+1) + ")" );
        }
    }
}

