package com.hss.xpersonel.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.hss.xpersonel.R;
import com.hss.xpersonel.activities.InvoiceActivity;


public class ClosedOrdersAdapter extends RecyclerView.Adapter<ClosedOrdersAdapter.CategoryViewholder> {

    Context mContext;
    public ClosedOrdersAdapter(Context context) {
        this.mContext=context;
    }

    @NonNull
    @Override
    public CategoryViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cell_closed_orders,parent,false);
        return new CategoryViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewholder holder, int position) {

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, InvoiceActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    class CategoryViewholder extends RecyclerView.ViewHolder{

        CardView cardView;
        public CategoryViewholder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}
