package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante findbyNumero(Long numEstudiante) {
		// TODO Auto-generated method stub
		return estudianteRepository.findbyEstudiante(numEstudiante);
	}

	@Override
	public Estudiante findByCorreo(String correo) {
		// TODO Auto-generated method stub
		return estudianteRepository.findByCorreo(correo);
	}

	@Override
	public List<Estudiante> findAllOrderByGpa() {
		// TODO Auto-generated method stub
		return estudianteRepository.findByOrderByGpa();
	}

	@Override
	public void saveOrUpdateStudent(Estudiante estudiante) {
		estudianteRepository.save(estudiante);

	}

	@Override
	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		estudianteRepository.deleteById(id);
	}


}
