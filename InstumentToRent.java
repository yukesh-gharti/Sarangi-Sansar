
/**
 * This instrumentToRent has 5 variables:instance variables and extends Instrument.
 * Constructors is created with 2 parameters and call variables values from instrumentToRent with instrument_name from Instrument class.
 * Setters and Getters methods are created due to private access modifiers using for the variables.
 * Instrument_rent method,instruments_return,display method  are created for to display ,update,get variables.
 * 
 *
 * @author (Yukesh Gharti Magar)
 * @version (21049627)
 */
public class InstumentToRent extends Instrument
 {
    //instance variable:chargePerDay is declared
   private int chargePerDay;
   //instance variable:dateOfRent is declared
   private String dateOfRent;
   //instance variable:dateOfReturn is declared
   private String dateOfReturn;
   //instance variable:noOfDays is declared
   private int noOfDays;
   //instance variable:isRented is declared
   private boolean isRented;
   
   //constructors
   public InstumentToRent(String instrument_name, int chargePerDay)
   {
       super(instrument_name);
       this.chargePerDay = chargePerDay;
       this.dateOfRent = "";
       this.dateOfReturn = "";
       this.noOfDays = 0;
       this.isRented = false;
    
    }
      //setters method for the variable : chargePerDay
      public void setchargePerDay(int chargePerDay)
     {
      this.chargePerDay = chargePerDay;
     }
     
      //getters method for the variable : chargePerDay
      public int getchargePerDay()
     {
         return this.chargePerDay; 
     }
     
     //setters method for the variable : dateOfRent
     public void setdateOfRent(String dateOfRent) 
     {
         this.dateOfRent = dateOfRent;
     }
     
     //getters method for the variable : dateOfRent
     public String getdateOfRent()
     {
         return this.dateOfRent;
     }
     
     //setters method for the variable : dateOfReturn
     public void setdateOfReturn(String dateOfReturn)
     {
         this.dateOfReturn = dateOfReturn;
     }
     
     //getters method for the variable : dateOfReturn
     public String getdateOfReturn()
     {
         return this.dateOfReturn;
     }
     
     //setters method for the variable : noOfDays
     public void setnoOfDays(int noOfDays)
     {
         this.noOfDays = noOfDays;
     }
     
     //getters method for the variable : noOfDays
     public int getnoOfDays()
     {
         return this.noOfDays;
     }
     
     //setters method for the variable : isRented
     public void setisRented(boolean isRented)
     {
         this.isRented = isRented;
     }
     
     //getters method for the variable : isRented
     public boolean getisRented()
     {
         return this.isRented;
     }
     //Instrument_rent method
   public void Instrument_rent(String customer_name,String customer_mobileNumber,int permanentAccountNumber,String dateOfRent,String dateOfReturn,int noOfDays)
   {
       if(this.isRented == true)
       {
          System.out.println("This instrument is not available");
          System.out.println("customer_name:"+""+customer_name);
          System.out.println("customer_mobileNumber:"+""+customer_mobileNumber);
          System.out.println("dateOfReturn:"+""+dateOfReturn);
          
       }
       else
       {
          this.setcustomer_name(customer_name);
          this.setcustomer_mobileNumber(customer_mobileNumber);
          this.setpermanentAccountNumber(permanentAccountNumber);
          this.dateOfRent = dateOfRent;
          this.dateOfReturn = dateOfReturn;
          this.noOfDays = noOfDays;
          this.isRented = true;
          System.out.println("The name of the customer is: " +getcustomer_name());
          System.out.println("The customer_mobileNumber is:"+getcustomer_mobileNumber());
          System.out.println("The customer_permanentAccountNumber is:"+getcustomer_permanentAccountNumber());
          System.out.println("The dateOfReturn is:"+getdateOfReturn());
          System.out.println("The  dateOfRent is:"+getdateOfRent());
          System.out.println("The noOfDays is:"+getnoOfDays());
          int Total_charge = this.noOfDays * this.chargePerDay;
          System.out.println("The total_charge is"+Total_charge);
          
       }
       
    }
    //instruments_return method
    public void instruments_return()
    {
      if(this.isRented == false)
      {
          System.out.println("please rent the instrument");
      }
      else
      {
          this.setcustomer_name("");
          this.setcustomer_mobileNumber("");
          this.setdateOfReturn("");
          this.setdateOfRent("");
          this.setnoOfDays(0);
          this.setpermanentAccountNumber(0);
          this.isRented = false;
          
      }
    }
    //display method
    public void display()
    {
        super.display();
        if(this.isRented == true)
        {
            System.out.println("The name of customer is:"+ this.getcustomer_name());
            System.out.println("The customer mobileNumber is:"+this.getcustomer_mobileNumber());
            System.out.println("The customer permanentAccountNumber is:"+this.getcustomer_permanentAccountNumber());
            System.out.println("The dateOfReturn is:"+this.getdateOfReturn());
            System.out.println("The dateOfRent is:"+this.getdateOfRent());
         }
    }
}

