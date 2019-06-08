package com.empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleados.domain.Empleado;
import com.empleados.repository.EmpleadoRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/empleados")
@Slf4j
public class EmpleadoController {

	@Autowired
	EmpleadoRepository empleadoRepository;

	@GetMapping("/")
	public List<Empleado> getEmpleados() {
		log.info("Lista de empleados");
		return empleadoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Empleado getEmpleadoPorId(@PathVariable("id") Long id) {
		log.info("Empleado por id");
		return empleadoRepository.findById(id);
	}

	@GetMapping("/departamento/{departamentoId}")
	public List<Empleado> getEmpleadosPorDepartamentoId(@PathVariable("departamentoId") Long departamentoId) {
		log.info("Obtener lista de empleados por id del departamento");
		return empleadoRepository.findByDepartamento(departamentoId);
	}

	@GetMapping("/organizacion/{organizacionId}")
	public List<Empleado> getEmpleadosPorOrganizacionId(@PathVariable("organizacionId") Long organizacionId) {
		log.info("Obtener lista de empleados por id de la organización");
		return empleadoRepository.findByOrganizacion(organizacionId);

	}
}
