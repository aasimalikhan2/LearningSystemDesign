package lecture1.singleResponsibilityPrinciple.goodCode;

public class InvoiceDao {
    Invoice invoice;
    public InvoiceDao(Invoice invoice)
    {
        this.invoice = invoice;
    }
    public void saveToDb()
    {
        //Save to Db Logic
    }
}
