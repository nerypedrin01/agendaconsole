package com.pedro.agendaconsole.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;

public class Conf {

	public static EntityManagerFactory getEmFactory() {

		Properties props = new Properties();
		try {
			
			InputStream in =  new FileInputStream(new File("conf.properties"));
			props.load(in);
			props.get("user");
			props.get("password");
			
			EntityManagerFa
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
