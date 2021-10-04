/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.app;

import com.test.model.Category;
import com.test.model.Company;
import com.test.model.Course;
import com.test.model.Customer;
import com.test.model.Department;
import com.test.model.Order;
import com.test.model.Product;
import com.test.model.Student;
import com.test.model.Teacher;

/**
 *
 * @author Ahsan
 */
public class OneToMany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // A order can be given by only one customer where as customer can give multiple orders
        Customer ahsan = new Customer(1,"Ahsan");
        
        Order firstOrder = new Order(1,2000.0,ahsan);
        Order secondOrder = new Order(2,5000.50,ahsan);

        // A product can be in oly one category but in a single category there can be multiple products
        Category firstCategory = new Category(1,"Medicine");
        
        // A product can be of one company but a company can have multiple products
        Company aBC = new Company(1,"ABC");
        
        Product firstProduct = new Product(1, "Brufeen", aBC, firstCategory);
        Product secondProduct = new Product(1, "Panadol", aBC, firstCategory);
        
        // A Student can be enrolled in one course but in a single course multiple students can enrolled.
        Course oOP = new Course(1,"OOP");
        
        Student owais = new Student(1,"Ahsan",oOP);
        
        // Teacher can be belong to only Single department but a single department can have multiple teachers.
        Department computerSystems = new Department(1,"Computer Systems");
        
        Teacher aqib = new Teacher(1,"Aqib",computerSystems);
        
    }
    
}
