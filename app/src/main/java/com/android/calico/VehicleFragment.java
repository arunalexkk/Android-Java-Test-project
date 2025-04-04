package com.android.calico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

public class VehicleFragment extends Fragment {

    private TextView vehicle_no;
    private StringBuilder vehicle = new StringBuilder();
    private View rootView;

    public static void replaceFragment(FragmentActivity activity, int contentId, Fragment fragment, boolean shouldAddToStack) {
        FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
        transaction.replace(contentId, fragment, fragment.getClass().getSimpleName());
        if (shouldAddToStack) {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_vehicle_no, container, false);

        vehicle_no = rootView.findViewById(R.id.vehicle_no);


        characterClick();
        numberClick();

        rootView.findViewById(R.id.ok).setOnClickListener(view -> {

            // serverCall

            replaceFragment(requireActivity(), MainActivity.FRAGMENT_CONTAINER, new ConsignmentFragment(), true);
            ;

            //onSuccess

        });

        return rootView;
    }

    private void characterClick() {

        rootView.findViewById(R.id.a_char).setOnClickListener(view -> {

            setText("A");

        });
        rootView.findViewById(R.id.b_char).setOnClickListener(view -> {

            setText("B");

        });
        rootView.findViewById(R.id.c_char).setOnClickListener(view -> {

            setText("C");

        });
        rootView.findViewById(R.id.d_char).setOnClickListener(view -> {

            setText("D");

        });
        rootView.findViewById(R.id.e_char).setOnClickListener(view -> {

            setText("E");

        });
        rootView.findViewById(R.id.f_char).setOnClickListener(view -> {

            setText("F");

        });
        rootView.findViewById(R.id.g_char).setOnClickListener(view -> {

            setText("G");

        });
        rootView.findViewById(R.id.h_char).setOnClickListener(view -> {

            setText("H");

        });
        rootView.findViewById(R.id.i_char).setOnClickListener(view -> {

            setText("I");

        });
        rootView.findViewById(R.id.j_char).setOnClickListener(view -> {

            setText("J");

        });
        rootView.findViewById(R.id.k_char).setOnClickListener(view -> {

            setText("K");

        });
        rootView.findViewById(R.id.l_char).setOnClickListener(view -> {

            setText("L");

        });
        rootView.findViewById(R.id.m_char).setOnClickListener(view -> {

            setText("M");

        });
        rootView.findViewById(R.id.n_char).setOnClickListener(view -> {

            setText("N");

        });
        rootView.findViewById(R.id.o_char).setOnClickListener(view -> {

            setText("O");

        });
        rootView.findViewById(R.id.p_char).setOnClickListener(view -> {

            setText("P");

        });
        rootView.findViewById(R.id.q_char).setOnClickListener(view -> {

            setText("Q");

        });
        rootView.findViewById(R.id.r_char).setOnClickListener(view -> {

            setText("R");

        });
        rootView.findViewById(R.id.s_char).setOnClickListener(view -> {

            setText("S");

        });
        rootView.findViewById(R.id.t_char).setOnClickListener(view -> {

            setText("T");

        });
        rootView.findViewById(R.id.u_char).setOnClickListener(view -> {

            setText("U");

        });
        rootView.findViewById(R.id.v_char).setOnClickListener(view -> {

            setText("V");

        });
        rootView.findViewById(R.id.w_char).setOnClickListener(view -> {

            setText("W");

        });
        rootView.findViewById(R.id.x_char).setOnClickListener(view -> {

            setText("X");

        });
        rootView.findViewById(R.id.y_char).setOnClickListener(view -> {

            setText("Y");

        });
        rootView.findViewById(R.id.z_char).setOnClickListener(view -> {

            setText("Z");

        });


    }

    private void numberClick() {

        rootView.findViewById(R.id.one_char).setOnClickListener(view -> {

            setText("1");

        });
        rootView.findViewById(R.id.two_char).setOnClickListener(view -> {

            setText("2");

        });
        rootView.findViewById(R.id.three_char).setOnClickListener(view -> {

            setText("3");

        });
        rootView.findViewById(R.id.four_char).setOnClickListener(view -> {

            setText("4");

        });
        rootView.findViewById(R.id.five_char).setOnClickListener(view -> {

            setText("5");

        });
        rootView.findViewById(R.id.six_char).setOnClickListener(view -> {

            setText("6");

        });
        rootView.findViewById(R.id.seven_char).setOnClickListener(view -> {

            setText("7");

        });
        rootView.findViewById(R.id.eight_char).setOnClickListener(view -> {

            setText("8");

        });
        rootView.findViewById(R.id.nine_char).setOnClickListener(view -> {

            setText("9");

        });
        rootView.findViewById(R.id.zero_char).setOnClickListener(view -> {

            setText("0");

        });
        rootView.findViewById(R.id.backspace).setOnClickListener(view -> {

            cleartext();

        });
        rootView.findViewById(R.id.backspace).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                clearAlltext();
                return false;
            }
        });

    }

    private void cleartext() {
        int len = vehicle.length();
        if (len > 0) {
            vehicle_no.setText(vehicle.deleteCharAt(len - 1));
        }
    }

    private void clearAlltext() {
        int len = vehicle.length();
        if (len > 0) {
            vehicle_no.setText(vehicle.delete(0, len));
        }
    }

    private void setText(String ch) {

        vehicle.append(ch);
        vehicle_no.setText(vehicle);
    }

}