/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp;

/**
 *
 * @author 1505669
 */
public class Student {
    int age;
    double height;
    String firstName;
    String lastName;
    
    public Student(age, height, firstName, lastName){
    this.age = age;
    this.height = height;
    this.firstName = firstName;
    this.lastname = lastName;
    }
    
    public int getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
}
