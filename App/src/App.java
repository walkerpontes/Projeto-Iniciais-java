import javax.swing.JOptionPane;

//variaveis tipo inteiro (int)
//variaveis tipo Caracteries (String)
//variaveis tipo decimal (double)
//caixa de dialogo digitavél (JOptionPane.showInputDialog)
//caixa de mensagem (JOptionPane.showMessageDialog)
public class App {
    public static void main(String[] args) {
        var nome =   JOptionPane.showInputDialog(null,"Digite seu nome:");
        var idade = JOptionPane.showInputDialog(null,"Digite sua idade:");
        var peso = JOptionPane.showInputDialog(null,"Digite seu peso:");
        JOptionPane.showMessageDialog (null, "Seu nome é: "+nome+"\n"+"Sua idade é: "+idade+"\n"+"Seu peso é: "+peso);
       // System.out.println("Seu nome é: " + name);
       // System.out.println("Sua idade é: " + idade);
       // System.out.println("Seu peso é: " + peso);

        //if (name == "Walker") {
            //System.out.println("Seu nome é: " + name);
       // }
    }
}
