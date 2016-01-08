package concesionario;
//Yasmin

import javax.swing.JOptionPane;

public class Concesionario {

    public static void main(String[] args) {
        Motos vespa = new Motos(125, 50);
        JOptionPane.showMessageDialog(null, "Imposto" + vespa.calcularImposto());
        JOptionPane.showMessageDialog(null, vespa.arrancar());
        Coche citroen = new Coche(65, 1003, 4);
        JOptionPane.showMessageDialog(null, "Imposto" + citroen.calcularImposto());
        JOptionPane.showMessageDialog(null, citroen.arrancar());
        Camion barreiro = new Camion(3000, 400, 8);
        JOptionPane.showMessageDialog(null, "Imposto" + barreiro.calcularImposto());
        JOptionPane.showMessageDialog(null, barreiro.arrancar());
        JOptionPane.showMessageDialog(null, citroen.toString());
        
    }

}
