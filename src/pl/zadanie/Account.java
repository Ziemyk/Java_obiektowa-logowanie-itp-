package pl.zadanie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String login;
    private String password;
    private String first_name;
    public String last_name;
    private LocalDate lastLogin;

    private static List<Account> accountList  = new ArrayList<>();

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public static List<Account> getAccountList() {
        return accountList;
    }

    public Account(String login, String password, String first_name, String last_name) {
       while(isLoginUsed(login)){
           login += "1";
       }
        this.login = login;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.lastLogin = LocalDate.of(1970,1,1);
        accountList.add(this);
    }
    public Account(Account account){
        this(account.login, account.password, account.first_name, account.last_name);
        this.lastLogin = account.lastLogin;
    }

    public String getLogin() {
        return login;
    }

    public boolean authorize(String log, String pass){
        if(log.equals(login) && pass.equals(password)){
            lastLogin = LocalDate.now();
            return true;
        }else{
            return false;
        }
    }
    public final String toString() {
        return first_name+ " "+ last_name;
    }
    private boolean isLoginUsed(String login){
        for(var log : accountList ) {
            if (log.login.equals(login)) return true;

        }
            return false;


    }
}
