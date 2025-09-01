package com.cristhiandev.store_app.login.data

data class LoginUiState(
    val email:String="",
    val password:String="",
    val isLoading:Boolean=false,
    val isLoginEnable:Boolean=false
)