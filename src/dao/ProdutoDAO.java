package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import conexaoBD.HibernateUtil;
import domain.Produto;

public class ProdutoDAO {

	private Session session;

	public ProdutoDAO() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public boolean salvarProduto(Produto produto) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.save(produto);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}

	public boolean removerProduto(Produto produto) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.delete(produto);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();

		return verifica;
	}

	public Produto buscarProduto(int id) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Produto produto = null;
		try {
			produto = (Produto) session.createCriteria(Produto.class).add(Restrictions.eq("id", id)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}

		session.close();

		return produto;
	}
	
	public Produto buscarProduto(String nome) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Produto produto = null;
		try {
			produto = (Produto) session.createCriteria(Produto.class).add(Restrictions.eq("nome", nome)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}

		session.close();

		return produto;
	}
	
	@SuppressWarnings({ "unchecked" })
	public List<Produto> listaDeProdutos() {

		if (!session.isOpen()) {
			session = HibernateUtil.getSessionFactory().openSession();
		}
		Transaction tx = session.beginTransaction();
		List<Produto> produtos = session.createQuery("FROM Produto ORDER BY id asc").list();
		session.flush();
		tx.commit();
		session.close();

		return produtos;
	}

	@SuppressWarnings({ "unchecked" })
	public List<Produto> listaDeProdutosPorCategoria(String categoria) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		List<Produto> produtos = session.createQuery("from Produto where categoria='" + categoria + "'").list();

		session.flush();
		tx.commit();
		session.close();

		return produtos;
	}
}
