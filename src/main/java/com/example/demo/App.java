package com.example.demo;

import com.example.demo.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customer customer = new Customer();
    	customer.setCustName("Lallo Pallo");
    	System.out.println("Customer Name is : " + customer.getCustName());
    }
}
