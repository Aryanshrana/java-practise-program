
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex1 {
    public static void main(String[] args) {

        // 3 ways to write reges example in java
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        boolean f = Pattern.compile("..f").matcher("qkf").matches();

        boolean l = Pattern.matches("a......", "aryansh");

        System.out.println(b + " " + f + " " + l);

        // character classes
        System.out.println(Pattern.matches("[qwe]", "q"));// false, it only takes q,w or e (it's only true when only
                                                          // of three are present)
        System.out.println(Pattern.matches("[^art]", "a"));// any character expect a,r and t
        System.out.println(Pattern.matches("[a-dm-p]", "d"));// any character through a-d and m-p(inclusive)
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "o"));// any character from a-z except m-p(inclusive)

        // Regex Quantifers

        // quantifers specify the number of occurence of characters.

        // X? X COMES ONLY ONES OR NOT AT ALL
        // X+ X COMES 1 OR MORE TIMES
        // X* X COMES ZERO OR MORE TIMES
        // X{n} X COMES FOR N TIMES
        // X{n,} X COMES N OR MORE TIMES
        // X{y,z} X COMES ATLEAST Y BUT LESS THAN or equal Z TIMES

        System.out.println(Pattern.matches("[amt]+", "aaaammmttt"));
        System.out.println(Pattern.matches("[aqw]?", "w"));
        System.out.println(Pattern.matches("[fgh]*", ""));
        System.out.println(Pattern.matches("[qwe]{3,5}", "qqwwee"));

        // Regex metacharacters

        // regex metacharacters works as shortcuts

    }
}