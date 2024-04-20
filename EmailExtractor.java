package Day9.RegEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

    public static void main(String[] args) {
        String text = "Sample text with email addresses udhue  parameh@123.com ihdoied idjio[q;ad;kdooidAsdf;kjjhP		WEOIODJDIEDJC pravi@example.com, devika.doe@test.org, and my@company.co.uk";

        // Regular expression to match email addresses
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        // Find and display all occurrences of email addresses
        while (matcher.find()) {
            System.out.println("Email found: " + matcher.group());
        }
    }
}
