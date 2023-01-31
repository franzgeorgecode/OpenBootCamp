public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.añadirPuertica();
        System.out.println("Mi coche tiene: " + miCoche.puerticas + " puerticas.");
    }
}

class coche {
    public int puerticas = 2;
    public void añadirPuertica(){
        this.puerticas++;
    }
}