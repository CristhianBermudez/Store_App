package com.cristhiandev.store_app.ui.components.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cristhiandev.store_app.ui.login.iu.LoginScreen

/**
 * Función composable que define el controlador de navegación para la aplicación.
 * Configura el NavHost y define el gráfico de navegación.
 *
 * El destino inicial es [LoginScreen].
 *
 */
@Composable
fun NavigationController(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login>{
            LoginScreen()
        }
    }
}
