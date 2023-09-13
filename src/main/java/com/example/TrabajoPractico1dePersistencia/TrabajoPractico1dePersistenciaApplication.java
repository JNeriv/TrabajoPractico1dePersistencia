package com.example.TrabajoPractico1dePersistencia;

import com.example.TrabajoPractico1dePersistencia.Cliente;
import com.example.TrabajoPractico1dePersistencia.repositorios.ClienteRepository;
import com.example.TrabajoPractico1dePersistencia.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.TrabajoPractico1dePersistencia"})

public class TrabajoPractico1dePersistenciaApplication {
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	private ProductoRepository productoRepository;
	@Autowired
	private DetallePedidoRepository detallePedidoRepository;
	@Autowired
	private DomicilioRepository domicilioRepository;
	@Autowired
	private FacturaRepository facturaRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrabajoPractico1dePersistenciaApplication.class, args);
		System.out.println("Funciona todo");
	}

	@Bean
	public CommandLineRunner init() {
		return args -> {

			Domicilio domicilio = new Domicilio();
			domicilio.setCalle("9 de Julio");
			domicilio.setNumero("23");
			domicilio.setLocalidad("Buenos Aires");
			domicilioRepository.save(domicilio);

			Domicilio domicilioRecuperado = domicilioRepository.findById(domicilio.getId()).orElse(null);
			if (domicilioRecuperado != null) {
				System.out.println("Calle: " + domicilioRecuperado.getCalle());
				System.out.println("Número: " + domicilioRecuperado.getNumero());
				System.out.println("Localidad: " + domicilioRecuperado.getLocalidad());


				System.out.println("BUENAAASSS");
			Cliente cliente = new Cliente();
			cliente.setNombre("Daniel");
			cliente.setApellido("Rabinovich");
			cliente.setEmail("daniel@gmail.com");
			cliente.setTelefono(22314123);
        clienteRepository.save(cliente);


		Cliente clienteRecuperado = clienteRepository.findById(cliente.getId()).orElse(null);
		if (clienteRecuperado != null) {
			System.out.println("Nombre: " + clienteRecuperado.getNombre());
			System.out.println("Apellido: " + clienteRecuperado.getApellido());
			System.out.println("Email: " + clienteRecuperado.getEmail());
			System.out.println("Telefono: " + clienteRecuperado.getTelefono());

		}
		} ;
	};
}}
