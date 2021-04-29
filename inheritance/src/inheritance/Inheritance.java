package inheritance;

public class Inheritance {

    public static void main(String[] args) {

        IndividualCustomer customerIndi = new IndividualCustomer();
        customerIndi.id=1;
        customerIndi.firstName="Tolgahan";
        customerIndi.lastName="Öztürk";
        customerIndi.customerNumber="1";
        customerIndi.tcNo="1312313";
        
        
        CorporateCustomer corCustomer = new  CorporateCustomer();
        corCustomer.id=1;
        corCustomer.companyName="Ardensoft ltd şti.";
        corCustomer.customerNumber="2";
        corCustomer.textNumber="1312313";
        
        
        CustomerManager customerManager = new CustomerManager();
        customerManager.addToCorporateCustomer(corCustomer);
        customerManager.addToIndividualCustomer(customerIndi);
        
    }

}
