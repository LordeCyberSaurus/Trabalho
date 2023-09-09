import javax.swing.JOptionPane;
public class EX4_1 {
     public static void main (String[] args){
    	 String atual = JOptionPane.showInputDialog(null, "Digite o ano atual: ");
    	 int iatual = Integer.parseInt(atual);
    	 String nasc = JOptionPane.showInputDialog(null, "Digite o ano de nascimento: ");
    	 int inasc = Integer.parseInt(nasc);
    	 int x = iatual - inas;
    	 JOptionPane.showMessageDialog(null, " Sua idade é: " +x);
    	 

     }
}
