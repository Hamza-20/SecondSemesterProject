/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CV_BUILDER;

public class Qualification extends GeneralQualificationInforamtion{

    String intermediateEducation;
    String universityEducation;
    String intermediateField;
    String universityField;
    String universityYear;
    String intermediateYear;

    //Deafult Constructor
    Qualification() {
        this.intermediateEducation = "null";
        this.intermediateField = "null";
        this.intermediateYear = "null";
        this.universityEducation = "null";
        this.universityField = "null";
        this.universityYear = "null";
    }

    //Parameterized Constructor
    Qualification(String intermediateEducation, String intermediateField, String intermediateYear, String universityEducation, String universityField, String universityYear) {
        this.intermediateEducation = intermediateEducation;
        this.intermediateField = intermediateField;
        this.intermediateYear = intermediateYear;
        this.universityEducation = universityEducation;
        this.universityField = universityField;
        this.universityYear = universityYear;
    }
//methods for writing qualifications
   
    
    @Override
    String intermediateEducation() {
        return "\n\n QUALIFICATION:- \n * HSC II: " + this.intermediateEducation.substring(0, 1).toUpperCase() + this.intermediateEducation.substring(1) + "\n--> Studied " + this.intermediateField.toUpperCase() + " in " + this.intermediateYear;
    }

   
    @Override
     String universityEducation() {
        return "\n\n * BS: " + this.universityEducation.substring(0, 1).toUpperCase() + this.universityEducation.substring(1) + "\n--> Studying " + this.universityField.toUpperCase() + " batch " + this.universityYear;
    }

}
