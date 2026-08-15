package com.example.farmlink;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class role_selection_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_role_selection);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CardView cvCustomer = findViewById(R.id.cvCustomerCard);
        CardView cvFarmer = findViewById(R.id.cvFarmerCard);

        cvCustomer.setOnClickListener(v -> {
            Intent intent = new Intent(role_selection_Activity.this, CustomerLogin.class);
            startActivity(intent);
        });

        cvFarmer.setOnClickListener(v -> {
            Intent intent = new Intent(role_selection_Activity.this, SellerLogin.class);
            startActivity(intent);
        });
    }
}