package st10133334_part2;

import javax.swing.JOptionPane;

//This method was adapted from Java Guides
//https://www.javaguides.net/2020/03/java-scanner-tutorial-reading-login-and-registration-user-input.html
//Java Guides

public class Main {

    public static void mainMenu1() {
        JOptionPane.showMessageDialog(null, "Welcome to the Registration Form!! \n", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);

        //Register Form
        String firstName = JOptionPane.showInputDialog(null, "Enter First Name:", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);
        if (firstName == null) {
            System.exit(0);
        }
        String secondName = JOptionPane.showInputDialog(null, "Enter Second Name:", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);
        if (secondName == null) {
            System.exit(0);
        }

        Login formObject = new Login();

        //Username Details
        formObject.registerUser();

        //Password Details
        formObject.registerPass();
        JOptionPane.showMessageDialog(null, "Welcome " + firstName + ", " + secondName + " it is great to see you.", "Registeration Form", JOptionPane.INFORMATION_MESSAGE);

        //Login Details
        int option = JOptionPane.showConfirmDialog(null, "Would you like to login?", "Login Form", JOptionPane.YES_NO_OPTION);
        if (option == 1) {
            System.exit(0);
        }
        if (option == 0) {
            formObject.returnLoginStatus();
            JOptionPane.showMessageDialog(null, "Welcome " + firstName + ", " + secondName + " it is great to see you again.", "Login Form", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban!!", "Login Form", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.exit(0);
        }
    }

    public static void mainMenu2() {
        String menu = "Select a menu below :";
        menu += "\n1. Add tasks";
        menu += "\n2. Show report";
        menu += "\n3. Quit Application";
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "The Task Master", JOptionPane.INFORMATION_MESSAGE));

        switch (option) {
            case 1:
                Task.initializeArray();
                Task.loop(Task.size_of_array);
                break;

            case 2:
                Task.searchReport();
                break;

            case 3:
                Task.exitApp();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid menu option selected.");
                mainMenu2();
                break;
        }
    }
}
