package posjavamavenhibernate;
//Classe para o hibernate ler o arquivo persistence e deixar instanciado a conexão com obanco de dados

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	// static pois só será usada uma vez
	public static EntityManagerFactory factory = null;// é a fábrica de conexões
														// do hibernate

	static {
		init();
	}

	private static void init() {
		try {

			// verificação para ler o arquivo uma única vez
			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("pos-java-maven-hibernate");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static EntityManager gEntityManager(){
		return factory.createEntityManager(); //provê a parte de persistência
		
	}

}
