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

public class Sai1 extends Fragment implements View.OnClickListener {

    RecyclerView mrecyclerView;
    AdapterSai adapterSai;

    private Sai1.OnFragmentInteractionListener mListener;

    public Sai1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sai_penjelasan, container, false);

        mrecyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(getActivity()));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterSai = new AdapterSai(getActivity(), getMyList());
        mrecyclerView.setAdapter(adapterSai);
        // Inflate the layout for this fragment
        mrecyclerView.setOnClickListener(this);
        return view;
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Sejarah");
        model.setImg(R.mipmap.s_sejarah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Hikmah");
        model.setImg(R.mipmap.s_hikmah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Rukun");
        model.setImg(R.mipmap.s_rukun);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Hukum-hukum");
        model.setImg(R.mipmap.s_hukum);
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
        if (context instanceof Sai1.OnFragmentInteractionListener) {
            mListener = (Sai1.OnFragmentInteractionListener) context;
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
