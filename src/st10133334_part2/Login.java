package st10133334_part2;

import javax.swing.JOptionPane;

//This method was adapted from tutorialspoint
//https://www.tutorialspoint.com/check-whether-a-character-is-uppercase-or-not-in-java#:~:text=To%20check%20whether%20a%20character,isUpperCase()%20method.
//tutorialspoint

//This method was adapted from W3schools
//https://www.w3schools.com/java/ref_string_lastindexof.asp
//W3schools

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Login {

    String usernameInput;
    String passwordInput;

    //Checking Username
    public boolean checkUserName(String username) {
        boolean userName = false;
        if (5 >= username.length() && username.indexOf('_') != -1) {
            userName = true;
        }
        return userName;
    }

    //This method was adapted from W3schools
    //https://www.w3schools.com/java/java_conditions.asp
    //W3schools
    
    public void registerUser() {
        usernameInput = JOptionPane.showInputDialog(null, "For the username it must:\n"
                + "~ Contain an underscore (_)\n"
                + "~ Not have more than 5 characters\n"
                + "Please enter your username here:", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);

        if (usernameInput == null) {
            System.exit(0);
        }

        Login usernameObject = new Login();

        boolean check_username = usernameObject.checkUserName(usernameInput);
        if (check_username == true) {
            JOptionPane.showMessageDialog(null, "Username successfully captured", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username\n"
                    + "contains an underscore and is no more than 5 characters in length", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

    }

    //This method was adapted from GURU99
    //https://www.guru99.com/java-strings.html
    //GURU99
    
    //Checking Password
    int i, count, symbols, digit;

    public boolean checkPasswordComplexity(String password) {
        i = count = symbols = digit = 0;

        for (i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                count++;
            }
        }

        for (i = 0; i < password.length(); i++) {
            if (!Character.isAlphabetic(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                symbols++;
            }
        }

        for (i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digit++;
            }
        }

        boolean passWord = false;
        if (8 <= password.length() && count != 0 && symbols != 0 && digit != 0) {
            passWord = true;
        }

        return passWord;
    }

    public void registerPass() {
        passwordInput = JOptionPane.showInputDialog(null, "For the password it must:\n"
                + "~ Have at least 8 characters long\n"
                + "~ Contain a capital letter\n"
                + "~ Contain a number\n"
                + "~ Contain a special character\n"
                + "Please enter your password here:", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);

        if (passwordInput == null) {
            System.exit(0);
        }

        Login passwordObject = new Login();

        boolean check_password = passwordObject.checkPasswordComplexity(passwordInput);
        if (check_password == true) {
            JOptionPane.showMessageDialog(null, "Password successfully captured", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password "
                    + "contains at least 8 characters, a capital letter, a number and a special character.", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

    }

    //Login Details
    public boolean loginUser() {
        String inputUsername = JOptionPane.showInputDialog(null, "Enter your username:", "Login Form", JOptionPane.INFORMATION_MESSAGE);
        String inputPassword = JOptionPane.showInputDialog(null, "Enter your password:", "Login Form", JOptionPane.INFORMATION_MESSAGE);

        if (inputUsername == null || inputPassword == null) {
            System.exit(0);
        }

        return inputUsername.equals(usernameInput) && inputPassword.equals(passwordInput);

    }

    public void returnLoginStatus() {
        if (loginUser() == true) {
        } else {
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.", "Login Form", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}
