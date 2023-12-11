/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycomputer.gpaappjavaa;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Gpaappjavaa {

    public static void main(String[] args) {
        
        

    
        Scanner scanner = new Scanner(System.in);

        

        // Input the number of courses
        int numCourses = getIntInput("Enter the number of courses: ", scanner);

        // Arrays to store course names, credit units, and scores
        String[] courseNames = new String[numCourses];
        int[] gradeUnits = new int[numCourses];
        double[] scores = new double[numCourses];

        // Input information for each course
        for (int i = 0; i < numCourses; i++) {
            System.out.println("\nEnter details for Course " + (i + 1) + ":");
            courseNames[i] = getInput("Course Name: ", scanner);
            gradeUnits[i] = getIntInput("Credit Units: ", scanner);
            scores[i] = getDoubleInput("Score: ", scanner);
        }

        // Calculate grades and print the table
       
        int totalQualityPoints = 0;
        int totalGradeUnits = 0;
        System.out.println("\nGrades and Credit Units Table");
        System.out.println("+------------------------------------------------+");
        System.out.printf("%-15s%-15s%-15s%-15s%n", "Course", "Credit Units", "Grade-Unit", "Grade");
        System.out.println("+------------------------------------------------+");
        
        for (int i = 0; i < numCourses; i++) {
            String grade = calculateGrade(scores[i]);
            int gradePoint = calculateGradePoint(scores[i]);

            totalQualityPoints += gradePoint * gradeUnits[i];
            totalGradeUnits += gradeUnits[i];

            printTableRow(courseNames[i], gradeUnits[i], gradePoint, grade);
        }

        printTableFooter();

        // Calculate and print GPA
        double gpa = (double) totalQualityPoints / totalGradeUnits;
        printGPA(gpa);

        scanner.close();
    }

    private static String getInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.next();
    }

    private static int getIntInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static double getDoubleInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void printTableHeader() {
       
    }

    private static void printTableRow(String courseName, int gradeUnits, int gradePoint, String grade) {
        
        System.out.printf("%-15s%-15d%-15d%-15s%n", courseName, gradeUnits, gradePoint, grade);
    }

    private static void printTableFooter() {
        System.out.println("+------------------------------------------------+");
    }

    private static void printGPA(double gpa) {
        System.out.println("\nTotal GPA: " + new DecimalFormat("#.##").format(gpa));
    }

    private static String calculateGrade(double score) {
        // Implement your logic to calculate the grade based on the score
        // For example, you can use if-else statements or a grading scale.
        return "A"; // Replace with your actual logic
    }

    private static int calculateGradePoint(double score) {
        // Implement your logic to calculate the grade point based on the score
        // For example, you can use if-else statements or a grading scale.
        return 4; // Replace with your actual logic
    }

    
    
    private static String grade(int score){
    if(score >=70){
        return"Ä";
    }
    else if(score>=60){
        return"B";
    }
    else if (score>=50){
        return"C";
    }
    else if (score>=45){
        return"D";
    }
    else if (score>=40){
        return"E";
    }
    else
        return"F";
    }
    
    
    private static int gradePoint(int score){
    if(score >=70){
        return 5;
    }
    else if(score>=60){
        return 4;
    }
    else if (score>=50){
        return 3;
    }
    else if (score>=45){
        return 2;
    }
    else if (score>=40){
        return 1;
    }
    else
        return 0;
    }
}

