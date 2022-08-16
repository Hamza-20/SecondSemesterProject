/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CV_BUILDER;

/**
 *
 * @author HP
 */
public  class Personalinfo extends GeneralInformation{

    String name;
    String lastname;
    String day;
    String month;
    String year;
    private String mobileno;
    private String emailId;
    private String address;
    String city;
    String country;
    String age;
    String nationality;
   private String Maritalstatus;
    String careerObjective;

    //Default
    Personalinfo() {
        this.name = "null";
        this.lastname = "null";
        this.day = "null";
        this.month = "null";
        this.year = "null";
        this.mobileno = "null";
        this.emailId = "null";
        this.address = "null";
        this.city = "null";
        this.country = "null";
        this.age = "null";
        this.nationality = "null";
        this.careerObjective = "null";
    }
//parameterized

    Personalinfo(String name, String lastname, String day, String month, String year, String mobileno, String emailId, String address, String city, String country, String age, String nationality, String careerObjective, String Maritalstatus) {
        this.name = name;
        this.lastname = lastname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.mobileno = mobileno;
        this.emailId = emailId;
        this.address = address;
        this.city = city;
        this.country = country;
        this.age = age;
        this.nationality = nationality;
        this.careerObjective = careerObjective;
        this.Maritalstatus = Maritalstatus;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMaritalstatus(String Maritalstatus) {
        this.Maritalstatus = Maritalstatus;
    }

 
    
   

    // writing personal info
    @Override
    String writename() {
        String head = "CURRICULUM VITAE:-";
        return head + "\n\n\t\t \t \t \t \t \t \t \t\t" + this.name.toUpperCase() + " " + this.lastname.toUpperCase();
    }

    @Override                                                                     
    public String writebirthdate() {
        return "\n\t\t\t\t \t \t \t \t\tDate Of Birth: " + this.day + "/" + this.month.substring(0, 1).toUpperCase() + this.month.substring(1) + "/" + this.year;
    }

    @Override
    public String writecontact() {
        return "\n\t\t\t \t \t \t \t \t Email:" + this.emailId + "\t|  Number: " + this.mobileno;
    }

    @Override                                                                             
    public String writeaddress() {
        return "\n \t \t \t \t \t \tResidential Adress: " + this.address + " " + city.substring(0, 1).toUpperCase() + this.city.substring(1) + " " + country.substring(0, 1).toUpperCase() + this.country.substring(1);
    }

    @Override
    public String writeage() {
        return "   |  Age: " + this.age;
    }

    @Override
    public String writenationality() {
        return "\n\t\t \t \t \t \t \t  Nationality: " + this.nationality.toUpperCase();
    }

    @Override
    public String writeMaritalstatus() {
        return "\t|  Marital Status: " + this.Maritalstatus.substring(0, 1).toUpperCase() + this.Maritalstatus.substring(1);
    }

    @Override
    public String writeCareerObjective() {
        return "\n_______________________________________________________________________________________________________________________________________________________________________\n\n CAREER OBJECTIVE:- \n *" + careerObjective.substring(0, 1).toUpperCase() + this.careerObjective.substring(1) + ".";
    }

      
}
