public class EjercicioTema9{
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    cliente1.edad = 35;
    cliente1.nombre = "Mario";
    cliente1.telefono = "953657851";
    cliente1.credito = 28000.0;

    System.out.println("El nombre del cliente 1 es: "+cliente1.nombre);
    System.out.println("El edad del cliente 1 es: "+cliente1.edad);
    System.out.println("El numero de telefono del cliente 1 es: "+cliente1.telefono);
    System.out.println("El credito disponible para el cliente 1 es: "+cliente1.credito);

    Trabajador trabajador1 = new Trabajador();
    trabajador1.edad = 28;
    trabajador1.nombre = "Juan";
    trabajador1.telefono = "951987811";
    trabajador1.setSalario(4500.0);

    System.out.println("El nombre del trabajador 1 es: "+trabajador1.nombre);
    System.out.println("El edad del trabajador 1 es: "+ trabajador1.edad);
    System.out.println("El numero de telefono del trabajador 1 es: "+ trabajador1.telefono);
    System.out.println("El salario para el trabajador 1 es: "+trabajador1.getSalario());

    }
}

class Persona{
    public String nombre;
    public int edad;
    public String telefono;
}

class Cliente extends Persona{
    public Double credito;

}

class Trabajador extends Persona{
    private Double salario;

    public void setSalario(Double salario){
        this.salario = salario;
    }
    public Double getSalario(){
        return salario;
    }
}
