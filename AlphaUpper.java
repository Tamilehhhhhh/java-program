import java.util.Scanner;
public class AlphaUpper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char value:");
        char ch=sc.next().charAt(0);
        char upper=Character.toUpperCase(ch);
        System.out.println("UpperCase:"+upper);
       
        
    }
}
