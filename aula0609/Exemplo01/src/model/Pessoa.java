package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    //Atributos privados
    private int id;
    private String nome;
    private LocalDate dataAbertura;
    private List<Carro> carros = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    //Método para adicionar carro na lista
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public String getCarrosDaPessoa(){
        String resultado = "";
        for(Carro carro : carros){
            resultado = resultado + carro.toString();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Dados da Pessoa: \n" +
                "Id: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Data do cadastro: " + dataAbertura;
    }
}
