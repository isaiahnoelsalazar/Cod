package com.github.saiaaaaaaa.codapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.saiaaaaaaa.cod.Check;
import com.github.saiaaaaaaa.codapp.R;

import java.util.Date;

public class CheckExampleFragment extends Fragment {

    public CheckExampleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_check_example, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView check_symbol1 = view.findViewById(R.id.check_symbol1);
        TextView check_symbol2 = view.findViewById(R.id.check_symbol2);
        TextView check_number1 = view.findViewById(R.id.check_number1);
        TextView check_number2 = view.findViewById(R.id.check_number2);
        TextView check_space1 = view.findViewById(R.id.check_space1);
        TextView check_space2 = view.findViewById(R.id.check_space2);
        TextView check_seconds = view.findViewById(R.id.check_seconds);
        TextView check_minutes = view.findViewById(R.id.check_minutes);
        TextView check_hours = view.findViewById(R.id.check_hours);
        TextView check_days = view.findViewById(R.id.check_days);

        check_symbol1.setText(String.valueOf(Check.hasSymbols("Sample text")));
        check_symbol2.setText(String.valueOf(Check.hasSymbols("Sample text!")));
        check_number1.setText(String.valueOf(Check.hasNumbers("Sample text")));
        check_number2.setText(String.valueOf(Check.hasNumbers("Sample text1")));
        check_space1.setText(String.valueOf(Check.hasSpaces("Sample_text")));
        check_space2.setText(String.valueOf(Check.hasSpaces("Sample text")));
        check_seconds.setText(String.valueOf(Check.howManySecondsLeft(new Date("02/10/2025"), new Date("02/14/2025"))));
        check_minutes.setText(String.valueOf(Check.howManyMinutesLeft(new Date("02/10/2025"), new Date("02/14/2025"))));
        check_hours.setText(String.valueOf(Check.howManyHoursLeft(new Date("02/10/2025"), new Date("02/14/2025"))));
        check_days.setText(String.valueOf(Check.howManyDaysLeft(new Date("02/10/2025"), new Date("02/14/2025"))));
    }
}