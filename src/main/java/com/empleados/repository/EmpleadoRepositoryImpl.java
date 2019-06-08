package com.empleados.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.empleados.domain.Empleado;

public class EmpleadoRepositoryImpl implements EmpleadoRepository {

	private List<Empleado> empleados = new ArrayList<>();

	@Override
	public Empleado add(Empleado empleado) {
		empleado.setId((long) (empleados.size() + 1));
		empleados.add(empleado);
		return empleado;
	}

	@Override
	public Empleado findById(Long id) {

		Optional<Empleado> empleado = empleados.stream().filter(e -> e.getId().equals(id)).findFirst();

		if (empleado.isPresent())
			return empleado.get();

		return null;
	}

	@Override
	public List<Empleado> findAll() {
		return empleados;
	}

	@Override
	public List<Empleado> findByDepartamento(Long departamentoId) {

		return empleados.stream().filter(e -> e.getDepartamentoId().equals(departamentoId))
				.collect(Collectors.toList());
	}

	@Override
	public List<Empleado> findByOrganizacion(Long organizacionId) {

		return empleados.stream().filter(e -> e.getOrganizacionId().equals(organizacionId))
				.collect(Collectors.toList());
	}

}
