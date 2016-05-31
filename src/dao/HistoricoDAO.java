package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import conexaoBD.HibernateUtil;
import domain.Historico;
import domain.Usuario;

public class HistoricoDAO {
 
	private Session session;

	public HistoricoDAO() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public boolean salvarHistorico(Historico historico) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.save(historico);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}

	public boolean removerHistorico(Historico historico) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.delete(historico);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}
	
	public boolean atualizarHistorico(Historico historico) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.update(historico);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}

	public Historico buscarHistorico(int id) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Historico historico = null;
		try {
			historico = (Historico) session.createCriteria(Historico.class).add(Restrictions.eq("id", id)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}

		session.close();

		return historico;
	}
	
	public Historico buscarHistorico(Usuario usuario) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Historico historico = null;
		try {
			historico = (Historico) session.createCriteria(Historico.class).add(Restrictions.eq("usuario", usuario)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}

		session.close();

		return historico;
	}

	@SuppressWarnings({ "unchecked" })
	public List<Historico> listaDeHistoricos() {

		if (!session.isOpen()) {
			session = HibernateUtil.getSessionFactory().openSession();
		}
		Transaction tx = session.beginTransaction();
		List<Historico> historicos = session.createQuery("FROM Historico ORDER BY id asc").list();
		session.flush();
		tx.commit();
		session.close();

		return historicos;
	}

}
