package pl.zadanie;

import java.util.ArrayList;
import java.util.List;

public class SubjectInstance {
    private Subject subject;
    private int year;
    private Teacher teacher;
    public List<Student> students = new ArrayList<>();
    private int limit;

    public SubjectInstance(Subject subject, int year, Teacher teacher, int limit) {
        this.subject = subject;
        this.year = year;
        this.teacher = teacher;
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public boolean enroll(Student student) {
        if (students.size() < limit) {
            return true;
        }
        return false;
    }
    public final Student copyStudentsList()
    {
        Student.copyOf(students);

        return null;
    }


}
