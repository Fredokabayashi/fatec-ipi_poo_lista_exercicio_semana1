Ex10.java
import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String[] x) {
        Double custoFabrica , custoConsumidor, porcentagemDistribuidor = 28.0,
        PercentualImpostos = 45.0, Destribuidor, ValorImpostos;

        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica: "));
        Destribuidor = (custoFabrica * porcentagemDistribuidor) / 100.000;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        custoConsumidor = Destribuidor + ValorImpostos;
        
        String resultado = String.format(       
            "O custo final ao consumidor será: %.2f reais", custoConsumidor
        );

        JOptionPane.showMessageDialog(null, resultado);  
    }
}
© 2022 GitHub, Inc.
