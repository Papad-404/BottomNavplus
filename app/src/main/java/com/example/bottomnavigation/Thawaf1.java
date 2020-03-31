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

public class Thawaf1 extends Fragment implements View.OnClickListener {

    RecyclerView mrecyclerView;
    AdapterThawaf adapterThawaf;

    private OnFragmentInteractionListener mListener;

    public Thawaf1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.thawaf_penjelasan, container, false);

        mrecyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(getActivity()));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterThawaf = new AdapterThawaf(getActivity(), getMyList());
        mrecyclerView.setAdapter(adapterThawaf);
        // Inflate the layout for this fragment

        mrecyclerView.setOnClickListener(this);
        return view;
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Keutamaan");
        model.setImg(R.mipmap.t_keutamaan);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Macam-macam");
        model.setImg(R.mipmap.t_macam);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Syarat-syarat");
        model.setImg(R.mipmap.t_syarat);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Sunnah-sunnah");
        model.setImg(R.mipmap.t_sunnah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Peringatan-peringatan");
        model.setImg(R.mipmap.t_peringatan);
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
