import java.util.*;

class Main {

    public static String CodelandUsernameValidation(String str) {
       
        if (str.length() < 4 || str.length() > 25) {
            return "false";
        }

        // Check if the username starts with a letter.
        if (!Character.isLetter(str.charAt(0))) {
            return "false";
        }

        // Check if the username contains only letters, numbers, and underscores.
        if (!str.matches("^[a-zA-Z0-9_]+$")) {
            return "false";
        }

        // Check if the username ends with an underscore character.
        if (str.charAt(str.length() - 1) == '_') {
            return "false";
        }

        // If all checks pass, return "true".
        return "true";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}
