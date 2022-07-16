import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int exchange;
        double amount = 0;

        System.out.println("Welcome to Currency Converter!");

        System.out.println("Exchange :");
        System.out.println("1) EUR -> MDL \t\t 6) MDL -> EUR");
        System.out.println("2) USD -> MDL \t\t 7) MDL -> USD");
        System.out.println("3) RUB -> MDL \t\t 8) MDL -> RUB");
        System.out.println("4) RON -> MDL \t\t 9) MDL -> RON");
        System.out.println("5) UAH -> MDL \t\t10) MDL -> UAH");

        do {
            System.out.println("Please choose an exhange:");
            exchange = sc.nextInt();
        }while(exchange <= 0 || exchange >10);

        do {
            if(amount < 0 ) System.out.println("Please enter a positive amount");
            System.out.println("Choose an amount : ");
            amount = sc.nextDouble();

        }while(amount < 0);


        if(amount >= 0) {
            switch(exchange) {
                case 1:
                    System.out.println(amount + " EUR -> MDL = " + amount*19.35);
                break;
                case 2:
                    System.out.println(amount + " USD -> MDL = " + amount*19.32);
                break;
                case 3:
                    System.out.println(amount + " RUB -> MDL = " + amount*0.33);
                break;
                case 4:
                    System.out.println(amount + " RON -> MDL = " + amount*3.92);
                break;
                case 5:
                    System.out.println(amount + " UAH -> MDL = " + amount*0.65);
                break;
                case 6:
                    System.out.println(amount + " MDL -> EUR = " + amount*0.0517);
                break;
                case 7:
                    System.out.println(amount + " MDL -> USD = " + amount*0.05);
                break;
                case 8:
                    System.out.println(amount + " MDL -> RUB = " + amount*3.06);
                break;
                case 9:
                    System.out.println(amount + " MDL -> RON = " + amount*0.26);
                break;
                case 10:
                    System.out.println(amount + " MDL -> UAH = " + amount*1.53);
                break;
            }
        }
    }
}