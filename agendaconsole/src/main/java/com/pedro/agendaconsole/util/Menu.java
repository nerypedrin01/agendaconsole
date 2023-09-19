package com.pedro.agendaconsole.util;

import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.pedro.agendaconsole.business.PessoaBusiness;
import com.pedro.agendaconsole.domain.Pessoa;

public class Menu {

	public Menu() {

		carregaMenu();

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite: ");
		String op = scan.nextLine();

		while (!op.equals("4")) {

			if (op.equals("1")) {
				listaContatos();

			} else if (op.equals("2")) {

			} else if (op.equals("3")) {

			} else {
				System.out.println("Selecione uma opção válida!");
				System.out.println("Ex: 1,2,3 ou 4");
			}

			op = scan.nextLine();
		}
		scan.close();
	}

	private void carregaMenu() {

		String menu = StringUtils.rightPad("MENU", 19, ' ') + "|";

		menu = "|" + StringUtils.leftPad(menu, 33, ' ');

		System.out.println("*" + StringUtils.leftPad("" + "", 32, '-') + "*");
		System.out.println(menu);
		System.out.printf("| %-30s | %n", "");
		System.out.printf("| %-30s | %n", "1 - Listar os Contatos");
		System.out.printf("| %-30s | %n", "1 - Listar os Contatos");
		System.out.printf("| %-30s | %n", "2 - Criar");
		System.out.printf("| %-30s | %n", "3 - Alterar");
		System.out.printf("| %-30s | %n", "4 - Sair");
		System.out.printf("| %-30s | %n", "");
		System.out.println("*" + StringUtils.leftPad("" + "", 32, '-') + "*");

	}

	private void listaContatos() {

		PessoaBusiness bss = new PessoaBusiness();

		List<Pessoa> pessoas = bss.getListRowNum();
		int count = 1;

		for (Pessoa pessoa : pessoas)
			System.out.println(count++ + " - " + pessoa.toString());

	}
}
