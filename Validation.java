import java.util.*;

class Main {

    public static String UsernameValidation(String str) {
        if (str.length() < 4 || str.length() > 25) {
            return "false";
        }

        if (!Character.isLetter(str.charAt(0))) {
            return "false";
        }

        if (!str.matches("^[a-zA-Z0-9_]+$")) {
            return "false";
        }

        if (str.charAt(str.length() - 1) == '_') {
            return "false";
        }

        return "true";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numTestCases = s.nextInt();
        s.nextLine();

        for (int i = 0; i < numTestCases; i++) {
            String username = s.nextLine();
            System.out.println(UsernameValidation(username));
        }
    }
}
