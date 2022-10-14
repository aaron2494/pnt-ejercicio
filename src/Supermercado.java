
import java.lang.ref.Cleaner;

import java.util.LinkedList;
import java.util.List;

        public class Supermercado {

                private List<producto> listaDeProductos;
            public Supermercado() {
                    this.listaDeProductos = new LinkedList<>();
                }
                public void agregarProducto (producto p){
                    this.listaDeProductos.add(p);
                }


                public void cargarListaDeProductos () {
                    producto p1 = new bebida("Coca-Cola Zero", "Litros", 1.5, 20);
                    producto p2 = new bebida("Coca-Cola", "Litros", 1.5, 18);
                    producto p3 = new shampoo("Shampoo Sedal", "Contenido", 500, 30);
                    producto p4 = new fruta("Frutillas", "kilo", 1, 64);

                    this.agregarProducto(p1);
                    this.agregarProducto(p2);
                    this.agregarProducto(p3);
                    this.agregarProducto(p4);
                }
                public void mostrarProductos () {
                    for (producto producto : listaDeProductos) {
                        producto.mostrarDetalle();
                    }
                    System.out.println("=============================");
                }
                public String productoMasCaro () {
                    producto max;
                    max = this.listaDeProductos.get(0);
                    for (producto producto : listaDeProductos) {

                        if (producto.compareTo(max) > 0) {
                            max = producto;
                        }
                    }

                    return max.getNombre();
                }
                public String productoMasBarato () {
                    producto min;
                    min = this.listaDeProductos.get(0);
                    for (producto producto : listaDeProductos) {

                        if (producto.compareTo(min) < 0) {
                            min = producto;
                        }
                    }
                        return min.getNombre();

                }
            }






