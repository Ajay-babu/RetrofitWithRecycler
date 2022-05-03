package com.ajay.retrofitwithrecycler.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ajay.retrofitwithrecycler.databinding.ActivityRetrofitHomeBinding;
import com.ajay.retrofitwithrecycler.post.PostActivity;

public class RetrofitHomeActivity extends AppCompatActivity {
private ActivityRetrofitHomeBinding binding1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding1 = ActivityRetrofitHomeBinding.inflate(getLayoutInflater());
        setContentView(binding1.getRoot());

        binding1.btn1.setOnClickListener((View.OnClickListener) this);
        binding1.btn2.setOnClickListener((View.OnClickListener) this);
        binding1.btn3.setOnClickListener((View.OnClickListener) this);
        binding1.btn4.setOnClickListener((View.OnClickListener) this);
        binding1.btn5.setOnClickListener((View.OnClickListener) this);
        binding1.btn6.setOnClickListener((View.OnClickListener) this);



        binding1.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(RetrofitHomeActivity.this, PostActivity.class);
                startActivity(intent);
            }
        });

    }




}