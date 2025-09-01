package com.cristhiandev.store_app.ui.register.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen() {
    Scaffold { paddingValues ->
        BodyScreen(paddingValues)
    }
}

@Composable
fun BodyScreen(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Top()
        Body()
    }
}

@Composable
fun Top() {
    Text(
        text = "Registrate",
        modifier = Modifier
            .fillMaxWidth(),
        maxLines = 1,
        textAlign = TextAlign.Center,
        fontSize = 64.sp
    )
}

@Composable
fun Body() {
    Column(
        modifier = Modifier
            .fillMaxWidth(0.8f)
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Nombre") },
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Correo") },
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Repetir Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
        }
    }
}