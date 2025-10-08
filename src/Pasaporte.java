public class Pasaporte {
    private String numero;
    private String nacionalidad;
    private String fechaEmision;
    private String fechaVencimiento;
    private boolean estaVigente;

    public Pasaporte(String numero, String nacionalidad, String fechaEmision, String fechaVencimiento, boolean estaVigente) {
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.estaVigente = estaVigente;
    }

    public boolean isEstaVigente() {
        return estaVigente;
    }

    public String getNumero() {
        return numero;
    }
}
