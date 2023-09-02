package com.pedro.agendaconsole.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conf {

	public static EntityManagerFactory getEmFactory() {

		Properties props = new Properties();
		EntityManagerFactory entityManagerFactory = null;
		try {

			InputStream in = new FileInputStream(new File("conf.properties"));
			props.load(in);

			Map<String, String> conf = new HashMap<>();

			conf.put("javax.persistence.jdbc.user", props.get("user").toString());
			conf.put("javax.persistence.jdbc.password", props.get("password").toString());

			entityManagerFactory = Persistence.createEntityManagerFactory("kanto", conf);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entityManagerFactory;
	}

}
