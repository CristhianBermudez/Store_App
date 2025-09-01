package com.cristhiandev.store_app.register.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen(

) {
    Scaffold { paddingValues ->
        BodyScreen(paddingValues)
    }
}

/**
 * Contenido principal de la pantalla de inicio de sesión.
 *
 * Esta función composable toma [PaddingValues] para aplicar el espaciado correcto
 * y evitar que el contenido se solape con elementos de la interfaz de usuario
 * gestionados por el [Scaffold] (como barras de aplicación o de sistema).
 * Actualmente, muestra un texto simple "Login".
 *
 * @param paddingValues Los valores de padding proporcionados por el Scaffold.
 */
@Composable
private fun BodyScreen(
    paddingValues: PaddingValues,
) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxWidth()
    ) {
        RegisterTop()
        Spacer(modifier = Modifier.padding(16.dp))
        RegisterBody()
    }
}

@Composable
private fun RegisterTop() {
    Text(
        text = "Registro",
        modifier = Modifier
            .padding(vertical = 80.dp)
            .fillMaxWidth(),
        fontSize = 64.sp,
        textAlign = TextAlign.Center
    )
}


@Composable
private fun RegisterBody() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Nombre", fontSize = 18.sp) },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Correo", fontSize = 18.sp) },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Contraseña", fontSize = 18.sp) },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Repetir Contraseña", fontSize = 18.sp) },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Button(onClick = {

        }) {
            Text(text = "Crear Cuenta", fontSize = 18.sp)
        }
    }
}
