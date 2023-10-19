package com.java.ejb;

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
@Table(name = "EMPLOYEE_New")
public class Employee implements Serializable {
 
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
 
    @Column(name = "first_name", length = 50)
    private String firstName;
 
    @Column(name = "last_name", length = 50)
    private String lastName;
 
    @Column(name = "email", length = 50)
    private String email;
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
    
    
}

