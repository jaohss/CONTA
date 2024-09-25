import java.util.Scanner;
class ContaApp {
    public static void main(String[] args) {
        //Instanciando objetos
        Conta c1 = new Conta(100, 0, 0);
        Scanner scn = new Scanner(System.in);

        do {
            //Entrada de dados
            System.out.println("Digite o valor do depósito a ser realizado: ");
            c1.setDeposito(scn.nextDouble());
            c1.getSaldoDeposito(); //Atualiza o saldo com o depósito


            //Exibe o saldo atualizado
            System.out.println("Saldo disponível na conta: R$"+c1.getSaldo());
            System.out.println();


            //Entrada de dados
            System.out.println("Digite o valor do saque a ser realizado: ");
            c1.setSaque(scn.nextDouble());
            c1.getSaldoSaque();//atualiza o valor do saldo com o saque


            //Exibe o saldo disponível atualizado
            System.out.println("Saldo disponível na conta: R$"+c1.getSaldo());
            System.out.println();


            System.out.println("============================");
            //Exibe os valores de depósito e saques feitod na consulta
            System.out.println("Depósito(s) no dia: R$"+c1.getDeposito());
            System.out.println("Saque: R$"+c1.getSaque());

            System.out.println();

            //Opção caso o usuário queira fazer outra consulta
            System.out.println("Deseja realizar outra consulta ? ");
            c1.setOpcao(scn.next().charAt(0));

            c1.addConsulta(0);//Faz a contagem da quantidade de consultas
            
            
        } while (c1.getOpcao() == 's' || c1.getOpcao() == 'S');

        //Exibe o total de consultas
        System.out.println("Total de consultas: "+ c1.getCons());
        
    
        scn.close();
    }
   
}

