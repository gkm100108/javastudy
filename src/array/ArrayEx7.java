package array;

public class ArrayEx7 {
    public static void main(String[] args) {
        char[] alpha1 = new char[13];
        char[] alpha2 = new char[13];
        char [] alpha = new char[26];
        char first = 'A';
        for (int i = 0; i < alpha1.length; i++) {
            alpha1[i] = first;
            first++;
        }
        for (int i = 0; i < alpha2.length; i++) {
            alpha2[i] = first;
            first++;
        }
        System.arraycopy(alpha1, 0, alpha, 0, 13);
        System.arraycopy(alpha2, 0, alpha, 13, 13);
        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i]);
        }
    }
}
