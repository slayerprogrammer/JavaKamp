
package inheritance;


public class CustomerManager {
    
    public void addToIndividualCustomer(IndividualCustomer customer){
        System.out.println(customer.firstName + " Eklendi");
    }
    public void addToCorporateCustomer(CorporateCustomer customer){
        System.out.println(customer.companyName + " Eklendi");
    }
    
    
}
