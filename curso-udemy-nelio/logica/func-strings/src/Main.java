import java.lang.foreign.StructLayout;

public class Main {
    static void main() {
        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2, 9);
        String s6 = original.replace('a', 'x');
        String s7 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.printf("Original: -%s-%n", original);
        System.out.printf("toLowerCase: -%s-%n", s1);
        System.out.printf("toUpperCase: -%s-%n", s2);
        System.out.printf("trim: -%s-%n", s3);
        System.out.printf("substring(2): -%s-%n", s4);
        System.out.printf("substring(2, 9): -%s-%n", s5);
        System.out.printf("replace('a', 'x'): -%s-%n", s6);
        System.out.printf("replace('abc', 'xy'): -%s-%n", s7);
        System.out.printf("indexOF('bc'): -%d-%n", i);
        System.out.printf("lastIndexOf:('bc') -%d-%n", j);

        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.printf("vect[0]: %s%n", word1);
        System.out.printf("vect[1]: %s%n", word2);
        System.out.printf("vect[2]: %s%n", word3);
    }
}
