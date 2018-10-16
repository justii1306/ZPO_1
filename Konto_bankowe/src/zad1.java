import java.math.BigInteger;
import java.util.Scanner;

public class zad1{
    public static void pobieranie_NRB(){
        String liczba = "2521";
        Scanner scan = new Scanner(System.in);
        String NBR = scan.nextLine();
        NBR = NBR.replace(" ", "");
        try {
            new BigInteger(NBR);
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        NBR = NBR + liczba;
        char z1 = NBR.charAt(0);
        char z2 = NBR.charAt(1);
        String dwie_pierwsze_cyfry = "" + z1 + z2;
        NBR = NBR + dwie_pierwsze_cyfry;
        String NBR_2 = NBR.substring(2);
        BigInteger NRB = new BigInteger(NBR_2);
        BigInteger dzielnik = new BigInteger("97");
        BigInteger wynik = NRB.mod(dzielnik);
        if (wynik.intValue()==1) {
            System.out.println("Numer rachunku bankowego jest porpawny");
        }
    }
    public static void main(String [] args){
        pobieranie_NRB();
    }
}