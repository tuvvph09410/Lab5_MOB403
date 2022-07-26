package com.example.lab5_mob401.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.lab5_mob401.R;


public class Fragment_Home extends Fragment {
    Button btnViewProduct, btnNewProduct;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__home, container, false);
        initViewById(view);
        initClickListener();
        return view;
    }

    private void initClickListener() {
        btnNewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new Fragment_add_product());
            }
        });
        btnViewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new Fragment_view_product());
            }
        });
    }

    private void initViewById(View view) {
        btnNewProduct = view.findViewById(R.id.btn_add_product);
        btnViewProduct = view.findViewById(R.id.btn_view_product);
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container_view_tag, fragment);
        fragmentTransaction.commit();
    }
}