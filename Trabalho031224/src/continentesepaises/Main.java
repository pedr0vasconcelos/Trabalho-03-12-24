package continentesepaises;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando países
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        brasil.setPopulacao(193946886);

        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        argentina.setPopulacao(45376763);

        Pais uruguai = new Pais("URU", "Uruguai", 176215);
        uruguai.setPopulacao(3473727);

        // Configurando fronteiras
        brasil.addFronteira(argentina);
        brasil.addFronteira(uruguai);

        argentina.addFronteira(brasil);
        argentina.addFronteira(uruguai);

        uruguai.addFronteira(brasil);
        uruguai.addFronteira(argentina);

        // Criando um continente
        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(uruguai);

        // Exibindo informações do continente
        System.out.println("Dimensão total do continente: " + americaDoSul.getDimensaoTotal() + " km²");
        System.out.println("População total do continente: " + americaDoSul.getPopulacaoTotal());
        System.out.println("Densidade populacional: " + americaDoSul.getDensidadePopulacional() + " hab/km²");

        // Encontrando maior e menor população
        System.out.println("País com maior população: " + americaDoSul.getPaisMaiorPopulacao().getNome());
        System.out.println("País com menor população: " + americaDoSul.getPaisMenorPopulacao().getNome());

        // Encontrando maior e menor dimensão territorial
        System.out.println("País de maior dimensão: " + americaDoSul.getPaisMaiorDimensao().getNome());
        System.out.println("País de menor dimensão: " + americaDoSul.getPaisMenorDimensao().getNome());

        // Verificando fronteiras comuns
        List<Pais> vizinhosComuns = brasil.getVizinhosComuns(argentina);
        System.out.println("Vizinhos comuns entre Brasil e Argentina:");
        for (Pais p : vizinhosComuns) {
            System.out.println("- " + p.getNome());
        }
    }
}
