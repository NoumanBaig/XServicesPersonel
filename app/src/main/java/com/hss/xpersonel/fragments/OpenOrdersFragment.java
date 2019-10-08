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
import com.hss.xpersonel.adapters.OpenOrdersAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OpenOrdersFragment extends Fragment {

    @BindView(R.id.recyclerOpen)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.open_orders_fragment,container,false);
        ButterKnife.bind(this,view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        OpenOrdersAdapter openOrdersAdapter = new OpenOrdersAdapter(getActivity());
        recyclerView.setAdapter(openOrdersAdapter);

        return view;
    }
}
