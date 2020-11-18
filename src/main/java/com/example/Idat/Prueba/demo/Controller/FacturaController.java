package com.example.Idat.Prueba.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Idat.Prueba.demo.model.Factura;
// Taskkill /F /IM 4964

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/examen")
public class FacturaController {

	@GetMapping(value = "/Listar")
	@ApiOperation("Listado de todas las  facturas")
	public List<Factura> listar() {

		List<Factura> lista = new ArrayList<Factura>();
		lista.add(new Factura(01, 1, 600.80, "S"));
		lista.add(new Factura(02, 2, 700.00, "P"));
		lista.add(new Factura(03, 3, 420.20, "S"));
		lista.add(new Factura(04, 3, 666.99, "P"));
		lista.add(new Factura(05, 2, 800.19, "S"));

		return lista;

	}

	@ApiOperation("Calcula una lista de objetos tipo factura con estado "+"S"+" ")
	@PostMapping("/calcular")
	public String total(@ApiParam(required = true,value ="List<Factura>" )
	@RequestBody List<Factura> lista) 
	{

		double total = 0;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getEstadoFactura().equals("S")) {
				total = total + lista.get(i).getMontoFactura();
			}
		}
		return "El monto  total de las facturas pendientes de pago es: " + total;
	}

	@GetMapping(value = "/Listar/{idCliente}")
	@ApiOperation("Buscar la factura de una persona mediente su idPersona")
	public ResponseEntity<Factura> buscar(
			@ApiParam(required = true, value = "idCliente") @PathVariable("idCliente") int idCliente) {
		Factura factura = new Factura();

		if (idCliente == 1) {
			factura = new Factura(1, 1, 150.8, "S");
			return new ResponseEntity<Factura>(factura, HttpStatus.OK);
		}

		else if (idCliente == 2) {
			factura = new Factura(2, 2, 570.0, "P");
			factura = new Factura(2, 2, 300.19, "P");
			return new ResponseEntity<Factura>(factura, HttpStatus.OK);
		}

		else if (idCliente == 3) {
			factura = new Factura(3, 3, 154.2, "S");
			factura = new Factura(3, 3, 499.99, "P");
			return new ResponseEntity<Factura>(factura, HttpStatus.OK);
		}

		// Si no se encuentra ninguna de las facturas; devuelve el estado no encontrado
		else {
			return new ResponseEntity<Factura>(factura, HttpStatus.NOT_FOUND);
		}

	}

}
