package com.example.timelytasteaseel;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button btnLogInMain,btnSignUpMain,btnAddResMAIN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConnectComponents();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.btnLogInMain, new LogInFragment());
        ft.commit();
        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.btnSignUpMain, new SignUpFragment());
        ft.commit();
        FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.btnAddResMAIN, new AddProductFragment());
        ft.commit();
    }
    public void ConnectComponents()
    {
        btnLogInMain=findViewById(R.id.btnLogInMain);
        btnSignUpMain=findViewById(R.id.btnSignUpMain);
        btnLogInMain=findViewById(R.id.btnAddResMAIN);

    }
}