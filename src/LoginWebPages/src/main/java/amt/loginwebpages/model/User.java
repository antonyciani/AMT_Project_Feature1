/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amt.loginwebpages.model;

/**
 *
 * @author Antony
 */
public class User {
    
    private final String userName;
    private final String password;
    private final String firstName;
    private final String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.userName = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    

    @Override
    public String toString() {
        return "User{" + "username=" + userName + ", password=" + password + '}';
    }
    
    
}
