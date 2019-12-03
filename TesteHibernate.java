package posjavamavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	@Test
	public void testeHibernateUtil(){
		
		HibernateUtil.gEntityManager();
		System.out.println("Conectado");
	}
	
	public void Salvar (){
	DaoGeneric<UsuarioPessoa> dao = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setEmail("gmail.com");
		pessoa.setNome("testenome");
	    pessoa.setLogin("123");
	    
	    dao.salvar(pessoa);
		
		
	}
	

}  
