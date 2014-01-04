/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbpm.in.action.hospital.model;

/**
 *
 * @author salaboy
 */
public class Nurse extends HospitalStaff{
    private String category;

    public Nurse() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
}
