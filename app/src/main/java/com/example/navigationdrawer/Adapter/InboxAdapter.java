package com.example.navigationdrawer.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigationdrawer.Data.Inbox;
import com.example.navigationdrawer.R;

import java.util.ArrayList;

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.ViewHolder> {

    private ArrayList<Inbox> inboxList;

    public InboxAdapter(ArrayList<Inbox> inboxList) {
        this.inboxList = inboxList;
    }

    @NonNull
    @Override
    public InboxAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.inbox_item, null);
        return new InboxAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InboxAdapter.ViewHolder holder, int position) {
        holder.imageInbox.setImageResource(inboxList.get(position).getImage());
        holder.subjekInbox.setText(inboxList.get(position).getSubjek());
        holder.massageInbox.setText(inboxList.get(position).getMessage());
        holder.dateInbox.setText(inboxList.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return inboxList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageInbox;
        TextView subjekInbox, massageInbox, dateInbox;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageInbox = itemView.findViewById(R.id.imageinbox);
            subjekInbox = itemView.findViewById(R.id.subjekinbox);
            massageInbox = itemView.findViewById(R.id.massageinbox);
            dateInbox = itemView.findViewById(R.id.dateinbox);
        }
    }
}
