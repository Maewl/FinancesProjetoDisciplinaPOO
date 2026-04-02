package main;
import java.util.ArrayList;
import modelo.Financiamento;
import util.InterfaceUsuario;

import static modelo.Financiamento.dadosTodosFinanciamentos;

public class Main {
    public static void main (String[] args){
        InterfaceUsuario iu = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<Financiamento>();
        financiamentos.add(new Financiamento(200000, 30, 5));
        financiamentos.add(new Financiamento(300000, 30, 5));
        financiamentos.add(new Financiamento(150000, 30, 5));
        financiamentos.add(new Financiamento(250000, 30, 5));

        dadosTodosFinanciamentos(financiamentos);

        //Financiamento novoFinanciamento = new Financiamento(iu.pedirValorImovel(), iu.pedirPrazoFinanciamento(), iu.pedirTaxaJuros());

    }
}
