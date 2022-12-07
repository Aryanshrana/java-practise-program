import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Finder {
    static Scanner sc = new Scanner(System.in);

    public void textfinder() {
        System.out.println("enter the reg-ex");
        Pattern pattern = Pattern.compile(sc.nextLine());
        System.out.println("enter the text");
        Matcher m = pattern.matcher(sc.nextLine());

        boolean f = false;
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("we found the regex-> " + m.group() + " starting at index " + m.start()
                    + " and ending at index " + m.end());
            f = true;
        }
        System.out.println(count + " is total match found");
        if (!f) {
            System.out.println("sorry no match found");
        }

    }

    public static void main(String[] args) {
        Finder finder = new Finder();
        finder.textfinder();

    }
}
