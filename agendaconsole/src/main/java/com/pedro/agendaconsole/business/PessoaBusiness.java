package com.pedro.agendaconsole.business;

import com.pedro.agendaconsole.domain.Pessoa;
import com.pedro.agendaconsole.persistence.GenericDao;

public class PessoaBusiness extends GenericDao<Pessoa> {

	public PessoaBusiness() {
		super(Pessoa.class);
	}

}
