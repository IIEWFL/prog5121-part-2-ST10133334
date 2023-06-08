package st10133334_part2;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//This method was adapted from YouTube
//https://www.youtube.com/watch?v=2JzEhwpg_0U&list=PL480DYS-b_kfHSYf2yzLgto_mwDr_U-Q6
//VCSOIT
//https://www.youtube.com/@VCSOIT/about

//This method was adapted from Brown University
//https://cs.brown.edu/courses/cs016/static/files/docs/javaunittesting.pdf
//Brown University

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class TaskTest {
    
    static Task obj = null;
    
    public TaskTest() {
    }

    @Test
    public void testInitializeArray() {
    }

    @Test
    public void testResetRepeatFlag() {
    }

    @Test
    public void testLoop() {
    }

    @Test
    public void testCheckTaskDescription() {
        obj = new Task();
        assertEquals(true, obj.checkTaskDescription("libero justo laoreet sit amet cursus"
                + " sit amet dictum sit (Under 50 words)"));
        assertEquals(false, obj.checkTaskDescription("a iaculis at erat pellentesque adipiscing commodo "
                + "elit at imperdiet dui accumsan sit amet nulla facilisi morbi tempus iaculis urna id volutpat lacus laoreet "
                + "non curabitur gravida arcu ac tortor dignissim convallis aenean et tortor at risus viverra adipiscing at in "
                + "tellus integer feugiat scelerisque varius morbi enim nunc faucibus (Over 50 words)"));
    }

    @Test
    public void testCreateTaskID() {
        obj = new Task();
        String taskName1 = "Login Feature";
        int taskNumber1 = 0;
        String developerName1 = "Robyn";
        String expectedTaskID1 = "LO:0:BYN";
        String actualTaskID1 = obj.createTaskID(taskName1, taskNumber1, developerName1);
        Assert.assertEquals(expectedTaskID1, actualTaskID1);

        String taskName2 = "Add Task Feature";
        int taskNumber2 = 1;
        String developerName2 = "Mike";
        String expectedTaskID2 = "AD:1:IKE";
        String actualTaskID2 = obj.createTaskID(taskName2, taskNumber2, developerName2);
        Assert.assertEquals(expectedTaskID2, actualTaskID2);
    }
    
    //This method was adapted from webucator
    //https://www.webucator.com/article/how-to-write-a-unit-test-in-java/
    //webucator

    @Test
    public void testPrintTaskDetails() {
        //Test Data for Task1 and Task2
        Task task0 = new Task();
        task0.duration = 8;
        
        Task task1 = new Task();
        task1.duration = 10;
        
        int totalHours1 = task0.duration + task1.duration;
        Assert.assertEquals(18, totalHours1);
        
        //Addition Test Data
        Task task2 = new Task();
        task2.duration = 10;
        
        Task task3 = new Task();
        task3.duration = 12;
        
        Task task4 = new Task();
        task4.duration = 55;
        
        Task task5 = new Task();
        task5.duration = 11;
        
        Task task6 = new Task();
        task6.duration = 1;
        
        int totalHours2 = task2.duration + task3.duration + task4.duration + task5.duration + task6.duration;
        Assert.assertEquals(89, totalHours2);
    }

    @Test
    public void testReturnTotalHours() {
    }

    @Test
    public void testCreateTask() {
    }

    @Test
    public void testSearchReport() {
    }

    @Test
    public void testExitApp() {
    }
    
}
