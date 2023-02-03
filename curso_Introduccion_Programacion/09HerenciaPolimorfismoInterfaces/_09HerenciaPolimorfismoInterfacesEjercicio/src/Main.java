public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad= 30;
        cliente.telefono=12345;
        cliente.nombre="Geo";
        cliente.credito=3999.99;
        System.out.println("*************************************************** ");
        System.out.println("Hola mi edad es : " + cliente.edad +" años" );
        System.out.println("Me pueden llamar a este numero : " + cliente.telefono);
        System.out.println("Me pueden decir : " + cliente.nombre);
        System.out.println("Mi credito es : $ " + cliente.credito);
        System.out.println("*************************************************** ");

        Trabajador trabajador = new Trabajador();
        trabajador.edad= 25;
        trabajador.telefono=67890;
        trabajador.nombre="Luk";
        trabajador.salario=1572.31;
        System.out.println("*************************************************** ");
        System.out.println("Hola mi edad es : " + trabajador.edad +" años" );
        System.out.println("Me pueden llamar a este numero : " + trabajador.telefono);
        System.out.println("Me pueden decir : " + trabajador.nombre);
        System.out.println("Mi salario es : $ " + trabajador.salario);
        System.out.println("*************************************************** ");
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{

    double credito;

}

class Trabajador extends Persona{
    double salario;
}