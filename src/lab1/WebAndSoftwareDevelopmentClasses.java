/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Nick
 */
public abstract class WebAndSoftwareDevelopmentClasses {
    
    private String courseRoomNumber;
    private String courseBuildingLocationLetter;
    
    
    public abstract void getTeacherNames();

    public String getCourseRoomNumber() {
        return courseRoomNumber;
    }

    public void setCourseRoomNumber(String courseRoomNumber) {
        if(courseRoomNumber == null || courseRoomNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Error: Enter course building location letter");
            System.exit(0);
        }
        this.courseRoomNumber = courseRoomNumber;
    }

    public String getCourseBuildingLocationLetter() {
        return courseBuildingLocationLetter;
    }

    public void setCourseBuildingLocationLetter(String courseBuildingLocationLetter) {
        if(courseBuildingLocationLetter == null || courseBuildingLocationLetter.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Error: Enter course building location letter");
            System.exit(0);
        }
        this.courseBuildingLocationLetter = courseBuildingLocationLetter;
    }
    
    
}
