import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Input number of squares: ");
            int squares = in.nextInt();

            Matches matches = new Matches(squares);
            System.out.print("Minimum number of matches: " + matches.getMatchesQuantity());
        }
        catch(Exception e){
            System.out.print("Sorry, but we can not process your request. Please try again.");
        }
        catch(Error e){
           System.out.print(e.getMessage());
        }
    }

}
