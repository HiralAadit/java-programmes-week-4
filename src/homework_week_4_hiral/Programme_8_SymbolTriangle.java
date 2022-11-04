package homework_week_4_hiral;
/*
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Programme_8_SymbolTriangle {
    public static void symbolTrianlge(int n) {
        for (int i = 0; i <= n; i++) {
        for (int j = 0; j < i; j++) {
        System.out.print("@");
    }
     System.out.println("");
}
}
public static void main(String[]args){
        //Scanner declaration for input form console
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number of rows: ");
    symbolTrianlge(scanner.nextInt());
    //closing the scanner object
    scanner.close();
}

        }