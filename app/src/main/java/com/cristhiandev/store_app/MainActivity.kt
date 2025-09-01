package com.cristhiandev.store_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.cristhiandev.store_app.navegation.NavigationController
import com.cristhiandev.store_app.ui.theme.Store_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Store_AppTheme {
                NavigationController()
            }
        }
    }
}
