package com.empleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.empleados.domain.Empleado;
import com.empleados.repository.EmpleadoRepository;
import com.empleados.repository.EmpleadoRepositoryImpl;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class EmpleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpleadosApplication.class, args);
	}

	@Bean
	EmpleadoRepository repository() {
		EmpleadoRepository empleadoRepository = new EmpleadoRepositoryImpl();
		empleadoRepository.add(new Empleado(1L, 1L, "John Smith", 34, "Analyst"));
		empleadoRepository.add(new Empleado(1L, 1L, "Darren Hamilton", 37, "Manager"));
		empleadoRepository.add(new Empleado(1L, 1L, "Tom Scott", 26, "Developer"));
		empleadoRepository.add(new Empleado(1L, 2L, "Anna London", 39, "Analyst"));
		empleadoRepository.add(new Empleado(1L, 2L, "Patrick Dempsey", 27, "Developer"));
		empleadoRepository.add(new Empleado(2L, 3L, "Kevin Price", 38, "Developer"));
		empleadoRepository.add(new Empleado(2L, 3L, "Ian Scott", 34, "Developer"));
		empleadoRepository.add(new Empleado(2L, 3L, "Andrew Campton", 30, "Manager"));
		empleadoRepository.add(new Empleado(2L, 4L, "Steve Franklin", 25, "Developer"));
		empleadoRepository.add(new Empleado(2L, 4L, "Elisabeth Smith", 30, "Developer"));
		log.info("Repositorio: {}", empleadoRepository);
		return empleadoRepository;
	}
}
