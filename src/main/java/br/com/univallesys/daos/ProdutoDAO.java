package br.com.univallesys.daos;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import br.com.univallesys.models.Produto;

@Repository
public class ProdutoDAO {
	
	private Session session;
	
	public List<Produto> all(){
		return session.createCriteria(Produto.class).list();
	}
	
	public void save(Produto p){
		session.save(p);
	}
	
	public void update(Produto p) {
		session.update(p);
	}
	
	public void delete(Produto p) {
		session.delete(p);
	}
	
	public List<Produto> findBy(String query) {
		return session.createQuery("select p from Produto p where p.nome like :query").setParameter("query", query).list();
	}
	
	public Produto findById(Integer id) {
		return (Produto) session.load(Produto.class, id);
	}
}