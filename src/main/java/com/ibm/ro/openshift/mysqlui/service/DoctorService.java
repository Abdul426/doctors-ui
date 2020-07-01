package com.ibm.ro.openshift.mysqlui.service;

import java.util.List;

import com.ibm.ro.openshift.mysqlui.model.Doctor;

public interface DoctorService {

	public Doctor getDoctor(Long doctorId);

	public Doctor createDoctor(Doctor doctor);

	public List<Doctor> findAll();
}
