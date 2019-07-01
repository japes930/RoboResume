package Resume;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner keyboard = new Scanner(System.in);
       ArrayList<Education> eduList = new ArrayList<>();
        String cont;


        System.out.println("---BASIC INFORMATION---");
        System.out.println("Enter Full Name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter email address: ");
        String email = keyboard.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNum = keyboard.nextLine();

        Resume Resume1 = new Resume(name, email, phoneNum);
        Resume1.setName(name);
        Resume1.setEmail(email);
        Resume1.setPhoneNum(phoneNum);
        System.out.println();
        System.out.println("---EDUCATION:---");


        //Entering Education data
        System.out.println("Would you like to enter a college degree?[Yes/No]");
        String reply = keyboard.nextLine();
        if(reply.equalsIgnoreCase("yes")){
            do {
                System.out.println("What school did you go to?");
                String school = keyboard.nextLine();
                System.out.println("What type of degree did you get?");
                String degree = keyboard.nextLine();
                System.out.println("What was your major?");
                String major = keyboard.nextLine();
                System.out.println("What year did you graduate?");
                int year = keyboard.nextInt();

                Education eduNew = new Education(school, major, degree, year);
                eduList.add(eduNew);

                System.out.println("Would you like to enter more education?[Yes/No]");
                String x = keyboard.nextLine();

            }while(cont.equalsIgnoreCase("yes"));
        }

//        for(int i=0; i <eduList.size(); i++){
//            eduList.toString();
//            System.out.println();
//        }

        System.out.println(Resume1.toString());



        if(eduList.size()>0) {
            System.out.println("EDUCATION");
            for(int i=0; i <eduList.size(); i++) {
                System.out.println(eduList.get(i).toString());
            }
        }







    }
}
