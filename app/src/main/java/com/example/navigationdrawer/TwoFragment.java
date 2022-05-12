package com.example.navigationdrawer;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.Adapter.InboxAdapter;
import com.example.navigationdrawer.Adapter.PelukisAdapterCard;
import com.example.navigationdrawer.Data.Inbox;
import com.example.navigationdrawer.Data.InboxData;
import com.example.navigationdrawer.Data.PelukisData;

import java.util.ArrayList;


public class TwoFragment extends Fragment {

    RecyclerView recyclerViewInbox;
    private ArrayList<Inbox> inboxList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Inbox");

        recyclerViewInbox = view.findViewById(R.id.recyclerViewinbox);
        recyclerViewInbox.setHasFixedSize(true);

        recyclerViewInbox = view.findViewById(R.id.recyclerViewinbox);
        recyclerViewInbox.setHasFixedSize(true);

        inboxList.addAll(InboxData.getListData());
        showRecyclerList();

        int spanCount = 1; // 2 columns
        int spacing = 20; // 50px
        boolean includeEdge = true;
        recyclerViewInbox.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));
        recyclerViewInbox.addItemDecoration(new DividerItemDecoration(recyclerViewInbox.getContext(), DividerItemDecoration.VERTICAL));

        //swipe right to add to favorites
        //swipe left to delete

    }

    private void showRecyclerList() {
        recyclerViewInbox.setLayoutManager(new LinearLayoutManager(getActivity()));
        InboxAdapter inboxAdapter = new InboxAdapter(inboxList);
        recyclerViewInbox.setAdapter(inboxAdapter);
    }
}