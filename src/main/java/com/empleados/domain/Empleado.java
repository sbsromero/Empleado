package com.empleados.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Empleado {

	private Long id;
	private Long organizacionId;
	private Long departamentoId;
	private String nombreEmpleado;
	private int edad;
	private String cargo;

	public Empleado(Long organizacionId, Long departamentoId, String nombreEmpleado, int edad, String cargo) {
		this.organizacionId = organizacionId;
		this.departamentoId = departamentoId;
		this.nombreEmpleado = nombreEmpleado;
		this.edad = edad;
		this.cargo = cargo;
	}

}
