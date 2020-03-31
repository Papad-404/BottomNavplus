package com.example.bottomnavigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivityMiqot extends Fragment {
    RecyclerView mrecyclerView;
    AdapterMiqot adapterMiqot;

    private MainActivityMiqot.OnFragmentInteractionListener mListener;

    public MainActivityMiqot() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fiqihumrah_miqot, container, false);

        mrecyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(getActivity()));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterMiqot = new AdapterMiqot(getActivity(), getMyList());
        mrecyclerView.setAdapter(adapterMiqot);
        // Inflate the layout for this fragment
        return view;
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Penjelasan");
        model.setImg(R.mipmap.ihram_penjelasan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Miqot-miqot");
        model.setImg(R.mipmap.ihram_miqot);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Jeddah bukan miqot");
        model.setImg(R.mipmap.ihram_jeddah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Kesalahan-kesalahan");
        model.setImg(R.mipmap.ihram_kesalahan);
        models.add(model);


        return models;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivityMiqot.OnFragmentInteractionListener) {
            mListener = (MainActivityMiqot.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
