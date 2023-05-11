package br.com.benezinhobank.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Banco {

    private String nome;

    //private Agencia[] agencia = new Agencia[]; AQUI EU PRECISO SABER QUANTAS AGENCIAS TEM
    private Collection<Agencia> agencias = new Vector<>(); //QUANDO SE TRABALHA COM COLEÇÃO EU PRECISO DE UM METODO PRA TIRAR COISAS DA COLEÇÃO E UM METODO PARW COLOCAR

    public Banco addAgencia(Agencia agencia){
        this.agencias.add(agencia);
        agencia.setBanco(this);//this é o proprio banco
        var numeroAgencia = this.agencias.size()+1;
        var digito = new Random().nextInt(9);
        agencia.setNumero(numeroAgencia + "-" + digito);
        return this;
    }

    public Banco removeAgencia(Agencia agencia){
        this.agencias.remove(agencia);
        agencia.setBanco(null);
        return this;
    }

    public Collection<Agencia> getAgencias(){

        return Collections.unmodifiableCollection(this.agencias);
        //dessa forma as pessoas conseguem ter acesso a coleção de agencias e não consegue modificar
    }



    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
