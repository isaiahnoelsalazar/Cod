package com.github.saiaaaaaaa.codapp.fragments;

import static com.github.saiaaaaaaa.codapp.MainActivity.DATABASE_NAME;
import static com.github.saiaaaaaaa.codapp.MainActivity.TABLE_NAME;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.saiaaaaaaa.cod.EasySQL;
import com.github.saiaaaaaaa.codapp.R;

public class EasySQLExampleFragment extends Fragment {

    public EasySQLExampleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_easy_s_q_l_example, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout linearLayout = view.findViewById(R.id.main);
        EasySQL easySQL = new EasySQL(requireContext());

        for (String a : easySQL.getTableValues(DATABASE_NAME, TABLE_NAME)){
            TextView textView = new TextView(requireContext());
            textView.setText(a);
            textView.setTextColor(requireContext().getColor(R.color.black));
            linearLayout.addView(textView);
        }
    }
}