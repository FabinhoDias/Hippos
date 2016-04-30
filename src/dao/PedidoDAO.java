package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import conexaoBD.HibernateUtil;
import domain.Pedido;
import domain.Usuario;

public class PedidoDAO {

	private Session session;

	public PedidoDAO() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public boolean salvarPedido(Pedido pedido) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.save(pedido);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}

	public boolean removerPedido(Pedido pedido) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.delete(pedido);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}

	public Pedido buscarPedido(int id) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Pedido pedido = null;
		try {
			pedido = (Pedido) session.createCriteria(Pedido.class).add(Restrictions.eq("id", id)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}

		session.close();

		return pedido;
	}
	
	public Pedido buscarPedido(Usuario usuario) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Pedido pedido = null;
		try {
			pedido = (Pedido) session.createCriteria(Pedido.class).add(Restrictions.eq("usuario", usuario)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}

		session.close();

		return pedido;
	}

	@SuppressWarnings({ "unchecked" })
	public List<Pedido> listaDePedidos() {

		if (!session.isOpen()) {
			session = HibernateUtil.getSessionFactory().openSession();
		}
		Transaction tx = session.beginTransaction();
		List<Pedido> pedidos = session.createQuery("FROM Pedido ORDER BY id asc").list();
		session.flush();
		tx.commit();
		session.close();

		return pedidos;
	}

}
