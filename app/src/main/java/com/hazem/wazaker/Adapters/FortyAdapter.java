package com.hazem.wazaker.Adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hazem.wazaker.Models.Rec_azkar_items;
import com.hazem.wazkar.R;
import com.hazem.wazaker.listeners.ItemListner;
import java.security.AccessControlContext;
import java.util.ArrayList;
import java.util.List;

public class FortyAdapter extends RecyclerView.Adapter<FortyAdapter.Myviewholder> {


    private ItemListner listner;
    private List<Rec_azkar_items> fortyList;

    public FortyAdapter(ArrayList<Rec_azkar_items> fortyList, AccessControlContext context) {
        this.fortyList=fortyList;
    }




    public void setListner(ItemListner listner) {
        this.listner = listner;
    }




    @Override
    public Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.simple_cell, parent, false);
        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(Myviewholder holder, int position) {
        Rec_azkar_items p = fortyList.get(position);
        holder.title.setText(p.getName());
    }

    @Override
    public int getItemCount() {
        return fortyList.size();
    }



    class Myviewholder extends RecyclerView.ViewHolder {
        TextView title;

        public Myviewholder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tvTitle);
            itemView.setOnClickListener((e) -> {
                listner.onItemCLicked(getAdapterPosition());
            });

        }
    }
}
