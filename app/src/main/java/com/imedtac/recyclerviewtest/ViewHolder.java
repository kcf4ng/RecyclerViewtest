package com.imedtac.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewHolder extends  RecyclerView.ViewHolder{

    // 宣告元件
    private TextView txtItem;
    private Button btnRemove;

    ViewHolder(View itemView) {
        super(itemView);
        txtItem = (TextView) itemView.findViewById(R.id.txtItem);
        btnRemove = (Button) itemView.findViewById(R.id.btnRemove);

        // 點擊項目時
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),
                        "click " +getAdapterPosition(),Toast.LENGTH_SHORT).show();
            }
        });

        // 點擊項目中的Button時
//        btnRemove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                removeItem(getAdapterPosition());
//            }
//        });
    }




}
