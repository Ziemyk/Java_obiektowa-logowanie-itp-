package pl.zadanie;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticEnroller implements Enroller{

    private List<Student> studentList = new ArrayList<>();
    private  SubjectInstance si;
    @Override
    public void clear() {
        studentList.clear();

    }

    @Override
    public void setSubjectInstance(SubjectInstance si) {

        this.si = si;
    }

    @Override
    public void addStudent(Student s) {
        studentList.add(s);

    }

    @Override
    public void process() {
        studentList.sort((Student a,Student b)->a.getLast_name().compareTo(b.getLast_name()));
        si.students = studentList.subList(0,si.getLimit());
    }

}
