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
public class Cardiology implements HospitalUnit{
    private String id;
    private String unitName;

    public Cardiology() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
    
    
    
}
