package com.example.farmlink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class role_selection_Activity extends AppCompatActivity
{
    TextView tvCustomerCardText, tvFarmerCardText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection);
        tvCustomerCardText = findViewById(R.id.tvCustomerCardText);
        tvFarmerCardText = findViewById(R.id.tvFarmerCardText);

        tvCustomerCardText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            Intent intent = new Intent(role_selection_Activity.this, MainActivity.class);
            startActivity(intent);
            }
        });

        tvFarmerCardText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(role_selection_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });




    }
}