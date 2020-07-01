package com.ibm.ro.openshift.mysqlui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ibm.ro.openshift.mysqlui.model.Doctor;
import com.ibm.ro.openshift.mysqlui.service.DoctorService;

@Controller
public class DoctorController {
	@Value("${spring.application.name}")
	String appName;

	@Autowired
	DoctorService doctorService;

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors = doctorService.findAll();
		model.addAttribute("doctors", doctors);
		return "home";
	}

	@GetMapping("/delete")
	public String delete(Model model) {
		model.addAttribute("appName", appName);
		return "delete";
	}

	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("appName", appName);
		return "create";
	}

}
