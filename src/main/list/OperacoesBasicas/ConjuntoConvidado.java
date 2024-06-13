package main.list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributos

    private final Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet <>();
    }


    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args){
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + "dentro do Set de Convidados");

        conjuntoConvidado.adicionarConvidado("Lucia", 1234);
        conjuntoConvidado.adicionarConvidado("Fernanda", 2526);
        conjuntoConvidado.adicionarConvidado("Antony", 4147);
        conjuntoConvidado.adicionarConvidado("Anne", 5859);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + "dentro do Set de Convidado");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(5859);
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + "dentro do Set de Convidado");
    }
}
