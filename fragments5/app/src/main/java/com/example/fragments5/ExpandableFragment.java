package com.example.fragments5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ExpandableFragment extends Fragment {

    private String title;
    private String content;

    public ExpandableFragment(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_item, container, false);

        Button btnTitle = view.findViewById(R.id.btnTitle);
        TextView txtContent = view.findViewById(R.id.txtContent);

        btnTitle.setText(title);
        txtContent.setText(content);

        btnTitle.setOnClickListener(v -> {
            if (txtContent.getVisibility() == View.GONE) {
                txtContent.setVisibility(View.VISIBLE);
            } else {
                txtContent.setVisibility(View.GONE);
            }
        });

        return view;
    }
}