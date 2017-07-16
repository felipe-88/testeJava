package br.com.univallesys.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class GrupoDeProdutos {
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String company_id;
   private String product_group_id;
   @OneToMany(mappedBy = "produto")
   private List<Produto> produtos;
	   
   public Integer getId() {
	   return id;
   }
   public void setId(Integer id) {
	   this.id = id;
   }
   public String getCompany_id() {
	   return company_id;
   }
   public void setCompany_id(String company_id) {
	   this.company_id = company_id;
   }
   public String getProduct_group_id() {
	   return product_group_id;
   }
   public void setProduct_group_id(String product_group_id) {
	   this.product_group_id = product_group_id;
   }
   public List<Produto> getProdutos() {
	   return produtos;
   }
   public void setProdutos(List<Produto> produtos) {
	   this.produtos = produtos;
   }
}