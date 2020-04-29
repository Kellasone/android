package com.example.androidfinal.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidfinal.R;
import com.example.androidfinal.activities.AddOrderActivity;
import com.example.androidfinal.activities.LogInOrRegisterActivity;
import com.example.androidfinal.activities.MainActivity;
import com.example.androidfinal.activities.SeeAllOrdersActivity;
import com.example.androidfinal.services.AuthService;

import static android.content.Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

public class MainFragment extends Fragment {

    AuthService auth;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        auth = new AuthService();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view =  inflater.inflate(R.layout.fragment_main, container, false);

        Button logoutButton = view.findViewById(R.id.logoutButton);
        Button addOrderButton = view.findViewById(R.id.addOrderButton);
        Button seeAllOrdersButton = view.findViewById(R.id.see_all);

        addOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddOrderActivity.class);
                startActivity(intent);
            }
        });

        seeAllOrdersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SeeAllOrdersActivity.class);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.logout();
                Intent intent = new Intent(getContext(), LogInOrRegisterActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
        return view;
    }
}
