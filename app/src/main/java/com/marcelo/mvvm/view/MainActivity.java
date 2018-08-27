package com.marcelo.mvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.marcelo.mvvm.R;
import com.marcelo.mvvm.databinding.ActivityMainBinding;
import com.marcelo.mvvm.viewmodel.ProdutoViewModel;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private ProdutoViewModel produtoViewModel;
    private AdapterProduto adapterProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        produtoViewModel = new ProdutoViewModel();
        adapterProduto = new AdapterProduto(produtoViewModel.getProdutos(), this);
        activityMainBinding.lvProdutos.setAdapter(adapterProduto);

    }


}
