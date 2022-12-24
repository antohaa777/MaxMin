import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write 3 numbers to find highest/lowest of them");
        while (true) {
            System.out.println("Please write First number");
            String num1 = scanner.next();
            System.out.println("Please write Second number");
            String num2 = scanner.next();
            System.out.println("Please write Third number");
            String num3 = scanner.next();
            System.out.println("Please write which value you want to see min or max");
            String type = scanner.next();
            int numm1 = Integer.parseInt(num1);
            int numm2 = Integer.parseInt(num2);
            int numm3 = Integer.parseInt(num3);
            switch (type) {
                case "max":
                    if (numm1 > numm2 && numm1 > numm3)
                        System.out.println("Highest number is : " + numm1);
                    else {
                        if (numm2 > numm3)
                            System.out.println("Highest number is : " + numm2);
                        else {
                            System.out.println("Highest number is : " + numm3);
                        }
                    }
                    break;
                case "min":
                    if (numm1 < numm2 && numm1 < numm3)
                        System.out.println("Lowest number is : " + numm1);
                    else {
                        if (numm2 < numm3)
                            System.out.println("Lowest number is : " + numm2);

                        else {
                            System.out.println("Lowest number is : " + numm3);

                        }
                    }
                    break;
            }
            System.out.println("Do you want to do again? Y/N");
            String next = scanner.next();
            switch (next) {
                case "N":
                    return;
                case "Y":
                    break;

            }
        }





    }
}