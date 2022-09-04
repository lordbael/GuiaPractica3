package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Estudiante;


public interface EstudianteService {
	
	List<Estudiante> findAll();
	Estudiante findbyNumero(Long numEstudiante);
	Estudiante findByCorreo(String correo);
	List<Estudiante> findAllOrderByGpa();
	void saveOrUpdateStudent(Estudiante estudiante);
	void deleteStudent(String id);

}
