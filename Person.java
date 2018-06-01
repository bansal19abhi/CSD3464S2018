/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    String name;
    String address;
    String phoneNo;
    int age;
    char gender;
    Scanner in = new Scanner(System.in);
    
    //default constructor
    Person(){
        this.name = "Unknown";
        this.address = "Unknown";
        this.phoneNo = "Unknown";
        this.age = 1;
        this.gender = 'U';
                
    }
    
    //parameterized constructor
    Person(String name, String address, String phoneNo, char gender, int age){
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.age = age;
        
    }
    
    //copy constructor
    Person(Person anotherPerson){
        this.name = anotherPerson.name;
        this.address = anotherPerson.address;
        this.phoneNo = anotherPerson.phoneNo;
        this.gender = anotherPerson.gender;
        this.age = anotherPerson.age;
    }
    
    void setName(){
        
        System.out.println("Enter name: ");
        name = in.nextLine();
    }
    
    String getName(){
        return name;
    }
    
    void setAddress(){
        System.out.println("Enter address: ");
        address = in.nextLine();
    }
    
    String getAddress(){
        return address;
    }
    
    void setGender(){
        System.out.println("Enter gender : ");
        gender = (char)in.nextInt();
        in.nextLine();
    }            
    
    int getGender(){
        return gender;
    
    }
    
    void setAge(){
        System.out.println("Enter age: ");
        //age = in.nextInt();
        age = Integer.parseInt(in.nextLine());
    }
    
    int getAge(){ 
        return age;
    }
    
    
    
    void setphoneNo(){
        System.out.println("Enter phone no: ");
        phoneNo = in.nextLine();
    }
    
    String getphoneNo(){
        return phoneNo;
    }
    
    @Override
    public String toString(){
        String data = "Name: " + name + "\n" + 
                "Address: " + address + "\n" +
                "Phone No: " + phoneNo + "\n" +
                "Gender: " + gender + "\n" +
                "Age: " + age + "\n";
        
        return data;
    
    }
    
    void setData(){
        setName();
        setAddress();
        setphoneNo();
        setAge();
        setGender();
    }
}