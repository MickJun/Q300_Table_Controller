package com.benqmedicaltech.fragment_test;


import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    private TextView tv;
    private String name;
//    public Fragment2() {
//        // Required empty public constructor
//    }
    public Fragment2(String fName) {
        // Required empty public constructor
        this.name = fName;
    }


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_fragment2, container, false);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_fragment2,container,false);
        tv = (TextView) view.findViewById(R.id.fragment2_text);
        tv.setText(name);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("我变了-" + name);
            }
        });
        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            //Fragment隐藏时调用
        } else {
            //Fragment显示时调用
        }
    }

    //@Override
    public View onClick(View v) {
        tv = (TextView) v.findViewById(R.id.fragment2_text);
        switch (v.getId()) {
            case R.id.fragment2_button1:
                tv.setText("Btn1");
                break;
            case R.id.fragment2_button2:
                tv.setText("Btn2");
                break;
            case R.id.fragment2_button3:
                tv.setText("Btn3");
                break;
            case R.id.fragment2_button4:
                tv.setText("Btn4");
                break;
        }
        return v;
    }

}
