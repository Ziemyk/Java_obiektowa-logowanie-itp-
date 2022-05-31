package pl.zadanie;

public class Teacher extends Account {

    private String  title;

    public Teacher(String login, String password, String first_name, String last_name, String title) {
        super(login, password, first_name, last_name);
        this.title = title;
    }

}
