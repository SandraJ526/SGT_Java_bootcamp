package learn.programming;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    private String name;

    public String getName() {
        return name;
    }
    public String surname;

    public String getSurname() {
        return surname;
    }
    private List<Account> accounts = new ArrayList<>();

    public Iterable<Account> getAccounts (){
        return accounts;
    }

    public String addAccount (Account account) {
        accounts.add(account);
        return " ";
    }
}
