public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(30);
        persona.setNombre("Geo");
        persona.setTelefono(12345);
        System.out.println("Hola, tengo " + persona.getEdad() + " años! ");
        System.out.println("Mi nombre es " + persona.getNombre());
        System.out.println("Me puedes llamar a este numero " + persona.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;


    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }








}