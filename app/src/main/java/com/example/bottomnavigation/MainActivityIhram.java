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

public class MainActivityIhram extends Fragment implements View.OnClickListener {

    RecyclerView mrecyclerView;
    AdapterIhram ihramAdapter;

    private OnFragmentInteractionListener mListener;

    public MainActivityIhram() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fiqihumrah_ihram, container, false);

        mrecyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(getActivity()));
        mrecyclerView.setLayoutManager(layoutManager);

        ihramAdapter = new AdapterIhram(getActivity(), getMyList());
        mrecyclerView.setAdapter(ihramAdapter);
        // Inflate the layout for this fragment

        mrecyclerView.setOnClickListener(this);
        return view;
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Penjelasan");
        model.setImg(R.mipmap.ihram_penjelasan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Larangan-larangan");
        model.setImg(R.mipmap.ihram_larangan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Sunnah-sunnah");
        model.setImg(R.mipmap.ihram_sunnah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Niat");
        model.setImg(R.mipmap.ihram_niat);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Kesalahan");
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
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
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

    @Override
    public void onClick(View view) {

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
