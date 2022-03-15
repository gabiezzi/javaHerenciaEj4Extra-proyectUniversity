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
public class PersonEntity {
    
    protected String personName;
    protected String lastNamePerson;
    protected int idPerson;
    protected String civilStatus;

    public PersonEntity(String personName, String lastNamePerson, int idPerson, String civilStatus) {
        this.personName = personName;
        this.lastNamePerson = lastNamePerson;
        this.idPerson = idPerson;
        this.civilStatus = civilStatus;
    }

    public PersonEntity() {
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getLastNamePerson() {
        return lastNamePerson;
    }

    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    @Override
    public String toString() {
        return "personName=" + personName + ", lastNamePerson=" + lastNamePerson + ", idPerson=" + idPerson + ", civilStatus=" + civilStatus;
    }
    
    
    
}
