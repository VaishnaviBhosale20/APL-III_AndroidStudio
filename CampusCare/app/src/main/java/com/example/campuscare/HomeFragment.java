package com.example.campuscare;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize Buttons
        Button btnAttendance = view.findViewById(R.id.btnAttendance);
        Button btnFees = view.findViewById(R.id.btnFees);
        Button btnEvents = view.findViewById(R.id.btnEvents);
        Button btnComplaints = view.findViewById(R.id.btnComplaints);

        // Click Listeners
        btnAttendance.setOnClickListener(v ->
                Toast.makeText(getActivity(), "Attendance Clicked", Toast.LENGTH_SHORT).show());

        btnFees.setOnClickListener(v ->
                Toast.makeText(getActivity(), "Fees Clicked", Toast.LENGTH_SHORT).show());

        btnEvents.setOnClickListener(v ->
                Toast.makeText(getActivity(), "Events Clicked", Toast.LENGTH_SHORT).show());

        btnComplaints.setOnClickListener(v ->
                Toast.makeText(getActivity(), "Complaints Clicked", Toast.LENGTH_SHORT).show());

        return view;
    }
}