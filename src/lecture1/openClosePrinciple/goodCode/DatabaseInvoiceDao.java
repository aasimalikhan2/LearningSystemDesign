package lecture1.openClosePrinciple.goodCode;

import lecture1.singleResponsibilityPrinciple.badCode.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice) {
        //save to Db
    }
}
