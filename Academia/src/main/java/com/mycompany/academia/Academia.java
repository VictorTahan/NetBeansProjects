

package com.mycompany.academia;

import Academia.Modalidade;
public class Academia {

    public static void main(String[] args) {
       Modalidade modalidade1 = new Modalidade();
       modalidade1.modalidade = "Musculação";
       modalidade1.diadasemana = "Segunda-feira";
       System.out.println(modalidade1.getModalidade());
       System.out.println(modalidade1.getDiadasemana());
    }
}
