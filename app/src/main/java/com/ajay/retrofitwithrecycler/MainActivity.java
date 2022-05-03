package com.ajay.retrofitwithrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ajay.retrofitwithrecycler.databinding.ActivityMainBinding;
import com.ajay.retrofitwithrecycler.recyclerview.adapterClass;
import com.ajay.retrofitwithrecycler.retrofit.RetrofitHomeActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        rec=(RecyclerView)findViewById(R.id.id_recycler_view);

        rec.setLayoutManager(new LinearLayoutManager(this));
        String arr[]={"c","c++","python","java","c","c++","python","java","c","c++","python","java"};
        rec.setAdapter(new adapterClass(arr));


        binding.floatingButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, RetrofitHomeActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"it has clicked",Toast.LENGTH_SHORT).show();
            }
        });


    }
}