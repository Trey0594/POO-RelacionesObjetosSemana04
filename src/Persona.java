public class Persona {
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;
    private MaquinaSoldar maquinaSoldar;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void sacarPasaporte(Pasaporte p) {
        this.pasaporte = p;
    }

    public void tomarVuelo(String pais) {
        if (pasaporte != null && pasaporte.isEstaVigente()) {
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + pais + ".");
        } else {
            System.out.println(nombre + " " + apellidos + " no puede tomar el vuelo, ya que su pasaporte está vigente.");
        }
    }

    public void adoptarMascota(Mascota m) {
        this.mascota = m;
    }

    public void jugarConMascota() {
        if (mascota != null) {
            mascota.jugar();
        } else {
            System.out.println(nombre + " no tiene mascota para jugar.");
        }
    }

    public void setMaquinaSoldar(MaquinaSoldar maquinaSoldar) {
        this.maquinaSoldar = maquinaSoldar;
    }

    public void soldar(String metal) {
        if (maquinaSoldar != null) {
            maquinaSoldar.soldar(metal);
        } else {
            System.out.println(nombre + " no tiene una máquina de soldar.");
        }
    }
}
