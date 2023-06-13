package com.example.proyectofinalalfa02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button entrar = findViewById(R.id.loguear);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int var = 0;
                EditText usuario = findViewById(R.id.usuario);
                EditText contraseña = findViewById(R.id.contrasena);

                String nombreUsuario = usuario.getText().toString().trim();
                String contraseñaUsuario = contraseña.getText().toString().trim();


                if (nombreUsuario.isEmpty() || contraseñaUsuario.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Especifica el usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else if ((nombreUsuario.equals("20202225")) && (contraseñaUsuario.equals("admin"))) {
                    usuario.setText("");
                    contraseña.setText("");
                    Toast.makeText(LoginActivity.this, "Logueo Exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
