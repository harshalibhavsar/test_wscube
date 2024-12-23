package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.model.Product;

@Repository 
public class ProductDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;  

    // Create product
  @Transactional
    public void createProduct(Product product) {
    this.hibernateTemplate.saveOrUpdate(product);
    }

    // Get all products
    public List<Product> getProducts() {
        return this.hibernateTemplate.loadAll(Product.class);
    }

    // Delete product
    @Transactional
    public void deleteProduct(int pid) {
        Product p = this.hibernateTemplate.load(Product.class, pid);
        this.hibernateTemplate.delete(p);
    }

    // Get single product
    public Product getProduct(int pid) {
        return this.hibernateTemplate.get(Product.class, pid);
    }
}
