package pl.zadanie;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RandomEnroller implements Enroller {
    private class StudentWithRandomNumber{
        final Student student;
        public Double getValue(){

            return value ;
        }
        final Double value;

        private StudentWithRandomNumber(Student student,double value) {
            this.student = student;
            this.value = value;
        }
    }
    List<StudentWithRandomNumber> students = new ArrayList<>();
    SubjectInstance instance;


    @Override
    public void clear() {
        students.clear();

    }

    @Override
    public void setSubjectInstance(SubjectInstance si) {
        this.instance = instance;

    }

    @Override
    public void addStudent(Student s) {

        students.add(new StudentWithRandomNumber(s, Math.random()));

    }

    @Override
    public void process() {
        students.sort(Comparator.comparingDouble(StudentWithRandomNumber::getValue));
        for(int i=0; i<instance.getLimit() && i<students.size();i++)
            instance.enroll(students.get(i).student);

    }
}
