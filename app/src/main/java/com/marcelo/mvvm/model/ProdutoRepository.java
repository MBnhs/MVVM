package com.marcelo.mvvm.model;

import java.util.Arrays;
import java.util.List;

public class ProdutoRepository {

    public List<Produto> listaTodos() {
        return Arrays.asList(new Produto("Bola de Futebol", "Ideal para prática de futebol de campo", Double.valueOf(79.99)),
                new Produto("Camisa da seleção", "Camisa oficial da seleção brasileira I, temporada 2018/2019", Double.valueOf(249.99)),
                new Produto("Tênis de Corrida", "Ideal para prática de longas corridas. Amortecimento especial", Double.valueOf(499.99)),
                new Produto("Bola de Futsal", "Ideal para prática de futebol de salão", Double.valueOf(79.99)));
    }

}
