package com.hrod.appriada

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hrod.appriada.ui.theme.AppRiadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainComposable()
        }
    }
}

@Composable
fun MainComposable(modifier: Modifier = Modifier) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hellow Mundo"
        )
        Text(text = "Esta es mi segunda Linea")
    }
}

@Composable
fun RowsApp(modifier: Modifier = Modifier) {
    Row {
        Button(onClick = { /*TODO*/ }) {

        }

        Button(onClick = { /*TODO*/ }) {

        }
        Button(onClick = { /*TODO*/ }) {

        }
    }
}

@Preview(name = "my preview", showSystemUi = true)
@Composable
fun ComposablePreview(modifier: Modifier = Modifier) {
    MainComposable()
}