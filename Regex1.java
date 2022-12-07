
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex1 {
    public static void main(String[] args) {

        // 3 ways to write reges example in java
        Pattern p = Pattern.compile(".y");
        Matcher m = p.matcher("ay");
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

        /*
         * \\d digit from [0-9]
         * \\D non digit[^o-9]
         * \s any white space characters[\t\n\x0B\f\r]
         * \S any non white space characters [^\s]
         * \w any word character
         * \W any non word character
         * \b a word boundary
         */

        // regex metacharacters works as shortcuts

        System.out.print(Pattern.matches("\\d*", "9849290") + "  ");
        System.out.print(Pattern.matches(".\s", "c ") + "  ");
        System.out.println(Pattern.matches("\\D+", "jhf uhuhr"));

    }
}