/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Nick
 */
public class Startup {
    public static void main(String[] args) {
        
        // Started off not using Liskov Substitution principle to access and set credits
       AdvancedJavaCourse courseAdvancedJava = new AdvancedJavaCourse("Advanced Java", "24241");      
       courseAdvancedJava.setCredits(3.0);
       System.out.println(courseAdvancedJava.getCredits());
       
       
       WebAndSoftwareDevelopmentClasses courseIntroJava = new IntroJavaCourse("Intro To Java", "23411");
       courseIntroJava.setCourseBuildingLocationLetter("L");
       System.out.println(courseIntroJava.getCourseBuildingLocationLetter());
       
       WebAndSoftwareDevelopmentClasses courseIntroToProgramming = new IntroToProgrammingCourse("Intro To Programming", "23331");
       courseIntroToProgramming.setCourseRoomNumber("114");
       System.out.println(courseIntroToProgramming.getCourseRoomNumber());
       courseIntroToProgramming.getTeacherNames();
    }
}
