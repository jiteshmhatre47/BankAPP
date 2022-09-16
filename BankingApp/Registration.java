package BankingApp;

import java.util.Scanner;


public class Registration{
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    private long phoneNo;

public Registration(){

}
   

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }


    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", userName='" + getUserName() + "'" +
            ", password='" + getPassword() + "'" +
            ", emailId='" + getEmailId() + "'" +
            ", phoneNo='" + getPhoneNo() + "'" +
            "}";
    }
}