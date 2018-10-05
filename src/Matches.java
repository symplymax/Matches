
public class Matches {

    private int squaresQuantity; // Number of squares
    private int matchesQuantity = 0; // Minimum number of matches

    public Matches(int squaresQuantity) {
        if(squaresQuantity < 0) throw new Error("Number of squares needs to be greater than 0.");
        this.squaresQuantity = squaresQuantity;
    }

    public int getMatchesQuantity() {
        if(matchesQuantity == 0) this.setMatchesQuantity();
        return this.matchesQuantity;
    }

    private void setMatchesQuantity() {
        int sum = 0;
        int width = (int) Math.sqrt(this.squaresQuantity);
        int length = this.squaresQuantity / width;
        int remainder = this.squaresQuantity - width * length;
        if (remainder != 0) {
            sum = 2 * remainder + 1;
        }

        this.matchesQuantity = width * (length + 1) + length * (width + 1) + sum;
    }
}
