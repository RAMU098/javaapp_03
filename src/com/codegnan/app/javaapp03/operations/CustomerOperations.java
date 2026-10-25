package com.codegnan.app.javaapp03.operations;

import com.codegnan.app.javaapp03.entity.Customer;

import java.util.HashSet;
import java.util.Iterator;

public class CustomerOperations {
    private HashSet<Customer> customer = new HashSet<>();


    public CustomerOperations() {
        customer.add(new Customer(101, "Rahul", "Sharma", 'M'));
        customer.add(new Customer(102, "Priya", "Reddy", 'F'));
        customer.add(new Customer(103, "Arjun", "Kumar", 'M'));
        customer.add(new Customer(104, "Sneha", "Rao", 'F'));
        customer.add(new Customer(105, "Kiran", "Patel", 'M'));
    }

    public void displayCustomer() {
        for (Customer customers : customer) {
            System.out.println(customers);
        }
    }

    //Adding new Customers
    public boolean addCustomer(int id, String firstName, String lastName, char gender) {
        return customer.add(new Customer(id, firstName, lastName, gender));
    }

    //Update Customer Details
    public boolean updateCustomerDetails(int id, String firstName, String lastName, char gender) {
        Customer customers = findCustomerById(id);
        if (customer == null) {
            return false;
        }
        //remove before updating
        customer.remove(customers);
        customers.setFirstName(firstName);
        customers.setLastName(lastName);
        customers.setGender(gender);
        return customer.add(customers);
    }
    //Delete a customer
    public boolean deleteCustomer(int custmerId){
        Iterator<Customer> iterator=customer.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getId()==custmerId){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    //retrive all customers


    public HashSet<Customer> getCustomer() {
        return customer;
    }

    //find Customer By Id
    public Customer findCustomerById(int customerId){
        for(Customer customer:customer){
            if(customer.getId()==customerId){
                return customer;
            }
        }
        return null;
    }
    //find customer by FirstName
    public Customer findCustomerByFirstName(String customerfirstname){
        for(Customer customer1:customer){
            if(customer1.getFirstName()!=null && customer1.getFirstName().equals(customerfirstname)){
                return customer1;
            }
        }
        return null;
    }
}
