package com.pedro.agendaconsole.util;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Menu {

	public Menu() {

		carregaMenu();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite");
		String op = scan.nextLine();

		while (!op.equals("4")) {

			if (op.equals("1")) {

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

		String menu = StringUtils.rightPad("MENU", 19, ' ')+"|";

		menu = "|"+StringUtils.leftPad(menu, 33, ' ');

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

}
