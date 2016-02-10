/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sunset.domain;
import java.util.*;
/*
 * FILENAME:
 * DESCRIPTION: This file will intitiate the attributes as well as implement
 *              the setters/getters.  Override methods will also be utilized
 * @author      Chip
 * VERSION:     CapstoneProjV1
 */
public class Invoice extends Lease{
    
    /* Variables */
    private String  invoiceID,
                    billDue,
                    billPaid,
                    firstNotice,
                    lastNotice;
    
    /* Default Constructor */
    public Invoice(){
    }
    
    /* Constructor */
    public Invoice(String invoiceID, String billDue, String billPaid, 
            String firstNotice, String lastNotice, int leaseID, int residenceID, String duration,
            String startDate, String endDate){
        
        super(leaseID, duration, startDate, endDate);
        
        this.invoiceID = invoiceID;
        this.billDue = billDue;
        this.billPaid = billPaid;
        this.firstNotice = firstNotice;
        this.lastNotice = lastNotice;
    }
    
        
    /* Getter for invoiceID */
    public String getInvoiceID(){
        return invoiceID;
    }
    
    /* setter for invoiceID */
    public void setInvoiceID(String invoiceID){
        this.invoiceID = invoiceID;
    }
    
    /* getter for billDue */
    public String getBillDue(){
        return billDue;
    }
    
    /* setter for billDue */
    public void setBillDue(String billDue){
        this.billDue = billDue;
    }
    
    /* getter for billPaid */
    public String getBillPaid(){
        return billPaid;
    }
    
    /* setter for billPaid */
    public void setBillPaid(String billPaid){
        this.billPaid = billPaid;
    }
    
    /* getter for firstNotice */
    public String getFirstNot(){
        return firstNotice;
    }
    
    /* setter for firstNotice */
    public void setFirstNot(String firstNotice){
        this.firstNotice = firstNotice;
    }
    
    /* getter for lastNotice */
    public String getLastNot(){
        return lastNotice;
    }
    
    /* setter for lastNotice */
    public void setLastNot(String lastNotice){
        this.lastNotice = lastNotice;
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Invoice other = (Invoice) obj;
        if(!Objects.equals((this.invoiceID), other.invoiceID)){
            return false;
        }
        return true;
    }
    
    /* Override validate */
    public boolean validate(){
        if(invoiceID == null){
            return false;
        }
        return true;
    }
    
}