package net.hibernate.dao;

import org.hibernate.Session;

import org.hibernate.Transaction;

import net.hibernate.model.Product;
import net.hibernate.util.HibernateUtil;


public class ProductDao {

    public void saveProduct(Product product) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(product);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}