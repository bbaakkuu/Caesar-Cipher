//I have looked over and its certainly possible to make a caesar cipher with shifts chosen by the user
import java.util.Scanner;
public class caesarcipher
{
    static char library(char x, int len){
        int ch = (int)x;
        return 'a';
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message: ");
        String n = in.nextLine();
        System.out.print("Enter no. of shifts: ");
        int key = in.nextInt();
        int l = n.length();
        int i;char sep, store;
        for(i = 0; i<l; i++)
        {
            sep = n.charAt(i);
            store = library(sep, l);
        }
    }
}
/*
 * for(int ele: arr){
 * 
 * }
 */