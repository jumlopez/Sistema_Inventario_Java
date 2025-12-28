/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.juan.sistemainventario;

import dao.ProductDAO;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class SistemaInventario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDAO productDAO = new ProductDAO();

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n=== SISTEMA DE INVENTARIO ===");
            System.out.println("1. Listar productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar precio y stock");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");


            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    List<Product> productos = productDAO.getAll();
                    System.out.println("\nLISTA DE PRODUCTOS");
                    for (Product p : productos) {
                        System.out.println(
                                p.getId() + " | " +
                                p.getName() + " | $" +
                                p.getPrice() + " | Stock: " +
                                p.getStock() + " | " +
                                p.getCategory()
                        );
                    }
                    break;

                case 2:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String name = sc.nextLine();

                    System.out.print("Precio: ");
                    double price = sc.nextDouble();

                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Categoria: ");
                    String category = sc.nextLine();

                    Product nuevo = new Product(id, name, price, stock, category);
                    productDAO.insert(nuevo);
                    break;

                case 3:
                    System.out.print("ID del producto a eliminar: ");
                    int idEliminar = sc.nextInt();
                    productDAO.delete(idEliminar);
                    break;

                case 4:
                    System.out.print("ID del producto: ");
                    int idUpdate = sc.nextInt();

                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();

                    System.out.print("Nuevo stock: ");
                    int nuevoStock = sc.nextInt();

                    productDAO.updatePriceAndStock(idUpdate, nuevoPrecio, nuevoStock);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;


                default:
                    System.out.println("Opción invalida");
            }
        }

        sc.close();
    }
}
