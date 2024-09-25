package com.hrod.appriada.presentation.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hrod.appriada.ui.theme.Primary
import com.hrod.appriada.ui.theme.Secondary
import com.hrod.appriada.ui.theme.Tertiary

@Composable
fun WelcomeScreen() {
        Column(modifier = Modifier.fillMaxSize()) {

        HeaderBox()
        ContentBox()
        }
}

@Composable
fun ColumnScope.HeaderBox (){
    Box(modifier = Modifier
        .fillMaxWidth()
        .weight(1f), Alignment.Center){
        Column  (modifier = Modifier.fillMaxWidth()) {
            Text(modifier = Modifier.fillMaxWidth(), text = "Riada", textAlign = TextAlign.Center, fontSize = 35.sp,
                fontWeight = FontWeight.Bold, color = Primary
            )
            Text(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp), text = "Bienvenido", textAlign = TextAlign.Center, color = Secondary)
        }
    }
}

@Composable
fun ColumnScope.ContentBox (){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Tertiary)
        .weight(1f),
        contentAlignment = Alignment.BottomCenter
    ){
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Primary
            ),
            modifier = Modifier.padding(bottom = 80.dp)
        ) {
            Text(text = "Empezar", fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(name = "welcomeView", showSystemUi = true)
@Composable
fun WelComeScreenPreview(){
    WelcomeScreen()
}
