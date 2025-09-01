package com.cristhiandev.store_app.login.ui

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

/**
 * Pantalla de inicio de sesión de la aplicación.
 *
 * Esta función composable configura la estructura básica de la pantalla de login.
 * Utiliza un [Scaffold], que es un layout de Material Design que proporciona una estructura
 * para elementos comunes como barras de aplicación, cajones de navegación y botones de acción flotantes.
 * El contenido principal de la pantalla se muestra a través de [BodyScreen], al que se le pasan
 * los valores de padding proporcionados por el Scaffold para asegurar que el contenido no se solape
 * con otros elementos de la interfaz de usuario como la barra de estado o la barra de navegación.
 */
@Composable
fun LoginScreen(
    navigationRegister: () -> Unit,
    navigationHome: () -> Unit
) {
    Scaffold { paddingValues ->
        BodyScreen(paddingValues, navigationRegister, navigationHome)
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
    navigationRegister: () -> Unit,
    navigationHome: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxWidth()
    ) {
        LoginTop()
        Spacer(modifier = Modifier.padding(16.dp))
        LoginBody(navigationRegister, navigationHome)
    }
}

/**
 * Muestra la sección superior de la pantalla de inicio de sesión.
 *
 * Esta función composable es responsable de mostrar el título principal
 * "Iniciar Sesión". El texto está centrado, tiene un tamaño de fuente grande
 * y un padding específico.
 */
@Composable
private fun LoginTop() {
    Text(
        text = "Iniciar Sesión",
        modifier = Modifier
            .padding(vertical = 80.dp)
            .fillMaxWidth(),
        fontSize = 64.sp,
        textAlign = TextAlign.Center
    )
}

/**
 * Muestra el cuerpo principal del formulario de inicio de sesión.
 *
 * Esta función composable contiene los campos de entrada para el correo electrónico
 * y la contraseña, utilizando [OutlinedTextField]. También incluye enlaces de texto
 * para "¿Olvidaste tu contraseña?" y "Regístrate". El [Column] está configurado
 * para ocupar el 80% del ancho disponible de su contenedor padre.
 */
@Composable
private fun LoginBody(navigationRegister: () -> Unit, navigationHome: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
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
        Button(onClick = {
            navigationHome()
        }) {
            Text(text = "Iniciar Sesión", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.padding(8.dp))
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "¿Has olvidado tu contraseña?", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.padding(64.dp))
        OutlinedButton(
            onClick = { navigationRegister() }
        ) {
            Text(text = "Crear Cuenta nueva", fontSize = 18.sp)
        }
    }
}
