package concesionario;
//Yasmin
public class Motos extends Vehiculo{

    public Motos() {
        super();
    }

    public Motos(int cilindrada, int potencia) {
        super(cilindrada, potencia);
    }
    public float calcularImposto(){
        return (getCilindrada()/30)+(getPotencia()*10);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
