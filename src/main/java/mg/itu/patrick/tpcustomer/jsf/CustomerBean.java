/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.patrick.tpcustomer.jsf;

import jakarta.inject.Inject;  
import jakarta.inject.Named;  
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mg.itu.patrick.tpcustomer.entity.Customer;
import mg.itu.patrick.tpcustomer.service.CustomerManager;

/**
 *
 * @author patrick
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    private List<Customer> customerList;
    
    @Inject
    private CustomerManager customerManager;  

    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    
    public List<Customer> getCustomers() {
        if (this.customerList == null) {
            this.customerList = customerManager.getAllCustomers();
        }
        return this.customerList;
    }
    
}
