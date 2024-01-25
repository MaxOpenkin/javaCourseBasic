package addMaterials.extraHomework.addHomework2.task_2;

import java.util.Scanner;

public class StringMyName1 {

    public static void main(String[] args) {

        String userName = "Max";
        String greeting = "Hi " + userName + "!";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        String textMessage = scanner.nextLine();
        System.out.println(greeting);
        scanner.close();

    }



}

