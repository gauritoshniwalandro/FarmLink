package com.example.farmlink;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.appcompat.widget.AppCompatButton;

import org.json.JSONException;
import org.json.JSONObject;

public class Forgot_Password_Activity extends AppCompatActivity
{
    EditText etFrogotPasswordnName, etFrogotPasswordPassword, etFrogotPasswordnConfirmPassword;
    AppCompatButton acbtnFrogotPassword;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        etFrogotPasswordnName = findViewById(R.id.etFrogotPasswordnName);
        etFrogotPasswordPassword = findViewById(R.id.etFrogotPasswordPassword);
        etFrogotPasswordnConfirmPassword = findViewById(R.id.etFrogotPasswordnConfirmPassword);

        acbtnFrogotPassword = findViewById(R.id.acbtnFrogotPassword);

        acbtnFrogotPassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (etFrogotPasswordnName.getText().toString().isEmpty())
                {
                    etFrogotPasswordnName.setError(" Please Enter user Username");
                }
                else if (etFrogotPasswordnName.getText().toString().length() < 8)
                {
                    etFrogotPasswordnName.setError("username must be greater than 8 character");
                }
                else if (etFrogotPasswordPassword.getText().toString().isEmpty())
                {
                    etFrogotPasswordPassword.setError(" Please Enter user Password");
                }
                else if (etFrogotPasswordPassword.getText().toString().length() < 8)
                {
                    etFrogotPasswordPassword.setError("password must be greater than 8 character");
                }
                else if (!etFrogotPasswordPassword.getText().toString().equals(etFrogotPasswordnConfirmPassword.getText().toString()))
                {
                    etFrogotPasswordnConfirmPassword.setError(" confirm and password are not match");

                }
                else
                {
                    progressDialog=new ProgressDialog(Forgot_Password_Activity.this);
                    progressDialog.setTitle("Forget Password");
                    progressDialog.setMessage(" Please Wait ");
                    progressDialog.show();
                }
            }
        });
    }


}

