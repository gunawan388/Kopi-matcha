package com.example.tulisanmerah;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Layout utama
        LinearLayout layout = new LinearLayout(this);
        layout.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT
        ));
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.WHITE);

        // TextView dengan background merah
        TextView textView = new TextView(this);
        textView.setText("Tulisan Saya");
        textView.setTextColor(Color.WHITE);
        textView.setBackgroundColor(Color.RED);
        textView.setTextSize(24);
        textView.setPadding(40, 40, 40, 40);

        // Tambahkan ke layout
        layout.addView(textView);

        // Set layout ke tampilan utama
        setContentView(layout);
    }
}
