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
public class ServiceStaffEntity extends EmployeeEntity{
    
    private String assignedSection;

    public ServiceStaffEntity() {
    }

    public ServiceStaffEntity(String assignedSection, String yearOfIncorporation, int dispatchNumber, String personName, String lastNamePerson, int idPerson, String civilStatus) {
        super(yearOfIncorporation, dispatchNumber, personName, lastNamePerson, idPerson, civilStatus);
        this.assignedSection = assignedSection;
    }

    public String getAssignedSection() {
        return assignedSection;
    }

    public void setAssignedSection(String assignedSection) {
        this.assignedSection = assignedSection;
    }

    @Override
    public String toString() {
        return "ServiceStaffEntity{" + "assignedSection=" + assignedSection + '}';
    }

    

    
    
    
}
