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
public class TeacherEntity extends EmployeeEntity {

    private String departament;

    public TeacherEntity(String departament, String yearOfIncorporation, int dispatchNumber, String personName, String lastNamePerson, int idPerson, String civilStatus) {
        super(yearOfIncorporation, dispatchNumber, personName, lastNamePerson, idPerson, civilStatus);
        this.departament = departament;
    }

    public TeacherEntity() {
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "TeacherEntity{" + "departament=" + departament + '}';
    }

    
    
}
