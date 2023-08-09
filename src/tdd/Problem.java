package tdd;

public class Problem {
    private static String name;
    private TypeOfProblems type;
    private boolean status;

    public Problem(String name, TypeOfProblems type) {
        this.name = name;
        this.type = type;
        this.status = false;
    }

    public static String getName() {
        return name;
    }

    public TypeOfProblems getType() {
        return type;
    }

    public boolean isSolved() {
        return status;
    }

    public void solve() {
        status = true;
    }
}

