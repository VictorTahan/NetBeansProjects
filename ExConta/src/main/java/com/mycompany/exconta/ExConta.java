package com.mycompany.exconta;


public class ExConta {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();
        c1.abrirConta("CC","Jubileu");
        c2.abrirConta("CP","Creuza");
        c1.estadoConta();
        c2.estadoConta();
    }
}
