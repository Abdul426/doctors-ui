package com.ibm.ro.openshift.mysqlui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.ro.openshift.mysqlui.model.Doctor;
import com.ibm.ro.openshift.mysqlui.service.DoctorService;

@Controller
@RequestMapping("/")
public class DoctorController {

	@Autowired
	DoctorService doctorService;

	@GetMapping
	public String homePage(Model model) {
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors = doctorService.findAll();
		model.addAttribute("doctors", doctors);
		return "home";
	}

	@GetMapping("/delete")
	public String delete(Model model) {
		return "delete";
	}

	@GetMapping("/create")
	public String create(Model model) {
		return "delete";
	}
	
	@PostMapping
	public String createDoctor(@RequestBody Doctor doctor, Model model) {
		System.out.println("In "+doctor);
		Doctor createdDoc = doctorService.createDoctor(doctor);
		model.addAttribute("doctor", createdDoc);
		return "create";
	}

}
