package com.devpredator.practicajpa.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.devpredator.practicajpa.entity.Restaurante;
import com.devpredator.practicajpa.dao.RestauranteDAO;

class RestauranteDAOImplTest {

	private RestauranteDAO restauranteDAO = new RestauranteDAOImpl();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGuardar() {
		Restaurante restaurante = new Restaurante();
		restaurante.setNombre("Restaurante El Semi-Nuevo");
		restaurante.setSlogan("No esta bueno");
		restaurante.setFechaCreacion(LocalDateTime.now());
		restaurante.setIdTipoRestaurante(1L);
		restaurante.setEstatus(true);

		this.restauranteDAO.guardar(restaurante);
	}

	@Test
	void testActualizar() {
		Restaurante restauranteConsultado = this.restauranteDAO.consultarById(16L);

		restauranteConsultado.setNombre("Restaurante Nuevo");
		restauranteConsultado.setSlogan("No esta bueno, pero te quita el hambre");

		this.restauranteDAO.actualizar(restauranteConsultado);
	}

	@Test
	void testEliminar() {
		this.restauranteDAO.eliminar(14L);
	}

	@Test
	void testConsultar() {
		List<Restaurante> restaurantesConsultados = this.restauranteDAO.consultar();
		assertTrue(restaurantesConsultados.size() > 0);

		for (Restaurante restaurante : restaurantesConsultados) {
			System.out.println("Nombre: " + restaurante.getNombre());
			System.out.println("Slogan: " + restaurante.getSlogan());
			System.out.println("Fecha de creacion: " + restaurante.getFechaCreacion());

		}
	}

	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
