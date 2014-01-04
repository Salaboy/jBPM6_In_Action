/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbpm.in.action.hospital.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author salaboy
 */
public class Record {
    private String id;
    private Date recordDate;
    private Doctor doctor;
    private HospitalUnit unit;
    private String code;
    private List<Prescription>  prescriptions;
    private String observations;

    public Record() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
    
    
}
