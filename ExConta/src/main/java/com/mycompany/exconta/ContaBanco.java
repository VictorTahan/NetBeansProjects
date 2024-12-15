package com.mycompany.exconta;
import java.util.Random;

public class ContaBanco {
    Random rand = new Random();
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public void estadoConta(){
        System.out.println("------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Titular da conta: " + this.getDono());
        System.out.println("Saldo atual: " + this.getSaldo());
        mostrarStatus();
        System.out.println("------------------------------------");
    }
    public void abrirConta(String t,String nome){
        this.setTipo(t);
        this.setDono(nome);
        this.setStatus(true);
        if (this.getTipo() == "CC"){
            this.setSaldo(50);
        } else if (this.getTipo() == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta de " + nome + " aberta com sucesso!");
        this.setNumConta(rand.nextInt(100));
    }
    public void fecharConta(){
        if (this.saldo < 0){
            System.out.println("Não foi possível fechar a conta, pois seu saldo está negativo!");
        } else if (this.saldo > 0){
            System.out.println("Não foi possível fechar a conta, pois você ainda possui saldo em aberto!");
        }else{
            System.out.println("Conta fechada com sucesso!");
        }
        this.setStatus(false);
    }
    public void depositar(float dep){
        if (this.isStatus() == false){
            System.out.println("Não é possível realizar um depósito, pois a conta está fechada!");
        }else{
            this.setSaldo(this.getSaldo()+ dep);
            System.out.println("Foi depositado com sucesso o valor de " + dep);
        }
    }
    public void sacar(float saque){
        if (this.isStatus() == false){
            System.out.println("Não é possível realizar um saque, pois a conta está fechada!");
        }else if(this.getSaldo() < saque){
            System.out.println("Não é possível realizar um saque maior que o seu saldo!");
        }else {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque de " + saque + " realizado com sucesso!");
        }
    }
    public void pagarMensal(){
        if (this.isStatus() == false){
            System.out.println("Não é possível pagar a mensalidade, pois a conta está fechada!");
        }else if (this.getTipo() == "CC"){
            this.setSaldo(this.getSaldo()-12);
            System.out.println("Mensalidade no valor de" + 12.00 + " paga com sucesso!");
        }else if (this.getTipo() == "CP"){
            this.setSaldo(this.getSaldo()-20);
            System.out.println("Mensalidade no valor de" + 20.00 + " paga com sucesso!");
        }
    }
    public void mostrarStatus(){
        if (this.isStatus() == true){
            System.out.println("Conta aberta");
        }
        else{
            System.out.println("Conta fechada");
        }
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }                
    
}
