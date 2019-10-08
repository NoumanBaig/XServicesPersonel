package com.hss.xpersonel.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hss.xpersonel.R;
import com.hss.xpersonel.adapters.ClosedOrdersAdapter;
import com.hss.xpersonel.adapters.OpenOrdersAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClosedOrdersFragment extends Fragment {

    @BindView(R.id.recyclerClosed)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.closed_orders_fragment,container,false);
        ButterKnife.bind(this,view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ClosedOrdersAdapter closedOrdersAdapter = new ClosedOrdersAdapter(getActivity());
        recyclerView.setAdapter(closedOrdersAdapter);

        return view;
    }
}
