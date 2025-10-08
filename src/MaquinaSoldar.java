public class MaquinaSoldar {
    private String marca;
    private String modelo;
    private double potencia;
    private String[] metalesQuePuedeSoldar;

    public MaquinaSoldar(String marca, String modelo, double potencia, String[] metales) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metalesQuePuedeSoldar = metales;
    }

    public void soldar(String metal) {
        boolean puede = false;
        for (String m : metalesQuePuedeSoldar) {
            if (m.equalsIgnoreCase(metal)) {
                puede = true;
                break;
            }
        }

        if (puede) {
            System.out.println("La máquina de soldar " + marca + " " + modelo + " solda el " + metal + ".");
        } else {
            System.out.println("La máquina de soldar " + marca + " " + modelo + " no puede soldar " + metal + ".");
        }
    }
}
