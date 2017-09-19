/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Nick
 */
public class Startup {
    public static void main(String[] args) {
        WebAndSoftwareDevelopmentClasses introToProgrammingClass = new IntroToProgrammingCourse();
        
        introToProgrammingClass.setCourseName("Intro To Programming");
        System.out.println(introToProgrammingClass.getCourseName());
        
        WebAndSoftwareDevelopmentClasses introJavaClass = new IntroJavaCourse();
        
        introJavaClass.setPrerequisites("Intro To Programming");
        System.out.println(introJavaClass.getPrerequisites());
        
        WebAndSoftwareDevelopmentClasses advancedJavaClass = new AdvancedJavaCourse();
        
        advancedJavaClass.setCourseNumber("2342");
        System.out.println(advancedJavaClass.getCourseNumber());
    }
}
