package lecture1.singleResponsibilityPrinciple.badCode;

import lecture1.Marker;

public class Invoice {
    Marker marker;
    int quantity;

    void calculateTotal()
    {
        //if some new thing is introduced in calculation like GST, the calculation logic changes
        //1 reason to change
    }
    void printInvoice() {
        //If the printing logic is changed, maybe the format that needs to be printed is changed
        //2 reasons to change
    }
    void saveToDb()
    {
        //If the saving location is changed, hence the logic will be changed
        //3 reasons to change
    }
}
