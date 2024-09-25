public class Conta{
    //definição dos atributos privados
    private double saldo;
    private double deposito;
    private double saque;
    private char opcao;
    private int cons;


    //Construtor público
    public Conta(double saldo, double deposito, double saque){
        this.saldo=saldo;
        this.deposito=deposito;
        this.saque=saque;
    }

    //Getter de opção
    public char getOpcao(){
        return opcao;
    }
    //Settr de opção
    public void setOpcao(char opcao){
        this.opcao=opcao;
    }

    //Getter de consultas
    public int getCons(){
        return cons;
    }
    //setter de consultas
    public void setCons(int cons){
        this.cons=cons;
    }

    //Saques========================
    //Calculo do saque em relação ao saldo
    private double SaldoSaque(){
        return this.saldo-=saque;
    }
    //Calculo da taxa do saque
    private double taxaSaque(){
        return 0.005*saque;
    }

    //getter do Saldo com saque taxado
    public double getSaldoSaque(){
        double saldoComTaxa = SaldoSaque()-taxaSaque();
        this.saldo=saldoComTaxa;
        return saldoComTaxa;
    }

    //Getter do saque
    public double getSaque(){
        return saque;
    }
    //Setter do saque
    public void setSaque(double saque){
        this.saque=saque;
    }

    //Depósito============================

    //Calculo do depósito em relação ao saldo
    private double SaldoDeposito(){
        return this.saldo+=deposito;
    }

    //Calculo da taxa do depósito
    private double taxaDeposito(){
        return 0.01*deposito;
    }

    //Getter do saldo com depósito taxado incluido
    public double getSaldoDeposito(){
        double saldoComTaxa = SaldoDeposito()-taxaDeposito();
        this.saldo=saldoComTaxa;
        return saldoComTaxa;
    }

    //Getter do depósito
    public double getDeposito(){
        return deposito;
    }
    //Setter do depósito
    public void setDeposito(double deposito){
        this.deposito=deposito;
    }
    

    //============Saldo==============

    //Getter do saldo
    public double getSaldo(){
        return saldo;
    }
    //===========Saldo===============

    //======================Consultas===================================
    //método responsável por fazer a contagem das consultas
    public void addConsulta(int cons){
        this.cons++;
        verificarTaxaConsulta(); //faz a chamada do método que verifica as taxa de cada 5 consultas
        verificaMensagemConsulta();//faz a chamada do método que exibe determinada mensagem a cada 5 consultas realizadas
    }

    //verifica se a taxa de 0,10 centas vai ser aplicada
    private void verificarTaxaConsulta() {
        if (this.cons % 5 == 0) { // Se a consulta for múltipla de 5, desconta 0,10
            this.saldo -= 0.10;
        }
    }

    private double numeroConsulta(){
        return this.saldo;
    }

    public double getConsultasTaxa(){
        return numeroConsulta();
    }

    private void verificaMensagemConsulta(){
        if(this.cons % 5 ==0){
            System.out.println("Saldo disponível na conta após 5 consultas: R$"+ saldo);
        }
    
    }
    //=========================Consultas===================================


}
