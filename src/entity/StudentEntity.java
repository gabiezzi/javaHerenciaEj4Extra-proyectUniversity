/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public class StudentEntity extends PersonEntity {
    
    private String course;

    public StudentEntity(String course, String personName, String lastNamePerson, int idPerson, String civilStatus) {
        super(personName, lastNamePerson, idPerson, civilStatus);
        this.course = course;
    }

    public StudentEntity() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentEntity{" + super.toString()+ "course=" + course + '}';
    }
    
    
}
