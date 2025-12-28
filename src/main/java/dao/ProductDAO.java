/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBConnection;
import model.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class ProductDAO {
    
     public List<Product> getAll() {

        List<Product> products = new ArrayList<>();
        String sql = "SELECT id, name, price, stock, category FROM products";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Product p = new Product(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getDouble("price"),
            rs.getInt("stock"),
            rs.getString("category") );

            products.add(p);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
     
     public void insert(Product p) {

    String sql = "INSERT INTO products (id, name, price, stock, category) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, p.getId());
        ps.setString(2, p.getName());
        ps.setDouble(3, p.getPrice());
        ps.setInt(4, p.getStock());
        ps.setString(5, p.getCategory());

        ps.executeUpdate();
        System.out.println(" Producto agregado correctamente");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

     public void delete(int id) {

    String sql = "DELETE FROM products WHERE id = ?";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, id);
        int filas = ps.executeUpdate();

        if (filas > 0) {
            System.out.println("️Producto eliminado");
        } else {
            System.out.println(" No existe producto con ese ID");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

     public void updatePriceAndStock(int id, double price, int stock) {

    String sql = "UPDATE products SET price = ?, stock = ? WHERE id = ?";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setDouble(1, price);
        ps.setInt(2, stock);
        ps.setInt(3, id);

        int filas = ps.executeUpdate();

        if (filas > 0) {
            System.out.println("✏️ Producto actualizado correctamente");
        } else {
            System.out.println("⚠️ No existe producto con ese ID");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
    

