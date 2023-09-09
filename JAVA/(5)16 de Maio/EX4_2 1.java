import javax.swing.JOptionPane;
public class EX4_2 {
	     public static void main (String[] args){
	    	 String base = JOptionPane.showInputDialog(null, "Digite o valor da base: ");
	    	 int ibase = Integer.parseInt(base);
	    	 String altura = JOptionPane.showInputDialog(null, "Digite a altura: ");
	    	 int ialtura = Integer.parseInt(altura);
	    	 int r = (ibase * ialtura)/2;
	    	 JOptionPane.showMessageDialog(null, " O calculo da area é: " +r);

	}
}

