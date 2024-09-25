package com.hrod.appriada.examples

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hrod.appriada.R

import com.hrod.appriada.ui.theme.AppRiadaTheme

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        contentAlignment = Alignment.Center
        ){
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.compose_header)
                , contentDescription = "Compose header",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp))

            Row () {
                Image(painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "avatar perrito",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                Text(text = "Bienvenidos Al Curso de Jetpack Compose",
                    textAlign = TextAlign.Center, style = TextStyle(
                        fontSize = 18.sp, color = Color.Black
                    ))

            }

            Row (modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth() ) {
                Text(text = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.",
                     style = TextStyle(
                        fontSize = 14.sp, color = Color.Black, fontStyle = FontStyle.Italic
                    ))
            }

            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                Button(onClick = { /*TODO*/ }) {

                    Icon( imageVector = Icons.Filled.FavoriteBorder, contentDescription = "fav")
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "Empezar")

                }
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                HorizontalDivider(
                    modifier = Modifier.width(24.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )

                Text(
                    text = "Encuentranos en nuestras redes sociales",
                    modifier = Modifier.padding(5.dp),
                    style = TextStyle(
                        fontSize = 12.sp
                    )
                )

                HorizontalDivider(
                    modifier = Modifier.width(24.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )
            }
        }


    }
}

@Preview(name = "welcome", showSystemUi = true)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    AppRiadaTheme {
        WelcomeScreen()
    }

}