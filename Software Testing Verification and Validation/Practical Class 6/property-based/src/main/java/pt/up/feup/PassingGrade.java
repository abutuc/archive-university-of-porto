package pt.up.feup;

// A student passes an exam if they get a grade >= 9.5 and fails if they
// get a grade < 9.5.  A grade falls in the range [0.0, 20.0].
public class PassingGrade {
    public boolean passed(float grade) {
        assert grade >= 0.0 && grade <= 20.0;
        return grade >= 9.5;
    }
}

