/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp06.ejercicio1;
import java.util.List;

/**
 *
 * @author nicol
 */

public class MainStock {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos
        inv.agregarProducto(new Producto("P001", "Arroz 1kg", 1200.0, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002", "Auriculares", 2500.0, 15, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P003", "Remera", 1800.0, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P004", "Plancha", 3500.0, 8, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005", "Fideos", 900.0, 120, CategoriaProducto.ALIMENTOS));

        // 2. Listar todos los productos
        System.out.println("=== Lista de productos ===");
        inv.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\n=== Buscar P002 ===");
        Producto buscado = inv.buscarProductoPorId("P002");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n=== Filtrar ALIMENTOS ===");
        List<Producto> alimentos = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        alimentos.forEach(Producto::mostrarInfo);

        // 5. Eliminar un producto por ID
        System.out.println("\n=== Eliminar P004 ===");
        inv.eliminarProducto("P004");
        inv.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n=== Actualizar stock P003 a 45 ===");
        inv.actualizarStock("P003",45);
        System.out.println(inv.buscarProductoPorId("P003"));

        // 7. Mostrar total de stock
        System.out.println("\n=== Total de stock ===");
        System.out.println(inv.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n=== Producto con mayor stock ===");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar por precio entre 1000 y 3000
        System.out.println("\n=== Filtrar precio $1000 - $3000 ===");
        inv.filtrarProductosPorPrecio(1000.0, 3000.0).forEach(Producto::mostrarInfo);

        // 10. Mostrar categorías disponibles con descripción
        System.out.println("\n=== Categorías disponibles ===");
        inv.mostrarCategoriasDisponibles();
    }
}
