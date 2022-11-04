package homework_week_4_hiral;

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    public static void isArmstrongnumber(int num) {

        int number, temp, total = 0;
        number = num;

        while (num != 0) {
            temp = num % 10;

            total = total + temp * temp + temp;
            num /= 10;
        }
        if (total == number)
        {
            System.out.println(number + " is an Armstrong number");
        }else{
            System.out.println(number + "is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
//scanner declaration for iput form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        isArmstrongnumber(a);
        //closing scanner object
        scanner.close();
    }
}



