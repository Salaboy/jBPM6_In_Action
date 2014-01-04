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
public class Appointment {
    private String id;
    private Date appointmentDateTime;
    private Patient patient;
    private Doctor doctor;
    private HospitalUnit unit;

    public Appointment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(Date appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public HospitalUnit getUnit() {
        return unit;
    }

    public void setUnit(HospitalUnit unit) {
        this.unit = unit;
    }
    
    
}
