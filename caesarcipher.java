//I have looked over and its certainly possible to make a caesar cipher with shifts chosen by the user.
// MAXIMUM SHIFTS CAN BE 25.
import java.util.Scanner;
public class caesarcipher
{
    private char [] alpha = {'A','B','C','D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
    private int []encrpt = new int[1000];// what is the purpose of the value '1000'
    void initializer(int index, int val)
    {
        encrpt[index] = val;
    }

    static char library(char x, int len, int key)
    {
        caesarcipher cc = new caesarcipher();
        int in=0;
        for(int j=0; j<len; j++)
        {
            for(int i=0; i<=26; i++)
            {
                if(cc.alpha[i] == x)
                {
                    in = i+key;
                }
                cc.initializer(j, in);
            }
        }
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
            store = library(sep, l, key);
        }
    }
}

/*
 * for(int ele: arr){
 * 
 * }
 */