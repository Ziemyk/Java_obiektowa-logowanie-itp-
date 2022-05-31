package pl.zadanie;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("ma","ma123","P","P");
        System.out.println(account.authorize("ma","ma123"));
        Account account2 = new Account("login", "passw", "aaa","bbb");
        System.out.println(account2.getLogin());
        Account account3 = new Account("login", "passw", "aaa","bbb");
        System.out.println(account3.getLogin());

        Teacher teacher = new Teacher("logT","aaa","Filip","Pal","pdg");
        Student student1 = new Student("aaa","pss","Michał","Talk","Informatyka",2019);
        Student student2 = new Student("aaa","pss","Michalł","Takl","Informatyka",2019);
        Student student3 = new Student("aaa","pss","Michałl","Tkal","Informatyka",2019);
       // System.out.println(student.semestr());

      //  Subject subject = new Subject("bhp","Inforamtyka",3);
       // SubjectInstance subjectInstance = new SubjectInstance(subject,2020,teacher,2);



      //  Enroller enroller = new RandomEnroller();
       // enroller.setSubjectInstance(subjectInstance);
      //  enroller.addStudent(student1);
      //  enroller.addStudent(student2);
      //  enroller.addStudent(student3);
      //  enroller.process();
      //  System.out.println(subjectInstance.copyStudentsList());



    }
}
