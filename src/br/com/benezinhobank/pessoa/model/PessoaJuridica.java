package br.com.benezinhobank.pessoa.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    private String razaoSocial;


    private Collection<Pessoa> socios = new Vector<>();



    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, LocalDate nascimento, String CNPJ, String razaoSocial, Collection<Pessoa> socios) {
        super(nome, nascimento);
        this.setCNPJ(CNPJ);
        this.setRazaoSocial(razaoSocial);
        this.socios = socios;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public Collection<Pessoa> getSocios() {    //isso serve para que a pessoa tenha acesso a lista de spcios, mas nao consiga edita-la
        return Collections.unmodifiableCollection(this.socios);
    }
    public PessoaJuridica addSocio(Pessoa socios){
        this.socios.add(socios);
        return this;
    }

    public PessoaJuridica removeSocios(Pessoa socios){
        this.socios.remove(socios);
        return this;
    }



    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", socios=" + socios +
                "} " + super.toString();
    }
}
