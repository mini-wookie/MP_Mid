package com.example.drawerlayout_wookie.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.drawerlayout_wookie.R;

public class ButtonFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_button, container, false);

        final ImageView imageView = root.findViewById(R.id.image_gallery);

        Button pic1 = root.findViewById(R.id.button);
        Button pic2 = root.findViewById(R.id.button2);
        Button pic3 = root.findViewById(R.id.button3);

        pic1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                imageView.setImageResource(R.drawable.ic_menu_camera);
            }
        });

        pic2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                imageView.setImageResource(R.drawable.ic_menu_gallery);
            }
        });

        pic3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                imageView.setImageResource(R.drawable.ic_menu_slideshow);
            }
        });

        return root;
    }
}