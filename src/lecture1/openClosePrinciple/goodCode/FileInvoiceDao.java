package lecture1.openClosePrinciple.goodCode;

import lecture1.singleResponsibilityPrinciple.badCode.Invoice;

public class FileInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        //save to file
    }
}
