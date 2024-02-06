package week4;

public class CheckPassword {
    public static boolean longEnough(String password) {
        return password.length() >= 12;
    }

    public static boolean atLeastTwoDigits(String password) {
        return password.replaceAll("[^0-9]", "").length() >= 2;
    }
    
    public static void main(String[] args) {
        if (args.length < 1)
            System.err.println("Usage: java CheckPassword <password>");
        else {
            String password = args[0];
            System.out.printf("Password is%s valid\n", longEnough(password) && atLeastTwoDigits(password) ? "" : " not");
        }
    }
}
