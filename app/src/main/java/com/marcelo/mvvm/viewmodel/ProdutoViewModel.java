package com.marcelo.mvvm.viewmodel;

import android.arch.lifecycle.ViewModel;

import com.marcelo.mvvm.model.Produto;
import com.marcelo.mvvm.model.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

public class ProdutoViewModel extends ViewModel {


    private String nome;
    private String descricao;
    private Double preco;

    public ProdutoViewModel() {
    }

    public ProdutoViewModel(Produto produto) {
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.preco = produto.getPreco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco.toString();
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<ProdutoViewModel> getProdutos() {

        List<ProdutoViewModel> produtos = new ArrayList<>();

        for (Produto produto : new ProdutoRepository().listaTodos()
                ) {
            produtos.add(new ProdutoViewModel(produto));
        }

        return produtos;

    }
}
