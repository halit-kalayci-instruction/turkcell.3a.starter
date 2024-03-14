package org.turkcell;

// Inheritance => Kalıtım,Miras

// subclass - superclass
public class Customer extends User
{

    public Customer(String customerNo, String email, String password) {
        super(email,password); // superclass'ın ctor'ını çağırma
        this.customerNo = customerNo;
    }
    public Customer(String customerNo)
    {
        this(customerNo, "","");
    }
    public Customer() {

    }

    private String customerNo;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
}
