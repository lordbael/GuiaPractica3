package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estudiante;
import com.example.demo.service.EstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@GetMapping(value = "/")
	public List<Estudiante> getAllStudents(){
		return estudianteService.findAll();
	}
	
	@GetMapping(value = "/ {numEstudiante}")
	public Estudiante getAllStudentByNumber(@PathVariable("numEstudiante")Long numEstudiante){
		return estudianteService.findbyNumero(numEstudiante);
	}
	
	@GetMapping(value = "/ {correo}")
	public Estudiante getEstudianteCorreo(@PathVariable("correo")String correo){
		return estudianteService.findByCorreo(correo);
	}
	
	@GetMapping(value = "/ orderByGpa")
	public List<Estudiante> findAllByOrderGpaDesc(){
		return estudianteService.findAllOrderByGpa();
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<?> SaveOrUpdateStudent(@RequestBody Estudiante estudiante){
		estudianteService.saveOrUpdateStudent(estudiante);
		return  new ResponseEntity("Estudiante agregado con éxito",HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{numEstudiante}")
	public void deleteStudent(@PathVariable Long numEstudiante) {
		estudianteService.deleteStudent(estudianteService.findbyNumero(numEstudiante).getId());
	}
	

}




