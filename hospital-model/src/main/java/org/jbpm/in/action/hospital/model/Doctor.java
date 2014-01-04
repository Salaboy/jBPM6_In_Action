/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbpm.in.action.hospital.model;

import java.util.Date;

/**
 *
 * @author salaboy
 */
public class Doctor extends HospitalStaff {
    private HospitalUnit unit;
    private Date startedOn;

    public Doctor() {
    }

    public HospitalUnit getUnit() {
        return unit;
    }

    public void setUnit(HospitalUnit unit) {
        this.unit = unit;
    }

    public Date getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(Date startedOn) {
        this.startedOn = startedOn;
    }
    
}
