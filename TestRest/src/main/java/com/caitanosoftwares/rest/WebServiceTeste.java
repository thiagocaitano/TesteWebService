package com.caitanosoftwares.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.caitanosoftwares.model.Pessoa;

@Path("/teste")
public class WebServiceTeste {

	List<Pessoa> pessoas = new ArrayList<>();
	
	@GET
	@Path("/pessoas")
	@Produces(MediaType.APPLICATION_XML)
	public List<Pessoa> obterListaDePessoas(){
		
		Pessoa p = new Pessoa();
		p.setNome("Thiago");
		p.setSobrenome("Caitano");
		pessoas.add(p);

		return pessoas;
		
	}	
	
	
	
	
}
