package com.empleados.repository;

import java.util.List;

import com.empleados.domain.Empleado;

public interface EmpleadoRepository {

	public Empleado add(Empleado empleado);

	public Empleado findById(Long id);

	public List<Empleado> findAll();

	public List<Empleado> findByDepartamento(Long departamentoId);

	public List<Empleado> findByOrganizacion(Long organizacionId);

}
