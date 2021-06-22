package group.family_organizer.entity;

import javax.persistence.*;

@Entity
@Table( name="user", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
public class User {

    @Column( name="first_name", nullable = false)
    private String firstName;

    @Column( name="last_name", nullable = false)
    private String lastName;

    @Column( name="dob", nullable = false)
    private String dob;

    @Column( name="email",nullable = false)
    private String email;

    @Column( name="phone_number")
    private String phoneNumber;

    @Column( name="password", nullable = false)
    private String password;

    @Id
    @Column( name="username",nullable = false)
    private String username;

    @Column( name="budget")
    private double budget;

    public User(String first_name, String last_name, String dob, String email, String phone_number, String password, String username,double budget) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phone_number;
        this.password = password;
        this.username = username;
        this.budget=budget;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone_number) {
        this.phoneNumber = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
