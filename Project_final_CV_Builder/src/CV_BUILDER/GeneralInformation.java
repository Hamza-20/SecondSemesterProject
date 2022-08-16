/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CV_BUILDER;

/**
 *
 * @author DELL LATITUDE E 7450
 */
abstract class GeneralInformation {
    
  

    abstract String writename();

    abstract String writebirthdate();

    abstract String writecontact();

    abstract String writeaddress();

    abstract String writeage();

    abstract String writenationality();

    abstract String writeMaritalstatus();

    abstract String writeCareerObjective();
    
  void Exit(){
      System.out.println("Exiting your file");
       System.exit(0);
  }

}

abstract class GeneralSkillsInformation {

      
    abstract String writeSkills();

    abstract String writeLanguages();

    abstract String writeawards();
    
      void Exit(){
      System.out.println("Exiting your file");
       System.exit(0);
  }

}

abstract class GeneralQualificationInforamtion{
    abstract String intermediateEducation();
    
    abstract String universityEducation();
    
      void Exit(){
      System.out.println("Exiting your file");
       System.exit(0);
  }
}