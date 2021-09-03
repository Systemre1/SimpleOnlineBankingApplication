import java.lang.reflect.Array;

public class User {
    private String name;
    private String surname;
    private long customerNumber;
    private String mail;
    private String password;
    private long telephoneNumber;
    private long[] bankAccounts;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public long[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(long[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
