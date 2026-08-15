package com.example.farmlink;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class GoogleActivity extends AppCompatActivity {

    ImageView ivgoogle;
    EditText etGoogleEmail, etpassword;
    CheckBox cbGoogleShowHidePassword;
    AppCompatButton acbtnSignin;
    TextView tvCreateAccount;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        ivgoogle = findViewById(R.id.ivgoogle);
        cbGoogleShowHidePassword = findViewById(R.id.cbGoogleShowHidePassword);
        acbtnSignin = findViewById(R.id.acbtnGoogleSignin);
        etGoogleEmail = findViewById(R.id.etGoogleEmail);
        etpassword = findViewById(R.id.etGooglePassword);
        tvCreateAccount = findViewById(R.id.tvGoogleCreateAccount);

        cbGoogleShowHidePassword.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                etpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                etpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            // Move cursor to end
            etpassword.setSelection(etpassword.getText().length());
        });

        acbtnSignin.setOnClickListener(v -> {
            String email = etGoogleEmail.getText().toString();
            String password = etpassword.getText().toString();

            if (email.isEmpty()) {
                etGoogleEmail.setError("Enter your Email Id");
            } else if (!email.contains("@") || email.length() < 5) {
                etGoogleEmail.setError("Please enter valid EmailId");
            } else if (password.isEmpty()) {
                etpassword.setError("Enter your Password");
            } else if (!password.matches(".*[A-Z].*")) {
                etpassword.setError("Atleast one upper case letter must have");
            } else if (!password.matches(".*[a-z].*")) {
                etpassword.setError("Atleast one lower case letter must have");
            } else if (!password.matches(".*[!@#$%^&*].*")) {
                etpassword.setError("Atleast one special symbol must have");
            } else {
                progressDialog = new ProgressDialog(GoogleActivity.this);
                progressDialog.setTitle("Login");
                progressDialog.setMessage("Please Wait");
                progressDialog.setCanceledOnTouchOutside(true);
                progressDialog.show();

                SignUpWithGoogle();
            }
        });

    }

    private void SignUpWithGoogle() {
        // Implementation for Google Sign Up
        Toast.makeText(this, "Signing in...", Toast.LENGTH_SHORT).show();
        // Dismiss dialog after some logic
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
