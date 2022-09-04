package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Estudiante;

@EnableMongoRepositories
@Repository
public interface EstudianteRepository extends MongoRepository<Estudiante, Integer>{
	
	Estudiante findbyEstudiante(Long numEstudiante);
	Estudiante findByCorreo(String correo);
	List<Estudiante> findByOrderByGpa();
	void deleteById(String id);
	

}
