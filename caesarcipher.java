//I have looked over and its certainly possible to make a caesar cipher with shifts chosen by the user.
// MAXIMUM SHIFTS CAN BE 25
import java.util.Scanner;
public class caesarcipher
{
    private static String library(String x, int key){
        String cipher = "";
        x = x.toUpperCase();
        char e = 'A';
        for (int i=0; i<x.length(); i++) {
            e = x.charAt(i);
            if (Character.isLetter(e))
                e = (char) ('A' + (e - 'A' + key) % 26);
            cipher += e;
        }
        return cipher;
    }
    public static void main(String[] args)
    {
        caesarcipher cc = new caesarcipher();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message: ");
        String n = in.nextLine();
        System.out.print("Enter no. of shifts: ");
        int key = in.nextInt();
        String cipher = cc.library(n, key);
        System.out.println(cipher);
        in.close();
    }
}

/*
 * for(int ele: arr){
 *
 * }
 */