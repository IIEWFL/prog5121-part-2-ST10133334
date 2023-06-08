package st10133334_part2;

import javax.swing.JOptionPane;

//This method was adapted from Software Testing Help
//https://www.softwaretestinghelp.com/add-elements-to-array-java/
//Software Testing Help

//This method was adapted from YouTube
//https://www.youtube.com/watch?v=ih0wQ1nBkTA
//Math and Science
//https://www.youtube.com/@MathAndScience/about

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class Task {
    
    String name, surname, description, details, taskID, status;
    int num = 0, duration;

    public static int size_of_array;

    public static Task[] taskArray;

    public static void initializeArray() {
        String input = JOptionPane.showInputDialog(null, "Enter number of tasks to add:", "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);

        if (input == null) {
            Main.mainMenu2();
            return;
        }

        size_of_array = Integer.parseInt(input);
        taskArray = new Task[size_of_array];
    }

    public static boolean repeat;

    public static void resetRepeatFlag() {
        repeat = false;
    }

    public static void loop(int numTasks) {
        Task.resetRepeatFlag();

        for (int taskCount = 0; taskCount < numTasks; taskCount++) {
            Task ts = new Task();
            JOptionPane.showMessageDialog(null, "Task Number : " + (taskCount + 0), "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);
            Task.createTask(ts, taskCount);
        }

        int totalHours = Task.returnTotalHours();
        JOptionPane.showMessageDialog(null, "Total hours across all tasks: " + totalHours, "Total hours", JOptionPane.INFORMATION_MESSAGE);

        Main.mainMenu2();
    }
    
    //This method was adapted from w3resources
    //https://www.w3resource.com/java-exercises/method/java-method-exercise-5.php#:~:text=print(%22Input%20the%20string%3A,int%20count%20%3D%200%3B%20if%20(!(
    //w3sources

    int i, add;

    public boolean checkTaskDescription(String descriptionWords) {
        i = add = 0;

        if (!(" ".equals(descriptionWords.substring(0, 1))) || !(" ".equals(descriptionWords.substring(descriptionWords.length() - 1)))) {
            while (i < descriptionWords.length()) {
                if (descriptionWords.charAt(i) == ' ') {
                    add++;
                }
                i++;
            }
            add = add + 1;
        }

        boolean checkDes = false;
        if (add < 50) {
            checkDes = true;
        }
        return checkDes;
    }

    public String createTaskID(String taskName, int taskNumber, String developerName) {
        String taskID;
        taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerName.substring(developerName.length() - 3).toUpperCase();
        return taskID;
    }

    public static String printTaskDetails(String taskStatus, String taskName, String taskSurname, int taskNum, String taskDetails, String taskDescription, String task_ID, int taskDuration) {
        String taskPrint;
        taskPrint = "\n* * * * * * * * * * * * * * * * * * * * * * * * *";
        taskPrint += "\nTask Status: " + taskStatus;
        taskPrint += "\nDevelopers Details: " + taskName + " " + taskSurname;
        taskPrint += "\nTask Number: " + taskNum;
        taskPrint += "\nTask Name: " + taskDetails;
        taskPrint += "\nTask Description: " + taskDescription;
        taskPrint += "\nTask ID: " + task_ID;
        taskPrint += "\nTask Duration: " + taskDuration;
        return taskPrint;

    }

    //This method was adapted from GeeksforGeeks
    //https://www.geeksforgeeks.org/java-program-to-find-sum-of-array-elements/
    //GeeksforGeeks
    
    public static int returnTotalHours() {
        int totalHours = 0;
        for (Task info : taskArray) {
            totalHours += info.duration;
        }
        return totalHours;
    }

    public static void createTask(Task info, int index) {
        info.details = JOptionPane.showInputDialog(null, "Enter the name of the task :", "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);
        if (info.details == null) {
            Main.mainMenu2();
        }
        
        info.num = index;

        info.description = JOptionPane.showInputDialog(null, "Enter a short description of the task"
                + "\n(description should not exceed 50 characters in length) :", "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);
        if (info.description == null) {
            Main.mainMenu2();
        }
        
        Task descriptionObj = new Task();
        boolean check_description = descriptionObj.checkTaskDescription(info.description);
        if (check_description == true) {
            JOptionPane.showMessageDialog(null, "Task successfully captured.", "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.", "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);
            Main.mainMenu2();
        }

        info.name = JOptionPane.showInputDialog(null, "Enter name :", "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);
        if (info.name == null) {
            Main.mainMenu2();
        }
        
        info.surname = JOptionPane.showInputDialog("Enter surname :");
        if (info.surname == null) {
            Main.mainMenu2();
        }

        String Duration = JOptionPane.showInputDialog(null, "Enter duration of task (hours) :", "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);
        if (Duration == null) {
            Main.mainMenu2();
            return;
        }
        info.duration = Integer.parseInt(Duration);

        Task IDObj = new Task();
        info.taskID = IDObj.createTaskID(info.details, info.num, info.name);
        JOptionPane.showMessageDialog(null, "Task Id : " + info.taskID, "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);

        info.status = "Task Status :";
        info.status += "\n1. To Do";
        info.status += "\n2. Done";
        info.status += "\n3. Doing";
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, info.status, "Adding Tasks", JOptionPane.INFORMATION_MESSAGE));

        switch (option) {
            case 1:
                info.status = "To Do";
                break;

            case 2:
                info.status = "Done";
                break;

            case 3:
                info.status = "Doing";
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid menu option selected.", "Adding Tasks", JOptionPane.INFORMATION_MESSAGE);
                Main.mainMenu2();
        }

        JOptionPane.showMessageDialog(null, printTaskDetails(info.status, info.name, info.surname, info.num,
                info.details, info.description, info.taskID, info.duration), "Displayed Task", JOptionPane.INFORMATION_MESSAGE);

        taskArray[index] = info;
    }

    public static void searchReport() {
        JOptionPane.showMessageDialog(null, "Coming Soon.", "Report", JOptionPane.INFORMATION_MESSAGE);
        Main.mainMenu2();
    }

    public static void exitApp() {
        JOptionPane.showMessageDialog(null, "Thank you for using the application. Good bye :)");
        System.exit(0);
    }  
}
