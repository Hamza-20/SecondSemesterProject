/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CV_BUILDER;

public class SkillsInformation extends GeneralSkillsInformation{

    String osSkills, appSkills, editingSkills, programmingSkills, awards, languages, others;

    //Deafult Constructor
    SkillsInformation() {
        this.osSkills = "null";
        this.appSkills = "null";
        this.editingSkills = "null";
        this.programmingSkills = "null";
        this.awards = "null";
        this.languages = "null";
        this.others = "null";
    }

    //Parameterized Constructor
    SkillsInformation(String osSkills, String appSkills, String editingSkills, String programmingSkills, String awards, String languages, String others) {
        this.osSkills = osSkills;
        this.appSkills = appSkills;
        this.editingSkills = editingSkills;
        this.programmingSkills = programmingSkills;
        this.awards = awards;
        this.languages = languages;
        this.others = others;
    }
    //for writing skills

    @Override
     String writeSkills() {
        return "\n\n SKILLS:-\n" + "-> Computer Skills: Familiar with " + this.osSkills + "\n-> " + this.appSkills + "\n-> Familiar with Photo editing Softwares: " + this.editingSkills + "\n-> Worked on: " + this.programmingSkills.toUpperCase();
    }
    //for writing languages

 
    @Override
   String writeLanguages() {
        return "\n\n LANGUAGES:-\n-> Familar with " + this.languages.toUpperCase();
    }
    //for writing achievements

   
    @Override
   String writeawards() {
        return "\n\n ACHIEVEMENTS:-\n" + "-> " + this.awards + "\n\n OTHERS:- \n" + "-> " + this.others;
    }
}
