
import java.util.ArrayList;
import java.util.List;

public class Producto {

    public int id;
    public String producto;
    public double precio;
    public String comercio;
    public boolean promocion;

    public Producto(int id, String producto, double precio, String comercio, boolean promocion) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.comercio = comercio;
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", producto=" + producto + ", precio=" + precio + ", comercio=" + comercio + ", promocion=" + promocion + '}';
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    public static List<Producto> listaProductos() {

        List<Producto> producto = new <Producto> ArrayList();
        Producto pro1 = new Producto(1, "Zapatillas", 19999.99, "Nike", false);
        Producto pro2 = new Producto(2, "Campera", 14999.99, "Nike", false);
        Producto pro3 = new Producto(3, "Remera", 5999.99, "Nike", true);
        Producto pro4 = new Producto(10, "Zapatillas", 14999.99, "Adidas", false);
        Producto pro5 = new Producto(11, "Campera", 11999.99, "Adidas", false);
        Producto pro6 = new Producto(12, "Remera", 3500.50, "Adidas", true);

        producto.add(pro1);
        producto.add(pro2);
        producto.add(pro3);
        producto.add(pro4);
        producto.add(pro5);
        producto.add(pro6);

        return producto;
    }

    public static void productosOrdenadosAscendentes(List<Producto> lista) {
        List<String> productosOrdenados = new ArrayList<>();
        while (lista.size() > 0) {
            int i = 0;
            int mayorActual = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).getPrecio() < lista.get(mayorActual).getPrecio()) {
                    mayorActual = j;
                }
            }

            String Local = lista.get(mayorActual).getComercio();
            productosOrdenados.add(Local);
            double PrecioD = lista.get(mayorActual).getPrecio();
            String Precio = String.valueOf(PrecioD);
            productosOrdenados.add(Precio);
            lista.remove(mayorActual);
        }

        System.out.println("Productos ordenados ascendentes : ");

        for (int i = 0; i < productosOrdenados.size(); i++) {
            System.out.println(productosOrdenados.get(i));
        }

    }

    public static void productoMasBaratoDelLocal(List<Producto> producto) {
        
        double min = 0;
        double precioInicial = 0;
        double valorMinimo = 0;
        String comercioInicial = "";
        String productoInicial = "";
        
        for (int i = 0; i < producto.size(); i++) {
            
            precioInicial = producto.get(i).getPrecio();
            
            if (precioInicial > min) {
                valorMinimo = producto.get(i).getPrecio();
                comercioInicial = producto.get(i).getComercio();
                productoInicial = producto.get(i).getProducto();
                if(precioInicial > valorMinimo){
                
                valorMinimo = producto.get(i).getPrecio();
                }
            }
        }
        System.out.println("El producto mas barato es : " + productoInicial + " " + valorMinimo + " del local " + comercioInicial);
    }

    public static void productosMasAltoConPromoSinPromo(List<Producto> producto) {
        double valorActual = 0;
        double valorPromo = 0;
        int cantidad1 = 0;
        int cantidad2 = 0;
        String productoPromo = "";
        String productoSinPromo = "";
        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i).getPrecio() > valorActual && producto.get(i).isPromocion() == false) {
                valorActual = producto.get(i).getPrecio();
                productoSinPromo = producto.get(i).getComercio();
                cantidad1 = cantidad1 + 1;
            } else if (producto.get(i).getPrecio() > valorPromo && producto.get(i).isPromocion() == true) {
                valorPromo = producto.get(i).getPrecio();
                productoPromo = producto.get(i).getComercio();
                cantidad2 = cantidad2 + 1;
            }
        }
        System.out.println("El producto mas caro sin promocion es de : " + valorActual + " del local " + productoSinPromo + " , cantidad : " + cantidad1 + "\n");
        System.out.println("El producto mas caro con promocion es de : " + valorPromo + " del local " + productoPromo + " , cantidad : " + cantidad2);
    }

    public static void productoComercioMejorPrecio(List<Producto> producto) {

        double precioInicial = 0;
        double mejorPrecio1 = 0;
        double mejorPrecio2 = 0;
        double mejorPrecio3 = 0;
        String comercioZ = "";
        String comercioC = "";
        String comercioR = "";
        String productoInicial = "";

        for (int i = 0; i < producto.size(); i++) {

            precioInicial = producto.get(i).getPrecio();
            productoInicial = producto.get(i).getProducto();
            if (productoInicial == "Zapatillas") {

                comercioZ = producto.get(i).getComercio();
                mejorPrecio1 = producto.get(i).getPrecio();
                if (precioInicial > mejorPrecio1) {

                    mejorPrecio1 = producto.get(i).getPrecio();

                }

            } else if (productoInicial == "Campera") {

                comercioC = producto.get(i).getComercio();
                mejorPrecio2 = producto.get(i).getPrecio();
                if (precioInicial > mejorPrecio2){
                
                    mejorPrecio2 = producto.get(i).getPrecio();
                }

            } else if (productoInicial == "Remera") {

                comercioR = producto.get(i).getComercio();
                mejorPrecio3 = producto.get(i).getPrecio();
                if (precioInicial > mejorPrecio3) {

                    mejorPrecio3 = producto.get(i).getPrecio();
                }

            }

        }
        System.out.println("El comercio con las zapatillas con mejor precio es : " + comercioZ + " ( " + mejorPrecio1 + " )" + "\n");
        System.out.println("El comercio con la campera con mejor precio es : " + comercioC + " ( " + mejorPrecio2 + " )" + "\n");
        System.out.println("El comercio con la remera con mejor precio es : " + comercioR + " ( " + mejorPrecio3 + " )" + "\n");

    }

    public static void promedioConSinPromocion(List<Producto> producto) {

        double promedio1 = 0;
        double promedio2 = 0;
        double suma1 = 0;
        double suma2 = 0;
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i).isPromocion() == true) {
                contador1 = contador1 + 1;
                suma1 = suma1 + producto.get(i).getPrecio();

            } else if (producto.get(i).isPromocion() == false) {
                contador2 = contador2 + 1;
                suma2 = suma2 + producto.get(i).getPrecio();
            }
            promedio1 = suma1 / contador1;
            promedio2 = suma2 / contador2;

        }
        System.out.println("El precio promedio de productos en promocion es : " + promedio1 + "\n");
        System.out.println("El precio promedio de productos sin promocion es : " + promedio2);
    }

    public static void cantidadProductosPorLocal(List<Producto> producto) {

        int cantidad1 = 0;
        int cantidad2 = 0;

        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i).getComercio() == "Nike") {
                cantidad1 = cantidad1 + 1;

            } else {
                cantidad2 = cantidad2 + 1;
            }
        }
        System.out.println("La cantidad de productos que tiene Nike a la venta son: " + cantidad1 + "\n");
        System.out.println("La cantidad de productos que tiene Adidas a la venta son: " + cantidad2);
    }

    public static void main(String[] args) {

        List<Producto> producto = listaProductos();

        System.out.println("-------------------------------------------------------------------------------------------");

        productoMasBaratoDelLocal(producto);

        System.out.println("-------------------------------------------------------------------------------------------");

        productosMasAltoConPromoSinPromo(producto);

        System.out.println("-------------------------------------------------------------------------------------------");

        productoComercioMejorPrecio(producto);

        System.out.println("-------------------------------------------------------------------------------------------");

        promedioConSinPromocion(producto);

        System.out.println("-------------------------------------------------------------------------------------------");

        cantidadProductosPorLocal(producto);

        System.out.println("-------------------------------------------------------------------------------------------");

        productosOrdenadosAscendentes(producto);

    }

}
