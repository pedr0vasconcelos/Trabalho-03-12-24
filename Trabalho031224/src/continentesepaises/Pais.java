package continentesepaises;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigo;            // Código do país (ex: "BRA")
    private String nome;              // Nome do país (ex: "Brasil")
    private double dimensao;          // Dimensão territorial em km²
    private int populacao;            // População do país
    private List<Pais> fronteiras;    // Lista de países vizinhos

    // Construtor
    public Pais(String codigo, String nome, double dimensao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = 0;           // Inicializa a população como 0
        this.fronteiras = new ArrayList<>(); // Inicializa a lista de fronteiras
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    // Adiciona um país como fronteira
    public void addFronteira(Pais pais) {
        if (pais != null && !this.fronteiras.contains(pais) && pais != this) {
            this.fronteiras.add(pais);
        }
    }

    // Retorna os vizinhos comuns entre este país e outro
    public List<Pais> getVizinhosComuns(Pais outroPais) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais pais : this.fronteiras) {
            if (outroPais.getFronteiras().contains(pais)) {
                vizinhosComuns.add(pais);
            }
        }
        return vizinhosComuns;
    }

    @Override
    public String toString() {
        return nome + " (" + codigo + ")";
    }
}
