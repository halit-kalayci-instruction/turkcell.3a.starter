package org.turkcell;

public class CorporateCustomer extends Customer {
    private String taxNo;

    public CorporateCustomer(String taxNo) {
        super(); // 1 üst superclass
        this.taxNo = taxNo;
    }
}
// 21:00