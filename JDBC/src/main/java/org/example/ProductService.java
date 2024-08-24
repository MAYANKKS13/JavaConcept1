package org.example;

import javax.xml.stream.events.StartElement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> products = new ArrayList<>();
    public ProductService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "Root@123");
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllProducts() {
        products.clear();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "Root@123");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("Select * from product")) {
            while (rs.next()) {
                int pid = rs.getInt("pid");
                String pname = rs.getString("pname");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");

                Product product = new Product(pid, pname, quantity, price);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addProduct(Product product) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "Root@123");
             PreparedStatement st = con.prepareStatement("INSERT INTO product (pid, pname, quantity, price) VALUES (?, ?, ?, ?)")) {

            st.setInt(1, product.getPid());
            st.setString(2, product.getPname());
            st.setInt(3, product.getQuantity());
            st.setDouble(4, product.getPrice());

            st.executeUpdate();
            getAllProducts();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public void updateProduct(Product product) {
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "Root@123");
//             PreparedStatement st = conn.prepareStatement("UPDATE product SET pname=?, qty=?, price=? WHERE pid=?")) {
//
//            st.setString(1, product.getPname());
//            st.setInt(2, product.getQuantity());
//            st.setDouble(3, product.getPrice());
//            st.setInt(4, product.getPid());
//
//            st.executeUpdate();
//            getAllProducts();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public void updateProduct(Product product) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "Root@123");
             PreparedStatement stmt = conn.prepareStatement("UPDATE product SET pname=?, Quantity=?, price=? WHERE pid=?")) {

            stmt.setString(1, product.getPname());
            stmt.setInt(2, product.getQuantity());
            stmt.setDouble(3, product.getPrice());
            stmt.setInt(4, product.getPid());

            stmt.executeUpdate();

            // Update productList
            getAllProducts(); // Refresh productList from database
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteProduct(int pid) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "Root@123");
             PreparedStatement st = conn.prepareStatement("DELETE FROM product WHERE pid=?")) {

            st.setInt(1, pid);
            st.executeUpdate();

            getAllProducts();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Product> getProductList() {
        return products;
    }

}
