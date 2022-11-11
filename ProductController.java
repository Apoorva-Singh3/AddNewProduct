package net.hibernate.web;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.hibernate.dao.ProductDao;
import net.hibernate.model.Product;



@WebServlet("/register")
public class ProductController extends HttpServlet 
{
    private static final long serialVersionUID = 1L;
    private ProductDao productDao;

    public void init() 
    {
        productDao = new ProductDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        register(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.sendRedirect("register.jsp");
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
    {
        String ProductId = request.getParameter("ProductId");
        String ProductName = request.getParameter("ProductName");
        

        Product product = new Product();
        product.setProductId(ProductId);
        product.setProductName(ProductName);
        

        productDao.saveProduct(product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.jsp");
        dispatcher.forward(request, response);
    }
}
