package com.pedro.agendaconsole;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.pedro.agendaconsole.business.PessoaBusiness;
import com.pedro.agendaconsole.domain.Pessoa;

public class App {
	
	static {
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
	}

	public static void main(String[] args) {

		PessoaBusiness bss = new PessoaBusiness();

		List<Pessoa> pessoas = bss.getListByCondition("obj.codPessoa = 7622582174");

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}

}
