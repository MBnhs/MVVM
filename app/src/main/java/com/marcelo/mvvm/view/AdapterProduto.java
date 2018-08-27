package com.marcelo.mvvm.view;


import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.marcelo.mvvm.R;
import com.marcelo.mvvm.databinding.ItemProdutoBinding;
import com.marcelo.mvvm.model.Produto;
import com.marcelo.mvvm.viewmodel.ProdutoViewModel;

import java.util.List;

public class AdapterProduto extends BaseAdapter {

    private List<ProdutoViewModel> produtosViewModel;
    private Context context;

    public AdapterProduto(List<ProdutoViewModel> produtosViewModel, Context context) {
        this.produtosViewModel = produtosViewModel;
        this.context = context;
    }


    @Override
    public int getCount() {
        return produtosViewModel.size();
    }

    @Override
    public Object getItem(int position) {
        return produtosViewModel.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemProdutoBinding itemProdutoBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_produto, parent, false);
        itemProdutoBinding.setProdutoViewModel(produtosViewModel.get(position));

        return itemProdutoBinding.getRoot();
    }
}
