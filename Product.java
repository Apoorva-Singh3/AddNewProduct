package net.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demo")
public class Product implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ProductId")
    private String ProductId;

    @Column(name = "ProductName")
    private String ProductName;


    public String getProductId()
    {
        return ProductId;
    }
    public void setProductId(String ProductId)
    {
        this.ProductId = ProductId;
    }
    public String getProductName() 
    {
        return ProductName;
    }
    public void setProductName(String ProductName)
    {
        this.ProductName = ProductName;
    }
  
}
