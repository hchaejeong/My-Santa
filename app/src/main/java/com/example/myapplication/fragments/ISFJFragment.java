package com.example.myapplication.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

public class ISFJFragment extends Fragment {

    public static ISFJFragment newInstance() {
        return new ISFJFragment();
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.isfj, container, false);

        Button home= rootView.findViewById(R.id.return_home_btn);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ((MainActivity)getActivity()).replaceFragment(PresentAdvisorFragment.newInstance());
            }
        });

        // 추가한 부분 : 이미지 누르면 쿠팡으로 이동
        ImageView shoppingImageView1 = rootView.findViewById(R.id.gift_1);
        shoppingImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String shoppingAppPageUrl ="https://m.coupang.com/np/search?q=%EC%84%A0%EB%AC%BC%EC%9A%A9+%EC%8B%9C%EA%B3%84";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(shoppingAppPageUrl));
                startActivity(intent);
            }
        });

        ImageView shoppingImageView2 = rootView.findViewById(R.id.gift_2);
        shoppingImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String shoppingAppPageUrl ="https://m.coupang.com/np/search?q=%ED%96%A5%EC%B4%88";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(shoppingAppPageUrl));
                startActivity(intent);
            }
        });

        ImageView shoppingImageView3 = rootView.findViewById(R.id.gift_3);
        shoppingImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String shoppingAppPageUrl ="https://m.coupang.com/np/search?q=%ED%8E%B8%EC%A7%80+%EC%B9%B4%EB%93%9C";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(shoppingAppPageUrl));
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }
}