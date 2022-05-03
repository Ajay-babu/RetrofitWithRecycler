package com.ajay.retrofitwithrecycler.post;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;

import com.ajay.retrofitwithrecycler.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostActivity extends AppCompatActivity {
TextView textView;
String url="https://jsonplaceholder.typicode.com/";
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);


        textView=(TextView) findViewById(R.id.id_tv);
        textView.setText("");

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("please wait");
        progressDialog.setCancelable(false);
        progressDialog.show();


        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        myapi api=retrofit.create(myapi.class);

        Call<List<model>> call=api.getmodel();
        call.enqueue(new Callback<List<model>>() {
            @Override
            public void onResponse(Call<List<model>> call, Response<List<model>> response) {
                progressDialog.hide();
                List<model> data=response.body();
                for (int i=0; i<data.size(); i++)
                    textView.append(" User Id:"+data.get(i).getUserId()+" \n Id:"+data.get(i).getId()+" " +
                            "\n Title:"+data.get(i).getTitle()+" \n Body:"+data.get(i).getBody()+"\n\n\n");

            }

            @Override
            public void onFailure(Call<List<model>> call, Throwable t) {

            }
        });

    }
}