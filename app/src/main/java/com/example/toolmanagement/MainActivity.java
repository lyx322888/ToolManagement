package com.example.toolmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.TextView;

import com.example.popwindowutils.CustomPopWindow;
import com.example.toolmanagement.databinding.ActivityMainBinding;

import static androidx.appcompat.widget.ListPopupWindow.MATCH_PARENT;
import static androidx.appcompat.widget.ListPopupWindow.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tvCeshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CustomPopWindow.PopupWindowBuilder(MainActivity.this)
                        .size(MATCH_PARENT,WRAP_CONTENT)
                        .setView(R.layout.pop_ordinary)
                        .setAnimationStyle(R.style.ScaleOverShootEnterExitAnimationX50Y0)
                        .create()
                        .showAsDropDown( binding.tvCeshi,0,0,Gravity.BOTTOM);
            }
        });
    }


}
