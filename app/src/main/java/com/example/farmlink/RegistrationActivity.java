package com.example.farmlink;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationActivity extends AppCompatActivity {

    EditText etRegistrationName, etRegistrationMobileNo, etRegistrationEmail, etRegistrationUserIdentity,
            etRegistrationPassword, etRegistrationConfirmPassword;
    CheckBox cbcheckTerms;
    AppCompatButton acbtnRegistrationRegister;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etRegistrationName = findViewById(R.id.etRegistrationName);
        etRegistrationMobileNo = findViewById(R.id.etRegistrationMobileNo);
        etRegistrationEmail = findViewById(R.id.etRegistrationEmail);
        etRegistrationUserIdentity = findViewById(R.id.etRegistrationUserIdentity);
        etRegistrationPassword = findViewById(R.id.etRegistrationPassword);
        etRegistrationConfirmPassword = findViewById(R.id.etRegistrationConfirmPassword);
        cbcheckTerms = findViewById(R.id.cbcheckTerms);
        acbtnRegistrationRegister = findViewById(R.id.acbtnRegistrationRegister);

        acbtnRegistrationRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etRegistrationName.getText().toString().isEmpty())
                {
                    etRegistrationName.setError(" Please enter your name. ");
                }

                else if(!Character.isUpperCase(etRegistrationName.getText().toString().charAt(0)))
                {
                    etRegistrationName.setError(" First letter must be capital. ");
                }

                else if(etRegistrationMobileNo.getText().toString().isEmpty())
                {
                    etRegistrationMobileNo.setError(" Please enter your phone number. ");
                }

                else if(etRegistrationMobileNo.getText().toString().length() != 10)
                {
                    etRegistrationMobileNo.setError(" Phone number have 10 character. ");
                }

                else if (etRegistrationEmail.getText().toString().isEmpty())
                {
                    etRegistrationEmail.setError(" Please enter your E-mail. ");
                }

                else if(!etRegistrationEmail.getText().toString().contains("@")
                        || !etRegistrationEmail.getText().toString().contains("gmail.com"))
                {
                    etRegistrationEmail.setError(" Please enter valid E-mail. ");
                }

                else if (etRegistrationUserIdentity.getText().toString().trim().equalsIgnoreCase("Farmer"))
                {
                    etRegistrationUserIdentity.setError("Please enter correct identity Farmer or Customer.");
                }

                else if (etRegistrationUserIdentity.getText().toString().trim().equalsIgnoreCase("Customer"))
                {
                    etRegistrationUserIdentity.setError("Please enter correct identity Farmer or Customer.");
                }

                else if(etRegistrationPassword.getText().toString().isEmpty())
                {
                    etRegistrationPassword.setError("Please Enter Your Password");
                }

                else if(etRegistrationPassword.getText().toString().length()<8)
                {
                    etRegistrationPassword.setError("username must be greater than 8 character");
                }

                else if(!etRegistrationPassword.getText().toString().matches(".*[A-Z].*"))
                {
                    etRegistrationPassword.setError("Password Contain At Least One UpperCase Letter");
                }

                else if(!etRegistrationPassword.getText().toString().matches(".*[a-z].*"))
                {
                    etRegistrationPassword.setError("Password Contain At Least One Lowercase Letter");
                }

                else if(!etRegistrationPassword.getText().toString().matches(".*[0-9].*"))
                {
                    etRegistrationPassword.setError("Password Contain At Least One Number");
                }

                else if(!etRegistrationPassword.getText().toString().matches(".*[@#$%^&+=!].*"))
                {
                    etRegistrationPassword.setError("Password Contain At Least One Special Symbol");
                }

                else if(etRegistrationConfirmPassword.getText().toString().isEmpty())
                {
                    etRegistrationConfirmPassword.setError("Please Confirm Your Password ");
                }

                else if(!etRegistrationConfirmPassword.getText().toString().equals(etRegistrationPassword.getText().toString()))
                {
                    etRegistrationConfirmPassword.setError("Password and Confirm Password Not matches");
                }

                else
                {

                }
            }
        });
    }
}