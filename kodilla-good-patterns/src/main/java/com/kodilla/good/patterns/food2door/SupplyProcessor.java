package com.kodilla.good.patterns.food2door;


public class SupplyProcessor {
    private SupplierDataBase supplierDataBase;
    private InformationService informationService;
    private Repository repository;

    public SupplyProcessor(SupplierDataBase supplierDataBase, InformationService informationService, Repository repository) {
        this.supplierDataBase = supplierDataBase;
        this.informationService = informationService;
        this.repository = repository;
    }

    public void processSupply(final Request request){
        if(!supplierDataBase.getSupplierBase().containsValue(request.getSupplier())) {
            supplierDataBase.addSupplier(request.getSupplier());
            System.out.println("Supplier: " + request.getSupplier().getName() + " was not present in the database. Database enty created");
        }
        System.out.println("Supply order sent to : " + request.getSupplier().getName());
        boolean isPossible = request.getSupplier().process(request);
        if(isPossible) {
            informationService.inform(request.getSupplier());
            repository.createOrder(request.getSupplier(), request.getProduct());
        } else {
            System.out.println("Supplier " + request.getSupplier().getName()+" rejected order!");
        }
    }
}
