package com.krishna.fragmentassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.krishna.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalimdromeFragement extends Fragment implements View.OnClickListener {

    Button btnpal;
    EditText etpal;
    TextView tvpal;

    public PalimdromeFragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_palimdrome_fragement,container,false);
        btnpal=view.findViewById(R.id.btnpal);
        etpal=view.findViewById(R.id.etpal);
        tvpal=view.findViewById(R.id.tvpal);
        btnpal.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int reversedInteger = 0, remainder, originalInteger;

        int num=Integer.parseInt(etpal.getText().toString());
        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            tvpal.setText(originalInteger+ " is a palindrome");
        else
            tvpal.setText(originalInteger + " is not a palindrome.");



    }

}
