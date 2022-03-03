import javax.swing.JOptionPane;
import javax.swing.JoptionPane;git commit -1 -m "Variaveis do exercicio 1 declaradas"
public class Ex1 {
    public static void main(String[] args) {
        // declaração de variáveis
        double cotacao;
        double quantidadeDolares;
        double resultado;
        //entrada
        cotacao = Double.parseDouble(
            JOtionPane.showInputDialog(
                "Qual a cotação?"

            )
        );
        quantidadeDolares = Doble.parseDouble(
            JOptionPane.showInputDialog(
                "Qual a qtde de dolares?"
         )
         );
         //processamento
         resultado = quantidadedolares * cotacao;
         //saida
         JOptionPane.showMessageDialog(null,
         "valor convertido: " + resultado
         );

    }
    
}