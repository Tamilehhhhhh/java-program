public class AlphaOrder {
    public static void main(String args[]) {
        char temp;
        char ab = 'a';
        char cd = 'e';
 if (ab > cd) {
            temp = ab;
            ab = cd;
            cd = temp;
        }
 System.out.println(ab + ", " + cd);
    }
}