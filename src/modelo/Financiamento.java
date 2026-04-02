package modelo;

import java.util.ArrayList;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;
    private double pagamentoMensal;
    private double pagamentoTotal;

    public double getValorImovel(){
        return valorImovel;
    }

    public int getPrazoFinanciamento(){
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){
        return taxaJurosAnual;
    }

    public double getPagamentoMensal(){
        return pagamentoMensal;
    }

    public Financiamento (double valorIm, int prazoFinan, double taxAnual) {
        valorImovel = valorIm;
        prazoFinanciamento = prazoFinan;
        taxaJurosAnual = taxAnual;
    }

    public double calcularPagamentoMensal() {
        pagamentoMensal = (valorImovel/(prazoFinanciamento*12))*(1+(taxaJurosAnual/12));
        return pagamentoMensal;
    }

    public double calcularPagamentoTotal() {
        pagamentoTotal = pagamentoMensal*prazoFinanciamento*12;
        return pagamentoTotal;
    }

    public void dadosFinanciamento(){
        calcularPagamentoMensal();
        calcularPagamentoTotal();
        System.out.printf("Valor do imóvel: R$ %.2f%n", valorImovel);
        System.out.printf("Valor total do financiamento: R$ %.2f%n", pagamentoTotal);
    }

    public static void dadosTodosFinanciamentos(ArrayList<Financiamento> lista) {
        int n = 0;
        double valorTodosImoveis = 0;
        double valorTodosFinanciamentos = 0;
        for(Financiamento f : lista) {
            System.out.println("Financiamento " + (n+=1));
            f.dadosFinanciamento();
            System.out.println("--------------------");
        }

        for(Financiamento f : lista) {
            valorTodosImoveis += f.getValorImovel();
        }
        System.out.printf("Valor total de todos os imóveis: R$ %.2f%n", valorTodosImoveis);

        for(Financiamento f : lista) {
            valorTodosFinanciamentos += f.calcularPagamentoTotal();
        }
        System.out.printf("Valor total de todos os financiamentos: R$ %.2f%n", valorTodosFinanciamentos);
    }


}
