import models.Producto;
import models.ProdutoPerecivel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Producto> productos = new ArrayList<>();

            while (true) {
                System.out.println("Digite o nome do Producto (o 'exit' para salir):");
                String nombre = scanner.nextLine();

                if ("exit".equalsIgnoreCase(nombre)) {
                    break;
                }

                System.out.println("Digite o preço do roducto:");
                double precio = scanner.nextDouble();

                System.out.println("Digite a quantidade do producto:");
                int cantidad = scanner.nextInt();

                Producto producto = new Producto(nombre, precio, cantidad);
                productos.add(producto);
            }
            ProdutoPerecivel produtoPerecivel= new ProdutoPerecivel("Arroz", 30.0, 4, LocalDateTime.now());

            System.out.println("Productos ingresados:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }

            double total = 0;
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        }
    }
