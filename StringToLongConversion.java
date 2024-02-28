public class StringToLongConversion {
    public static void main(String[] args) {
        String numberAsString = "1234567890";
        try {
            long number = Long.parseLong(numberAsString);
            System.out.println("The string converted to long is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string is not a valid long number.");
        }
    }
}
