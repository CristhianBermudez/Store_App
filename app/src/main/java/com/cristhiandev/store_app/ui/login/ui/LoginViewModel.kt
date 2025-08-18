package com.cristhiandev.store_app.ui.login.ui

import androidx.lifecycle.ViewModel
import com.cristhiandev.store_app.ui.login.data.LoginUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel: ViewModel(){
    private val _uiState = MutableStateFlow(LoginUiState())
    var uiState: StateFlow<LoginUiState> = _uiState

}