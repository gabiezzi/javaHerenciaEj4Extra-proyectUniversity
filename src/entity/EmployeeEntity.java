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
public class EmployeeEntity extends PersonEntity{
    
    private String yearOfIncorporation;
    private int dispatchNumber;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String yearOfIncorporation, int dispatchNumber, String personName, String lastNamePerson, int idPerson, String civilStatus) {
        super(personName, lastNamePerson, idPerson, civilStatus);
        this.yearOfIncorporation = yearOfIncorporation;
        this.dispatchNumber = dispatchNumber;
    }

    public String getYearOfIncorporation() {
        return yearOfIncorporation;
    }

    public void setYearOfIncorporation(String yearOfIncorporation) {
        this.yearOfIncorporation = yearOfIncorporation;
    }

    public int getDispatchNumber() {
        return dispatchNumber;
    }

    public void setDispatchNumber(int dispatchNumber) {
        this.dispatchNumber = dispatchNumber;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{"+ super.toString()+ "yearOfIncorporation=" + yearOfIncorporation + ", dispatchNumber=" + dispatchNumber + '}';
    }
    
    
    
    
}
