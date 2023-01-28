public class Main {
    public static void main(String[] args) {
        Persona usuario1 = new Persona();
        usuario1.setNombre("Messi");
        usuario1.setEdad(37);
        usuario1.setTelefono(105456123);

        Persona usuario2 = new Persona();
        usuario2.setNombre("Cristiano");
        usuario2.setEdad(38);
        usuario2.setTelefono(797485123);

        System.out.println("El nombre de la persona 1 es: "+usuario1.getNombre());
        System.out.println("La edad de la persona 1 es: "+usuario1.getEdad());
        System.out.println("El Telefono de la persona 1 es: "+usuario1.getTelefono());

        System.out.println("El nombre de la persona 2 es: "+usuario2.getNombre());
        System.out.println("La edad de la persona 2 es: "+usuario2.getEdad());
        System.out.println("El Telefono de la persona 2 es: "+usuario2.getTelefono());

    }
}


class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}