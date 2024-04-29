package lecture1.openClosePrinciple.badCode;

import lecture1.singleResponsibilityPrinciple.badCode.Invoice;

public class InvoiceDao {
    Invoice invoice;
    public InvoiceDao(Invoice invoice)
    {
        this.invoice = invoice;
    }
    public void saveToDb()
    {
        //save to db
    }
    //open for extension, closed for modification
    //extend its capability, dont modify
    public void saveToFile()
    {
        //save to file
    }
}
