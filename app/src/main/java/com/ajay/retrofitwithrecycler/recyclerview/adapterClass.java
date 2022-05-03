package com.ajay.retrofitwithrecycler.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajay.retrofitwithrecycler.R;

public class adapterClass extends RecyclerView.Adapter<adapterClass.holder> {
    String data[];

    public adapterClass(String[] data) {
        this.data = data;
    }


    @NonNull
    @Override
    public adapterClass.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recyclerview_design,parent,false);

        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterClass.holder holder, int position) {

        holder.tv1.setText(data[position]);
        holder.tv2.setText(data[position]);
        holder.tv3.setText(data[position]);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class holder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv1,tv2,tv3;
        public holder(@NonNull View itemView) {
            super(itemView);

            img=(ImageView) itemView.findViewById(R.id.id_img1);
            tv1=(TextView) itemView.findViewById(R.id.text1);
            tv2=(TextView) itemView.findViewById(R.id.text2);
            tv3=(TextView) itemView.findViewById(R.id.text3);
        }
    }
}
