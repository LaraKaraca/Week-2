import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı alıyoruz
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

        if(isPrime(number, number / 2))
            System.out.println(number + " asal sayıdır.");
        else
            System.out.println(number + " asal sayı değildir.");
    }

    static boolean isPrime(int num, int divisor){

        if(num < 2) return false;
        else if(divisor == 1)
            return true;
        else
        {
            if(num % divisor == 0) return false;

            else
                return isPrime(num, divisor - 1);
        }
    }
}