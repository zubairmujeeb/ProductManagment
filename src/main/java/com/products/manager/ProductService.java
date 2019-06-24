package com.products.manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService 

{
	@Autowired
   private IProductRepository repo;
	
	public List<product> Allproducts() 
	{
		return repo.findAll();
	}
	
	
	public void save(product objp) 
	{
	 repo.save(objp);	
	}
	
	public product Getproductbyid(int id) 
	{
		return repo.findById(id).get();
		
	}
	
	public void delete(int id) 
	{
		repo.deleteById(id);
		
	}
	
	
}
