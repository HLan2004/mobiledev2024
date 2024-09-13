package com.example.weatheractivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout layout = new LinearLayout(getContext());
        layout.setOrientation(LinearLayout.VERTICAL);


        TextView textView = new TextView(getContext());
        textView.setText("Weather");

        // Create a new ImageView
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.weather1);
        imageView.setBackgroundColor(0xFF000000);
        imageView.setPadding(16, 16, 16, 16);

         //Add the TextView and ImageView to the layout
        layout.addView(textView);
        layout.addView(imageView);


         //Return the layout as the root view of the fragment
        return layout;
//       View view = inflater.inflate(R.layout.fragment_blank, container, false);
//        view.setBackgroundColor(0xFF000000);
//        return view;
    }
}