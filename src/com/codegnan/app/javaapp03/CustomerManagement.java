package com.codegnan.app.javaapp03;

import com.codegnan.app.javaapp03.entity.Customer;
import com.codegnan.app.javaapp03.operations.CustomerOperations;

public class CustomerManagement {
    public static void main(String[] args) {
        CustomerOperations operations=new CustomerOperations();
        System.out.println("Initial Customer");
        operations.displayCustomer();
        System.out.println();
        System.out.println("Adding new Customer");
        boolean isAdded=operations.addCustomer(106,"Ananya","Verma",'F');
        System.out.println("Customer Added:"+isAdded);
        System.out.println();
        System.out.println("Adding same customer");
        boolean duplicate=operations.addCustomer(106,"Ananya","Verma",'F');
        System.out.println("Duplicate:"+duplicate);
        System.out.println();
        System.out.println("updating customer details");
        boolean update=operations.updateCustomerDetails(103,"Arjun","Reddy",'M');
        System.out.println("Customer update:"+update);
        System.out.println();
        System.out.println("Deleting customer details");
        boolean deleted=operations.deleteCustomer(104);
        System.out.println("Deleted customer details:"+deleted);
        System.out.println();
        System.out.println("Finding customer details by using id");
        Customer customerById =operations.findCustomerById(102);
        if(customerById!=null){
            System.out.println("customer id:"+customerById);
            System.out.println();
        }else{
            System.out.println("not found customer id");
        }
        System.out.println("Finding customer details by usingFirstName");
        Customer customerByFirstName=operations.findCustomerByFirstName("Kiran");
        if(customerByFirstName!=null){
            System.out.println(customerByFirstName);
            System.out.println();
        }else{
            System.out.println("not found the customer by name");
        }
        System.out.println("Finding customer by id");
        Customer missingCustomer=operations.findCustomerById(999);
        if(missingCustomer!=null){
            System.out.println(missingCustomer);
            System.out.println();
        }else{
            System.out.println("not found the customer id:999");
        }
        System.out.println();
        operations.displayCustomer();
    }
}
