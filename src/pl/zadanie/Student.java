package pl.zadanie;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Student extends Account {

    private String cours;
    private int startYear;

    public Student(String login, String password, String first_name, String last_name, String cours, int startYear) {
        super(login, password, first_name, last_name);
        this.cours = cours;
        this.startYear = startYear;
    }

    public static void copyOf(List<Student> students) {
    }




    public int semestr(){
        LocalDate date = LocalDate.now();
        int year =  date.getYear();
        Month month =  date.getMonth();
        if(month.compareTo(Month.OCTOBER)<0){
            year--;
        }
        int result = (year - startYear)*2+1;
        if(month.compareTo(Month.FEBRUARY)>=0 && month.compareTo(Month.OCTOBER)<0){
            result++;
        }
        return result;
    }
}
