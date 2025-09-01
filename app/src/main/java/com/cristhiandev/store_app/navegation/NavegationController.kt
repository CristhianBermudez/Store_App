package com.cristhiandev.store_app.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cristhiandev.store_app.home.ui.HomeScreen
import com.cristhiandev.store_app.login.ui.LoginScreen
import com.cristhiandev.store_app.register.ui.RegisterScreen

@Composable
fun NavigationController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen(
                navigationRegister = { navController.navigate(Register) },
                navigationHome = { navController.navigate(Home) }
            )
        }
        composable<Register> {
            RegisterScreen()
        }
        composable<Home> {
            HomeScreen()
        }
    }
}