//RegEx - regular expression
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("moorthy", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("i am moorthy!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}