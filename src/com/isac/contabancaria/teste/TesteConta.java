package com.isac.contabancaria.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isac.contabancaria.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setAgencia("123-x");
		conta.setBanco("Bradesco");
		conta.setNumero("2020");
		conta.setTitular("Isac Canedo");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contabancaria");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();

		emf.close();
		em.close();

	}

}
