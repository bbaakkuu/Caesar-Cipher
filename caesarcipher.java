//I have looked over and its certainly possible to make a caesar cipher with shifts chosen by the user.
// MAXIMUM SHIFTS CAN BE 25
import java.util.Scanner;
public class caesarcipher
{
    private char [] alpha = {'A','B','C','D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
    private int []encrpt;
    void Setter_encrpt(int l){
        encrpt = new int[l];
    }
    

    static void library(char x, int len, int key){
        caesarcipher cc = new caesarcipher();
        cc.Setter_encrpt(len);
        int in=0;
        for(int j=0; j<len; j++){
            for(int i=0; i<=26; i++){
                if(cc.alpha[i] == x){
                    if(i==26)
                        cc.encrpt[j] = 26;
                    else{
                        in = i+key;
                        cc.encrpt[j] = in;
                    }
                }
            }
        }
    }
    static char[] setup(int []arr){
        
        return null;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message: ");
        String n = in.nextLine();
        System.out.print("Enter no. of shifts: ");
        int key = in.nextInt();
        int len = n.length();
        int i;char sep;
        for(i = 0; i<len; i++)
        {
            sep = n.charAt(i);
            library(sep, len, key);
        }
        in.close();
    }
}

/*
 * for(int ele: arr){
 * 
 * }
 */