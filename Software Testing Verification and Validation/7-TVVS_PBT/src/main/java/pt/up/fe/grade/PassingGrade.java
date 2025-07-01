package pt.up.fe.grade;

public class PassingGrade {

    public boolean passed(float grade) {
        if (grade < 0.0 || grade > 20.0)
            throw new IllegalArgumentException();
        return grade >= 9.5;
    }
}
