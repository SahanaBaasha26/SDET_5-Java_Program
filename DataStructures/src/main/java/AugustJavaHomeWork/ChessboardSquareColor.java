package AugustJavaHomeWork;
public class ChessboardSquareColor {

    public static void main(String[] args) {
        String coordinates = "a1";
        boolean isWhiteSquare = isWhiteSquare(coordinates);
        System.out.println("The square with coordinates " + coordinates + " is white: " + isWhiteSquare);
    }

    public static boolean isWhiteSquare(String coordinates) {
        // Extract the letter and number from the coordinates
        char letter = coordinates.charAt(0);
        char number = coordinates.charAt(1);

        // Convert the letter to an index (0 for 'a', 1 for 'b', ..., 7 for 'h')
        int letterIndex = letter - 'a';

        // Convert the number to an integer
        int num = Character.getNumericValue(number);

        // Calculate the sum of the letter index and the number
        int sum = letterIndex + num;

        // Check if the sum is even (white square) or odd (black square)
        return sum % 2 == 0;
    }
}
