
/**
 * This Instrument class has 5 variables:1 variable is static and other is instance method.
 *Constructor is created with 1 one parameter and other variables values are call from Instrument. 
 * setters and getters method are used due to private modifier accessor used for the variables.
 * display method is used for to print the customers details and with instrumentID and instrumentName.
 *
 * @author (Yukesh Gharti Magar)
 * @version (21049627)
 */
public class Instrument
{
    //static variable:instrumentID is declared
     private static int instrumentID;
     //instance variable:instrument_name is declared
     private String instrument_name;
     //instance variable:customer_name is declared
     private String customer_name;
     //instance variable:customer_mobileNumber is declared
     private String customer_mobileNumber;
     //instance variable:customer_permanentAccountNumber is declared
     private int customer_permanentAccountNumber;
    
    //constructor
    public Instrument( String instrument_name)
    {
        this.instrument_name=instrument_name;
        instrumentID = ++instrumentID;
        this.customer_name="";
        this.customer_mobileNumber="";
        this.customer_permanentAccountNumber=0;
    }
   
        
     //   setters method for to the variable:id
    public void setinstrumentID(int instrumentID)
    {
        Instrument.instrumentID = instrumentID;
    }
    //setters method for to the variable:name
    public void setinstrument_name(String instrument_name)
    {
        this.instrument_name = instrument_name;
    }
    //setters method for to the variable:mobileNumber
    public void setcustomer_name(String customer_name)
    {
        this.customer_name= customer_name;
    }
    //setters method for to the variable:customer_mobileNumber
    public void setcustomer_mobileNumber(String customer_mobileNumber)
    {
        this.customer_mobileNumber= customer_mobileNumber;
    }
    //setters method for to the variable:customer_permanentAccountNumber
    public void setpermanentAccountNumber(int customer_permanentAccountNumber)
    {
        this.customer_permanentAccountNumber=customer_permanentAccountNumber;
    }
    
    //getters method for variable:id
    public int getinstrumentID()
    {
        return Instrument.instrumentID;   
    }
    //getters method for variable:instrument_name
    public String getinstrument_name()
    {
        return this.instrument_name;
    }
    //getters method for variable:customer_name
    public String getcustomer_name()
    {
        return this.customer_name;
    }
    //getters method for variable:customer_mobileNumber
    public String getcustomer_mobileNumber()
    {
        return this.customer_mobileNumber;
    }
    //getters method for variable:customer_permanentAccountNumber
    public int getcustomer_permanentAccountNumber()
    {
        return this.customer_permanentAccountNumber;
    }
    //display 
    public void display()
    {
        System.out.println("The instrumentID is:"+Instrument.instrumentID);
        System.out.println("The instrument_name is:"+this.instrument_name);
        
        if(customer_name.equals("") && customer_mobileNumber.equals("") && customer_permanentAccountNumber == 0)
        {
            
        }
        else
        {
            System.out.println(this.customer_name);
            System.out.println(this.customer_mobileNumber);
            System.out.println(this.customer_permanentAccountNumber);
        }
    }
    
}
