@file:OptIn(ExperimentalFoundationApi::class)

package com.hrod.appriada.presentation.on_boarding

import android.widget.Button
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen (){


    val pages = listOf(
        OnBoardingPage.First,
        OnBoardingPage.Second,
        OnBoardingPage.third
    )

    val pagerState = rememberPagerState( pageCount = { pages.count() })

    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {


        HorizontalPager(modifier = Modifier
            .weight(10f), state = pagerState) {

            indexPage-> PagerScreen(pages[indexPage])




        }

        Row (modifier = Modifier
            .fillMaxWidth()
            .weight(2f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,

            ){

            repeat(pages.count()){ iteration ->
                val color =  if(pagerState.currentPage == iteration) Color.Black else Color.Gray
                Box(modifier = Modifier
                    .padding(horizontal = 6.dp)
                    .clip(CircleShape)
                    .background(color)
                    .size(12.dp))
            }
        }

        FinishButton(pagerState = pagerState, lastPage = pages.count()-1)
    }
}

@Composable
fun PagerScreen(onBoardingPage: OnBoardingPage) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        //Text(text = "Pager")
        Column (modifier = Modifier.fillMaxWidth()) {

            Row  (modifier = Modifier
                .weight(10f)
                .background(Color.Green)){
            }

            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(3f)) {
                Text(text = onBoardingPage.title, modifier = Modifier.fillMaxWidth(),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp
                )

                Text(text = onBoardingPage.description, modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                )
            }

        }
    }
}

@Composable
fun FinishButton(
    modifier: Modifier = Modifier,
    pagerState: PagerState,
    lastPage : Int
){
    Row(
        modifier = Modifier.padding(horizontal = 40.dp)
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(modifier = Modifier.fillMaxWidth(), visible = pagerState.currentPage == lastPage  )
        {
            Button(onClick = {}){
                Text(text = "Finalizar")
            }
        }
    }

}


@Preview(name = "pagerPreview")
@Composable
fun pagerPreviewer(){
    OnBoardingScreen()
}