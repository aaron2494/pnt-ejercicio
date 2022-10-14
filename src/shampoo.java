public class shampoo extends producto{
    public shampoo(String n, String t, double c, double p) {
        super(n, t, c, p);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Nombre: "+this.getNombre()+" /// "+"Contenido: "+(int)this.getCapacidad()+"mm"+" /// " +"Precio: "+"$"+(int)this.getPrecio());
    }
}