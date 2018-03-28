package com.kodilla.good.patterns.food2door;


public class MailInformationService implements InformationService {
    public void inform(Supplier supplier) {
        System.out.println("Confirmation e-mail sent to supplier: " + supplier.getName());
    }
}
