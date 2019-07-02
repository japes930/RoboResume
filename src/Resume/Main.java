package Resume;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        ArrayList<Resume> resumeList = new ArrayList<>();
        ArrayList<Education> eduList = new ArrayList<>();
        ArrayList<Skills> skillsList = new ArrayList<>();
        ArrayList<Experience> expList = new ArrayList<>();
        ArrayList<Duties> dutyList = new ArrayList<>();

        String cont, skill, proficiency,
                compName, title, yrStart, yrEnd, desc, duty;


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
        if (reply.equalsIgnoreCase("yes")) {
            do {
                System.out.println("What school did you go to?");
                String school = keyboard.nextLine();
                System.out.println("What was your major?");
                String major = keyboard.nextLine();
                System.out.println("What type of degree did you get?");
                String degree = keyboard.nextLine();
                System.out.println("What year did you graduate?");
                String year = keyboard.nextLine(); //Had to change change from int to year or wouldn't allow input at liine 53


                Education eduNew = new Education(school, major, degree, year);
                eduList.add(eduNew);

                System.out.println("Would you like to enter more education?[Yes/No]");
                cont = keyboard.nextLine();

            } while (!cont.equalsIgnoreCase("no"));
        }


//Entering Work Experience
        System.out.println("---EXPERIENCE---");
        System.out.println("Do you have any previous experience that you would like to add?");
        reply = keyboard.nextLine();
        while (reply.equals("yes")){
            System.out.println("Enter the name of the company: ");
            compName = keyboard.nextLine();
            System.out.println("What was your title?");
            title = keyboard.nextLine();
            System.out.println("What month and year did you start?[Ex: August 2005]");
            yrStart = keyboard.nextLine();
            System.out.println("What month and year did you end?[Ex: September 2006](Or type 'Current')");
            yrEnd = keyboard.nextLine();

            do{
                System.out.println("Enter duties:");
                duty = keyboard.nextLine();
                Duties newDuty = new Duties(duty);
                dutyList.add(newDuty);
                System.out.println("Would you like to enter more duties?[Yes/No]");
                cont = keyboard.nextLine();
            } while (!cont.equalsIgnoreCase("no"));

            Experience newExp = new Experience(compName, title, yrStart, yrEnd);
            expList.add(newExp);
            System.out.println("Would you like to enter more work experience?");
            reply = keyboard.nextLine();
        }

//        System.out.println("number of jobs: " + expList.size()); TEST CODE


//Entering Skills data
        System.out.println("---SKILLS---");
        System.out.println("Would you like to add skills?");
        reply = keyboard.nextLine();
        while (reply.equalsIgnoreCase("yes")) {
            System.out.println("Enter Skill: ");
            skill = keyboard.nextLine();
            System.out.println("What level of proficiency? (Fundamental, Novice, Intermediate, Advanced, Expert)");
            proficiency = keyboard.nextLine();

            Skills newSkill = new Skills(skill, proficiency);
            skillsList.add(newSkill);
            System.out.println("Would you like to enter more skills?[Yes/No]");
            reply = keyboard.nextLine();
        }

//        System.out.println("number of skills: " + skillsList.size()); TestCode


//Printing information

        System.out.println(Resume1.toString());

        if (eduList.size() > 0) {
            System.out.println();
            System.out.println("EDUCATION");
            for (int i = 0; i < eduList.size(); i++) {
                System.out.println(eduList.get(i).toString());
                System.out.println();
            }
        }

        if (expList.size() > 0) {
            System.out.println("EXPERIENCE");
            for (int i = 0; i < expList.size(); i++) {
                System.out.println(expList.get(i).toString());
                for (int j = 0; j < dutyList.size(); j++){
                    System.out.println(dutyList.get(j).toString());
                }
                System.out.println();
            }

        }

        if (skillsList.size() > 0) {
            System.out.println();
            System.out.println("SKILLS");
            for (int i = 0; i < skillsList.size(); i++) {
                System.out.println(skillsList.get(i).toString());
            }
            System.out.println();
        }

    }
}
