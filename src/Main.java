import br.com.benezinhobank.model.Agencia;
import br.com.benezinhobank.model.Banco;
import br.com.benezinhobank.model.ContaCorrente;
import br.com.benezinhobank.model.ContaPoupanca;
import br.com.benezinhobank.pessoa.model.PessoaFisica;
import br.com.benezinhobank.pessoa.model.PessoaJuridica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Banco benezinho = new Banco("Benezinho Bank");
        Agencia osasco = new Agencia();
        osasco.setBanco(benezinho);
        osasco.setNome("Osasco");
        osasco.setNumero("1-9");

        PessoaFisica mae = new PessoaFisica();
        mae.setNome("Rosangela Stanguini");
        mae.setNascimento(LocalDate.of(1968,3,26));
        mae.setCPF("15520587690");


        PessoaFisica gabi = new PessoaFisica();
        gabi.setCPF("45210387860");
        gabi.setNascimento(LocalDate.of(2004,9,14));
        gabi.setNome("Gabrielle Stanguini");
        gabi.setMae(mae);

        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(osasco);
        cc.setTitular(gabi);
        cc.setSaldo(1_000_000);
        cc.setLimite(5_000_000);
        cc.setNumero("1-9");

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero("2-8");
        cp.setAniversario(4);
        cp.setAgencia(osasco);
        cp.setSaldo(500_000);
        cp.setTitular(mae);


        PessoaJuridica holding = new PessoaJuridica();
        holding.setCNPJ("12345433/0111-09");
        holding.setNascimento(LocalDate.of(1988,10,5));
        holding.setNome("Benezinho Holding");
        holding.setRazaoSocial("Benezinho Holding SA");

        ContaCorrente ccH = new ContaCorrente();
        ccH.setNumero("3-7");
        ccH.setLimite(800_000_000);
        ccH.setSaldo(1_000_000_000);
        ccH.setTitular(holding);
        ccH.setAgencia(osasco);

        System.out.println(ccH);






    }
}