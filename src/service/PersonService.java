/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.PersonEntity;

/**
 *
 * @author Gabi
 */
public interface PersonService {
    
    public String changeCivilStatus(String civilStatus );
    
    public String showDataPerson(PersonEntity person);
    
}
