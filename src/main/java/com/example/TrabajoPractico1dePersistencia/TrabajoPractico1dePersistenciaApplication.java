package com.example.TrabajoPractico1dePersistencia;

import com.example.TrabajoPractico1dePersistencia.repositorios.ClienteRepository;
import com.example.TrabajoPractico1dePersistencia.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


import java.time.LocalDate;



@SpringBootApplication
@ComponentScan(basePackages = {"com.example.TrabajoPractico1dePersistencia"})

public class TrabajoPractico1dePersistenciaApplication {
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	FacturaRepository facturaRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	RubroRepository rubroRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrabajoPractico1dePersistenciaApplication.class, args);
		System.out.println("Todo va de perlas");
	}

	@Bean
	public CommandLineRunner init() {
		return args -> {

			System.out.println("BUENAAASSS");
			Domicilio domicilio = new Domicilio();
			domicilio.setCalle("9 de Julio");
			domicilio.setNumero("23");
			domicilio.setLocalidad("Buenos Aires");


			Cliente cliente = new Cliente();
			cliente.setNombre("Daniel");
			cliente.setApellido("Rabinovich");
			cliente.setEmail("daniel@gmail.com");
			cliente.setTelefono(22314123);

			Pedido pedido = new Pedido();
			pedido.setEstado("Iniciado");
			pedido.setFecha(LocalDate.of(2011,06, 26));
			pedido.setTipoEnvio("Delivery");
			pedido.setTotal(132);

			Factura factura = new Factura();
			factura.setNumero(7);
			factura.setFecha(LocalDate.of(2011,06, 26));
			factura.setDescuento(10);
			factura.setFormaPago("Efectivo");
			factura.setTotal(2500);

			DetallePedido detallepedido = new DetallePedido();
			detallepedido.setCantidad(2);
			detallepedido.setSubtotal(2700);

			Producto producto = new Producto();
			producto.setTipo("Manufacturado");
			producto.setTiempoEstimadoCocina(30);
			producto.setDenominacion("Papas fritas");
			producto.setPrecioVenta(2500);
			producto.setPrecioCompra(1300);
			producto.setStockActual(60);
			producto.setStockMinimo(30);
			producto.setUnidadMedida("Porción");
			producto.setReceta("Fritar las papas, etc.");

			Rubro rubro = new Rubro();
			rubro.setDenominacion("Comida rápida");


			cliente.addDomicilio(domicilio);
			clienteRepository.save(cliente);
			pedido.addDetallePedido(detallepedido);
			pedidoRepository.save(pedido);
			cliente.addPedido(pedido);
			pedido.setFactura(factura);
			facturaRepository.save(factura);
			rubro.addProducto(producto);
			rubroRepository.save(rubro);
			detallepedido.setProducto(producto);






		} ;
	};
}
