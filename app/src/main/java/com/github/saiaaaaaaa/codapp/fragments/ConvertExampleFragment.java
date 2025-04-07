package com.github.saiaaaaaaa.codapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.saiaaaaaaa.cod.Convert;
import com.github.saiaaaaaaa.codapp.R;

import java.util.Date;

public class ConvertExampleFragment extends Fragment {

    public ConvertExampleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_convert_example, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView convert_tob64 = view.findViewById(R.id.convert_tob64);
        TextView convert_fromb64 = view.findViewById(R.id.convert_fromb64);
        TextView convert_tomdy = view.findViewById(R.id.convert_tomdy);
        TextView convert_todmy = view.findViewById(R.id.convert_todmy);
        TextView convert_toymd = view.findViewById(R.id.convert_toymd);

        convert_tob64.setText(Convert.toBase64("Sample text"));
        convert_fromb64.setText(Convert.fromBase64("U2FtcGxlIHRleHQ="));
        convert_tomdy.setText(Convert.dateToMMDDYY(new Date()));
        convert_todmy.setText(Convert.dateToDDMMYY(new Date()));
        convert_toymd.setText(Convert.dateToYYMMDD(new Date()));
    }
}