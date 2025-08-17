package com.cristhiandev.store_app.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HorizontalSpacer(space: Dp) {
    Spacer(modifier = Modifier.padding(horizontal = space))
}
@Composable
fun VerticalSpacer(space: Dp) {
    Spacer(modifier = Modifier.padding(vertical = space))
}
@Composable
fun MyHorizontalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: Color = Color.Gray
) {
    HorizontalDivider(
        modifier = modifier,
        thickness = thickness,
        color = color
    )
}

@Composable
fun LoginButton(modifier: Modifier, action: () -> Unit, txt: String) {
    Button(
        modifier = modifier,
        onClick = { action() }) {
        Text(text = txt, textAlign = TextAlign.Center, fontSize = 24.sp)
    }
}