import javax.swing.JOptionPane;
public class Ex1 {
    public static void main(String[] args) {
        // declaração de variáveis
        double cotacao;
        double quantidadeDolares;
        double resultado;
        //entrada
        cotacao = Double.parseDouble(
            JOptionPane.showInputDialog(
                "Qual a cotação?"

            )
        );
        quantidadeDolares = Double.parseDouble(
            JOptionPane.showInputDialog(
                "Qual a qtde de dolares?"
         )
         );
         //processamento
         resultado = quantidadeDolares * cotacao;
         //saida
         JOptionPane.showMessageDialog(null,
         "valor convertido: " + resultado
         );

    }
    
}