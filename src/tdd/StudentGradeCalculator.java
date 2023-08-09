package tdd;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Loading ");
        rotatingCircleAnimation();
        int numStudents = readValidInput(scanner, "\nHow many students do you have?", 0, 100);

        int numSubjects = readValidInput(scanner, "How many subjects do they offer?", 0, 100);


        System.out.print("Saving ");
        int iteration = 10;

        for (int i = 0; i < iteration; i++) {
            System.out.print("🔸"+"🔹");
            Thread.sleep(300);
        }
        System.out.println("\nsaved successfully");


            int[][] scores = new int[numStudents][numSubjects];

            for (int student = 0; student < numStudents; student++) {
                System.out.println("Entering score for student " + (student + 1) + ":");
                for (int subject = 0; subject < numSubjects; subject++) {
                    System.out.print("Enter score for subject " + (subject + 1) + ":\n");
                    scores[student][subject] = readValidInput(scanner, null, 0, 100);
                    System.out.print("Saving ");
                    for (int i = 0; i < iteration; i++) {
                        System.out.print("🔸"+"🔹");
                        Thread.sleep(200);
                    }
                    System.out.println("\nSaved successfully\n");
                }

            }


            int[] subjectTotals = new int[numSubjects];
            for (int subject = 0; subject < numSubjects; subject++) {
                for (int student = 0; student < numStudents; student++) {
                    subjectTotals[subject] += scores[student][subject];
                }
            }

            int[] studentTotals = new int[numStudents];
            for (int student = 0; student < numStudents; student++) {
                for (int subject = 0; subject < numSubjects; subject++) {
                    studentTotals[student] += scores[student][subject];
                }
            }

            int[] highestScoresPerSubject = new int[numSubjects];
            int[] lowestScoresPerSubject = new int[numSubjects];
            for (int subject = 0; subject < numSubjects; subject++) {
                highestScoresPerSubject[subject] = Integer.MIN_VALUE;
                lowestScoresPerSubject[subject] = Integer.MAX_VALUE;
                for (int student = 0; student < numStudents; student++) {
                    int score = scores[student][subject];
                    if (score > highestScoresPerSubject[subject]) {
                        highestScoresPerSubject[subject] = score;
                    }
                    if (score < lowestScoresPerSubject[subject]) {
                        lowestScoresPerSubject[subject] = score;
                    }
                }
            }

            int classTotalScore = 0;
            for (int student = 0; student < numStudents; student++) {
                classTotalScore += studentTotals[student];
            }
            double classAverageScore = (double) classTotalScore / (numStudents * numSubjects);

            int passThreshold = 50;
            int[] numPassesPerSubject = new int[numSubjects];
            int[] numFailsPerSubject = new int[numSubjects];
            for (int subject = 0; subject < numSubjects; subject++) {
                for (int student = 0; student < numStudents; student++) {
                    int score = scores[student][subject];
                    if (score >= passThreshold) {
                        numPassesPerSubject[subject]++;
                    } else {
                        numFailsPerSubject[subject]++;
                    }
                }
            }

            int hardestSubjectIndex = 0;
            int easiestSubjectIndex = 0;
            double hardestSubjectAverage = (double) subjectTotals[0] / numStudents;
            double easiestSubjectAverage = (double) subjectTotals[0] / numStudents;
            for (int subject = 1; subject < numSubjects; subject++) {
                double average = (double) subjectTotals[subject] / numStudents;
                if (average < hardestSubjectAverage) {
                    hardestSubjectAverage = average;
                    hardestSubjectIndex = subject;
                }
                if (average > easiestSubjectAverage) {
                    easiestSubjectAverage = average;
                    easiestSubjectIndex = subject;
                }
            }

            int overallHighestScore = studentTotals[0];
            int overallLowestScore = studentTotals[0];
            for (int student = 1; student < numStudents; student++) {
                int totalScore = studentTotals[student];
                if (totalScore > overallHighestScore) {
                    overallHighestScore = totalScore;
                }
                if (totalScore < overallLowestScore) {
                    overallLowestScore = totalScore;
                }
            }

            int bestGraduatingStudentIndex = 0;
            int worstGraduatingStudentIndex = 0;
            for (int student = 1; student < numStudents; student++) {
                if (studentTotals[student] > studentTotals[bestGraduatingStudentIndex]) {
                    bestGraduatingStudentIndex = student;
                }
                if (studentTotals[student] < studentTotals[worstGraduatingStudentIndex]) {
                    worstGraduatingStudentIndex = student;
                }
            }

        System.out.println("=============================================================");
            System.out.println("Scores for each subject:");
        System.out.println("=============================================================");
            for (int subject = 0; subject < numSubjects; subject++) {
                System.out.println("Subject " + (subject + 1) + " Total: " + subjectTotals[subject] +
                        " Average: " + (double) subjectTotals[subject] / numStudents);
            }
        System.out.println("=============================================");
        System.out.println("=============================================");

        System.out.println("\nSUBJECT SUMMARY:");
        for (int subject = 0; subject < numSubjects; subject++) {
            System.out.println("Highest Scoring subject is: "+ (subject + 1) +": scoring:"+ highestScoresPerSubject[subject] +
                    " \nLowest Scoring subject is: " + lowestScoresPerSubject[subject]);
        }
        for (int subject = 0; subject < numSubjects; subject++) {
            System.out.println("Subject " + (subject + 1) + " Passes: " + numPassesPerSubject[subject] +
                    " Fails: " + numFailsPerSubject[subject]);
        }

        System.out.println("Hardest Subject: Subject " + (hardestSubjectIndex + 1) +
                " with Average Score: " + hardestSubjectAverage);
        System.out.println("Easiest Subject: Subject " + (easiestSubjectIndex + 1) +
                " with Average Score: " + easiestSubjectAverage);

        System.out.println("Overall Highest Score: " + overallHighestScore);
        System.out.println("Overall Lowest Score: " + overallLowestScore);
        System.out.println("===============================================================");
        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println("===============================================================");
        System.out.println("Best Graduating Student: Student " + (bestGraduatingStudentIndex + 1) +
                " with Total Score: " + studentTotals[bestGraduatingStudentIndex]);
        System.out.println("===============================================================");
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst Graduating Student: Student " + (worstGraduatingStudentIndex + 1) +
                " with Total Score: " + studentTotals[worstGraduatingStudentIndex]);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("===============================================================");
        System.out.println("Class total Score is: " + classTotalScore);
        System.out.println("Class Average score is: " + classAverageScore);
        System.out.println("===============================================================");


    }
    public static int readValidInput(Scanner scanner, String prompt, int min, int max) {
        if (prompt != null) {
            System.out.print(prompt + "\n ");
        }

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }
    public static void rotatingCircleAnimation() throws InterruptedException {
        String[] animationFrames = {"🇬🇪", "🇺🇲", "🇬🇧", "🇳🇬","🇦🇱","🇧🇷","🇨🇦","🇩🇰","🇳🇬"};

        int iterations = 25;
        for (int i = 0; i < iterations; i++) {
            System.out.print("\r" + animationFrames[i % animationFrames.length]);
            Thread.sleep(500);
        }

    }

    }
