import java.util.Scanner;

public class question{
    public static void main(String[] args){
        //Define variables
        String inStr;
        int inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrLen = inStr.length();

        System.out.print("The reverse of the String \"" + inStr + "\" is \"");
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx){
            char letter = inStr.charAt(charIdx);
            
            System.out.print(letter);
            
        }
        System.out.print("\"");
        in.close();
    }
}