
/**
 * This InstrumentToSell class have 4 instance variables which extends Instrument.
 * Constructors is created with 2 variables and assign the values from InstrumentToSell.
 * Setters method and Getters method is created with to get or set values for private access modifiers.
 * instruments sell is used to set,get and display variables.
 * display method is used with same signature of Instrument and used to display the variables.
 *
 * @author (Yukesh Gharti Magar)
 * @version (21049627)
 */
public class InstrumentToSell extends Instrument
{    
    //instance variable:price is declared
    private float price;
    //instance variable:sellDate is declared
    private String sellDate;
    //instance variable:discountPercent is declared
    private float discountPercent;
    //instance variable:isSold is declared
    private boolean isSold;
    
    //constructors
    public InstrumentToSell(String instrument_name,float price)
    {
        super(instrument_name);
        this.price = price;
        this.sellDate ="";
        this.discountPercent = 0.0f;
        this.isSold = false;
    }
    //setters method for the variable : price
    public void setprice(float price)
    {
        if(this.isSold == false)
        {
            this.price = price;
            System.out.println("The price is:"+price);
        }
        else
        {
            System.out.println("it is therefore not possible to chanage the price which the price is already taken");
            
        }
    }
    
    //setters method for the variable : sellDate
    public void setsellDate(String sellDate)
    {
        this.sellDate = sellDate;
    }
    
    //setters method for the variable : discountPercent
    public void setdiscountPercent(float discountPercent)
    {
        this.discountPercent = discountPercent;
    }
    
    //setters method for the variable : isSold
    public void setisSold(boolean isSold)
    {
        this.isSold = isSold;
    }
    
    //getters method for the variable : price
    public float getprice()
    {
        return this.price;
    }
    
    //getters method for the variable : sellDate 
    public String getsellDate()
    {
        return this.sellDate;
    }
    
    //getters method for the variable : discountPercent
    public float getdiscountPercent()
    {
        return this.discountPercent;
    }
    
    //getters method for the variable : isSold
    public boolean getisSold()
    {
        return this.isSold;
    }
    //instruments_sell method
    public void instruments_sell(String customer_name,
    String customer_mobileNumber,int customer_permanentAccountNumber,
    String sellDate,float discountPercent)
    {
        if(this.isSold == true)
        {
           System.out.println("The customer name is:"+this.getcustomer_name());
           System.out.println("The customer mobileNumber is:"+this.getcustomer_mobileNumber());
           System.out.println("The customer permanentAccountNumber is:"+this.getcustomer_permanentAccountNumber());
        }
        else
        {
           this.setcustomer_name(customer_name);
           this.setcustomer_mobileNumber(customer_mobileNumber);
           this.setpermanentAccountNumber(customer_permanentAccountNumber);
           this.setsellDate(sellDate);
           this. setdiscountPercent(discountPercent);
           this.isSold = true;
           super.getcustomer_name();
           super.getcustomer_mobileNumber();
           super.getcustomer_permanentAccountNumber();
           this.price = this.price-((this.discountPercent /100)*this.price);
        }
    }
    //display method
    public void display()
    {
        super.display();
      System.out.println("The price of instrument is:"+getprice());
      if(this.isSold == true)
      {
        System.out.println("The customer name is:"+getcustomer_name());
        System.out.println("The customer mobileNumber is:"+getcustomer_mobileNumber());
        System.out.println("The customer permanentAccountNumber is:"+getcustomer_permanentAccountNumber());
        System.out.println("The sellDate is:"+getsellDate());
      }
      
      
      
    }
}
