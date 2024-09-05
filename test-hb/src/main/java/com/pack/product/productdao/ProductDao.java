package com.pack.product.productdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.product.Product;
import com.pack.product.config.HbConfiguration;

public class ProductDao {

	
	public void ProductSave(Product pr)
	{
		Transaction trn=null;
		try {
			Session sess=HbConfiguration.getSessionFactory().openSession();
			trn= sess.beginTransaction();
			sess.save(pr);
			trn.commit();
		}
		catch(Exception e)
		{
			if(trn !=null)
			{
				trn.rollback();
				
			}
			e.printStackTrace();
		}
	}
	
	public List <Product> getProducts()
	{
		
		try (Session session=HbConfiguration.getSessionFactory().openSession())
		{//parallel to sql select query
			return session.createQuery("from Product",Product.class).list();
			
		}
	}
}
