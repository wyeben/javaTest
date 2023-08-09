package tdd;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Problem> problems;

    public Person(String name) {
        this.name = name;
        this.problems = new ArrayList<>();
    }

    public void addProblem(String name, TypeOfProblems type) {
        problems.add(new Problem(name, type));
    }

    public void solveProblem(String problemName) {
        for (Problem problem : problems) {
            if (problem.getName().equals(problemName)) {
                problem.solve();
                return;
            }
        }
        System.out.println("Problem not found: " + problemName);
    }

    public List<Problem> getUnsolvedProblems() {
        List<Problem> unsolvedProblems = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.isSolved()) {
                unsolvedProblems.add(problem);
            }
        }
        return unsolvedProblems;
    }
    public static void main(String[] args) {
        Person person = new Person("Benson");

        person.addProblem("Financial Issue", TypeOfProblems.BUSINESS);
        person.addProblem("Lack of Motivation", TypeOfProblems.SPIRITUAL);
        person.addProblem("Math Homework", TypeOfProblems.EDUCATION);

        person.solveProblem("Lack of Motivation");

        List<Problem> unsolvedProblems = person.getUnsolvedProblems();
        System.out.println(Problem.getName() + "'s unsolved problems:");
        for (Problem problem : unsolvedProblems) {
            System.out.println(Problem.getName() + " (" + problem.getType() + ")");
        }
    }
}

