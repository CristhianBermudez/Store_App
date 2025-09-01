package com.cristhiandev.store_app.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cristhiandev.store_app.login.ui.LoginScreen

@Composable
fun NavigationController(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login){
        composable<Login>{
            LoginScreen()
        }
    }
}