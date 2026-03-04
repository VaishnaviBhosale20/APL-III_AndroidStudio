package com.example.ass5fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment extends Fragment {

    Button btnActivity1, btnActivity2;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btnActivity1 = view.findViewById(R.id.btnActivity1);

        btnActivity1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Activity1.class);
            startActivity(intent);
        });


        return view;
    }
}
