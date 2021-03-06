package com.mhkarazeybek.uubmb;


import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChangePasswordFragment extends Fragment {

    private View mView;
    private FirebaseAuth mAuth;
    static TextInputLayout oldpass,newpass;

    private FirebaseUser user;

    public ChangePasswordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         mView = inflater.inflate(R.layout.fragment_change_password, container, false);
         oldpass = mView.findViewById(R.id.old_pass);
         newpass = mView.findViewById(R.id.new_pass);
         mAuth=FirebaseAuth.getInstance();
         user = FirebaseAuth.getInstance().getCurrentUser();

        return mView;
    }



}
