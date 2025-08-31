package com.example.endoftermhomework;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;


public class TurnFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_turn, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        GoodsBean Goods = new GoodsBean();
        ListView lvGoods = getActivity().findViewById(R.id.lv_goods);
        GoodsAdapter GoodsAdapter = new GoodsAdapter(getActivity(), GoodsBean.getInstance());
        lvGoods.setAdapter(GoodsAdapter);
    }
}