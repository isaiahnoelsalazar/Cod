package com.github.saiaaaaaaa.codapp.fragments;

import static com.github.saiaaaaaaa.codapp.MainActivity.mainActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.saiaaaaaaa.cod.Fullscreen;
import com.github.saiaaaaaaa.codapp.MainActivity;
import com.github.saiaaaaaaa.codapp.R;

public class FullscreenExampleFragment extends Fragment {

    public FullscreenExampleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fullscreen_example, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button fullscreenButton = view.findViewById(R.id.fullscreen_button);
        fullscreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fullscreenButton.getText().equals("Enable fullscreen")){
                    fullscreenButton.setText("Disable fullscreen");
                    Fullscreen.enable(mainActivity);
                } else {
                    fullscreenButton.setText("Enable fullscreen");
                    Fullscreen.disable(mainActivity);
                }
            }
        });
    }
}