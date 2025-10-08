public class Main {
    public static void main(String[] args) {

        // Crear pasaportes
        Pasaporte p1 = new Pasaporte("123", "Costarricense", "01/01/2022", "01/01/2032", true);
        Pasaporte p2 = new Pasaporte("456", "Costarricense", "01/01/2015", "01/01/2020", false);

        // Crear personas
        Persona persona1 = new Persona("Romario", "Salas Cerdas");
        Persona persona2 = new Persona("Trayce", "González");

        persona1.sacarPasaporte(p1);
        persona2.sacarPasaporte(p2);

        persona1.tomarVuelo("España");
        persona2.tomarVuelo("México");

        // Mascota compartida
        Mascota nami = new Mascota("Namiko", "Perro", 2);
        persona1.adoptarMascota(nami);
        persona2.adoptarMascota(nami);

        persona1.jugarConMascota();
        persona2.jugarConMascota();

        // Máquina de soldar
        String[] metales = {"hierro", "cobre", "aluminio"};
        MaquinaSoldar maquina = new MaquinaSoldar("Generic", "123X", 1200, metales);

        persona1.setMaquinaSoldar(maquina);

        persona1.soldar("hierro");
        persona1.soldar("titanio");
    }
}
