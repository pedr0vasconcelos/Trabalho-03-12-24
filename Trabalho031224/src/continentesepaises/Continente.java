package continentesepaises;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;                // Nome do continente (ex: "América do Sul")
    private List<Pais> paises;          // Lista de países pertencentes ao continente

    // Construtor
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Adiciona um país ao continente
    public void adicionarPais(Pais pais) {
        if (pais != null && !paises.contains(pais)) {
            paises.add(pais);
        }
    }

    // Retorna o nome do continente
    public String getNome() {
        return nome;
    }

    // Retorna a lista de países do continente
    public List<Pais> getPaises() {
        return paises;
    }

    // Calcula a dimensão total do continente
    public double getDimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    // Calcula a população total do continente
    public int getPopulacaoTotal() {
        int populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    // Calcula a densidade populacional do continente (hab/km²)
    public double getDensidadePopulacional() {
        double dimensaoTotal = getDimensaoTotal();
        if (dimensaoTotal == 0) {
            return 0; // Evita divisão por zero
        }
        return getPopulacaoTotal() / dimensaoTotal;
    }

    // Retorna o país com maior população
    public Pais getPaisMaiorPopulacao() {
        if (paises.isEmpty()) return null;

        Pais maior = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maior.getPopulacao()) {
                maior = pais;
            }
        }
        return maior;
    }

    // Retorna o país com menor população
    public Pais getPaisMenorPopulacao() {
        if (paises.isEmpty()) return null;

        Pais menor = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < menor.getPopulacao()) {
                menor = pais;
            }
        }
        return menor;
    }

    // Retorna o país com maior dimensão territorial
    public Pais getPaisMaiorDimensao() {
        if (paises.isEmpty()) return null;

        Pais maior = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() > maior.getDimensao()) {
                maior = pais;
            }
        }
        return maior;
    }

    // Retorna o país com menor dimensão territorial
    public Pais getPaisMenorDimensao() {
        if (paises.isEmpty()) return null;

        Pais menor = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getDimensao() < menor.getDimensao()) {
                menor = pais;
            }
        }
        return menor;
    }
}
