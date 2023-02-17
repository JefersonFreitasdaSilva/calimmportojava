import java.util.Scanner;

public class DeclaradorIRPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // pedir ao usuário para inserir os rendimentos tributáveis
        System.out.print("Informe o valor dos seus rendimentos tributáveis: ");
        double rendimentos = sc.nextDouble();

        // pedir ao usuário para inserir as despesas dedutíveis
        System.out.print("Informe o valor das suas despesas dedutíveis: ");
        double despesas = sc.nextDouble();
        
        // pedir ao usuário para inserir o valor dos bens e direitos
        System.out.print("Informe o valor dos seus bens e direitos: ");
        double bens = sc.nextDouble();
        
        // pedir ao usuário para inserir o valor das dívidas e ônus
        System.out.print("Informe o valor das suas dívidas e ônus: ");
        double dividas = sc.nextDouble();
        
        // calcular a base de cálculo do imposto
        double baseCalculo = rendimentos - despesas;

        // calcular o valor do imposto a pagar ou a restituir
        double imposto;
        if (baseCalculo <= 1903.98) {
            imposto = 0;
        } else if (baseCalculo <= 2826.65) {
            imposto = (baseCalculo * 0.075) - 142.80;
        } else if (baseCalculo <= 3751.05) {
            imposto = (baseCalculo * 0.15) - 354.80;
        } else if (baseCalculo <= 4664.68) {
            imposto = (baseCalculo * 0.225) - 636.13;
        } else {
            imposto = (baseCalculo * 0.275) - 869.36;
        }

        // calcular o valor da restituição ou do imposto a pagar
        double resultado = imposto - dividas;

        // exibir o resultado para o usuário
        if (resultado < 0) {
            System.out.printf("Restituição: R$ %.2f%n", Math.abs(resultado));
        } else {
            System.out.printf("Imposto a pagar: R$ %.2f%n", resultado);
        }
        
        sc.close();
    }
}
