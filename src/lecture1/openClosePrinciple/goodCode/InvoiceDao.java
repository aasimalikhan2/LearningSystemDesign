package lecture1.openClosePrinciple.goodCode;

import lecture1.singleResponsibilityPrinciple.badCode.Invoice;

public interface InvoiceDao {
    public void save(Invoice invoice);
}
