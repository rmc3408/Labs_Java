package weeks;


// Declare an enum type with constructor and explicit instance fields 
// and accessors for these fields

public enum Enum //declare an enum type
{    
   // declare constants of enum type                                
   JHTP("Java How to Program", "2015"),                        
   CHTP("C How to Program", "2013"),                           
   IW3HTP("Internet & World Wide Web How to Program", "2012"),
   CPPHTP("C++ How to Program", "2014"),                       
   VBHTP("Visual Basic How to Program", "2014"),
   CSHARPHTP("Visual C# How to Program", "2014");

   // enum can have instance fields 
   private final String title; 
   private final String copyrightYear;

   // enum can include constructor
   Enum(String title, String copyrightYear) 
   { 
      this.title = title;
      this.copyrightYear = copyrightYear;
   } 

   // accessor for field title
   public String getTitle()
   {
      return title;
   } 

   // accessor for field copyrightYear
   public String getCopyrightYear()
   {
      return copyrightYear;
   } 
} 