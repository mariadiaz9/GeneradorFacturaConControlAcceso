package com.edutecno.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/factura")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String nombre = request.getParameter("nombre");
			String empresa = request.getParameter("empresa");
			String rut = request.getParameter("rut");
			String direccion = request.getParameter("direccion");
			String ciudad = request.getParameter("ciudad");
			String pais = request.getParameter("pais");
			int precioValvulas = 120000;
			int precioTurbo = 1700000;
			int precioFreno = 760000;
			int precioRefri = 2300000;
			int precioPlumillas = 10000;
			int valorTotal;
			
			Integer cantValvulas = Integer.parseInt(request.getParameter("valvulas"));
			Integer cantTurbo = Integer.parseInt(request.getParameter("turbo"));
			Integer cantKitFreno= Integer.parseInt(request.getParameter("frenos"));
			Integer cantRefrigerante = Integer.parseInt(request.getParameter("refri"));
			Integer cantPlumillas= Integer.parseInt(request.getParameter("plumas"));
			
	
			//Ahora necesitamos armar un request al segundo servlet
			request.setAttribute("nombre", nombre);
			request.setAttribute("empresa", empresa);
			request.setAttribute("rut", rut);
			request.setAttribute("direccion", direccion);
			request.setAttribute("ciudad", ciudad);
			request.setAttribute("pais", pais);
	
			request.setAttribute("cantValvulas", cantValvulas);
			request.setAttribute("cantTurbo", cantTurbo);
			request.setAttribute("cantKitFreno", cantKitFreno);
			request.setAttribute("cantRefrigerante", cantRefrigerante);
			request.setAttribute("cantPlumillas", cantPlumillas);
	
			//calculamos lo solicitado
			request.setAttribute("precioTotalValvulas", cantValvulas * precioValvulas);
			request.setAttribute("precioTotalTurbo", cantTurbo * precioTurbo);
			request.setAttribute("precioTotalFrenos", cantKitFreno * precioFreno);
			request.setAttribute("precioTotalRefrigerante", cantRefrigerante * precioRefri);
			request.setAttribute("precioTotalPlumillas", cantPlumillas * precioPlumillas);
	
			valorTotal = ((cantValvulas * precioValvulas)+
						  (cantTurbo * precioTurbo)+
						  (cantKitFreno * precioFreno)+
						  (cantRefrigerante * precioRefri)+
						  (cantPlumillas * precioPlumillas));
	
			request.setAttribute("valorTotal", valorTotal);
			//redireccion al segundo servlet
			request.getRequestDispatcher("/generadorFactura").forward(request, response);

	}

}
