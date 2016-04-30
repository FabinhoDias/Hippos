package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import conexaoBD.HibernateUtil;
import domain.Usuario;

public class UsuarioDAO {

	private Session session;

	public UsuarioDAO() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public boolean salvarUsuario(Usuario usuario) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.save(usuario);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}
	
	public boolean removerUsuario(Usuario usuario) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.delete(usuario);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}
	
	public boolean atualizarUsuario(Usuario usuario) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.update(usuario);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}
	
	public Usuario verificaUsuario(String login, String senha) {
		
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Usuario usuario = null;
		try {
			usuario = (Usuario) session.createQuery("from Usuario where login='"+login+"' and senha='"+senha+"'").list().get(0);
			session.flush();
			tx.commit();
			//System.out.println(usuario.getNome());
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
			
			session.close();
		
		
		return usuario;
	}
	
	public Usuario buscarUsuario(int id){
		
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Usuario usuario = null;
		try {
			usuario = (Usuario) session.createCriteria(Usuario.class).add(Restrictions.eq("id", id)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}
		
		session.close();
		
		return usuario;
	}
	
	public Usuario buscarUsuario(String login){
		
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Usuario usuario = null;
		try {
			usuario = (Usuario) session.createCriteria(Usuario.class).add(Restrictions.eq("login", login)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}
		
		session.close();
		
		return usuario;
	}
}
