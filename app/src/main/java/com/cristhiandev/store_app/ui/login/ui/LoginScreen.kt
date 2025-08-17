package com.cristhiandev.store_app.ui.login.iu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.cristhiandev.store_app.ui.components.HorizontalSpacer
import com.cristhiandev.store_app.ui.components.LoginButton
import com.cristhiandev.store_app.ui.components.MyHorizontalDivider
import com.cristhiandev.store_app.ui.components.VerticalSpacer

@Composable
fun LoginScreen() {
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
        MsgP()
        VerticalSpacer(40.dp)
        BodyText()
    }
}

@Composable
fun MsgP() {
    Text(
        text = "Bienvenido",
        modifier = Modifier
            .fillMaxWidth(),
        maxLines = 1,
        textAlign = TextAlign.Center,
        fontSize = 64.sp
    )
}

@Composable
fun BodyText() {
    Column(
        modifier = Modifier
            .fillMaxWidth(0.8f)
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Correo") },
            modifier = Modifier
                .fillMaxWidth()
        )
        VerticalSpacer(10.dp)
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            TextButton(onClick = { /*TODO*/ }
            ) {
                Text(
                    "¿Olvidaste tu contraseña?",
                    textAlign = TextAlign.Right,
                    fontSize = 12.sp
                )
            }
        }
        VerticalSpacer(5.dp)
        LoginButton(
            modifier = Modifier
                .fillMaxWidth(.5f)
                .align(Alignment.CenterHorizontally),
            action = {},
            txt = "Iniciar Sesión"
        )
        VerticalSpacer(10.dp)
        Row(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            LoginButton(
                modifier = Modifier
                    .fillMaxWidth(.5f),
                action = {},
                txt = "Google"
            )
            HorizontalSpacer(10.dp)
            LoginButton(
                modifier = Modifier
                    .fillMaxWidth(),
                action = {},
                txt = "Otro"
            )
        }
        MyHorizontalDivider(modifier = Modifier.padding(vertical = 15.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            TextButton(
                onClick = { /*TODO*/ }
            ) {
                Text(
                    "¿No tienes una cuenta?",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                )
            }
        }
    }
}