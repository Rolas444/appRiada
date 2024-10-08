package com.hrod.appriada.presentation.on_boarding

import androidx.annotation.DrawableRes
import com.hrod.appriada.R

sealed class OnBoardingPage(
    @DrawableRes
    val image:Int,
    val title:String,
    val description:String
){
    object  First : OnBoardingPage (
        image = R.drawable.avatar,
        title = "Page 1",
        description = "Lorem ipsum dejsd sjdsj xskxla"
    )

    object  Second : OnBoardingPage (
        image = R.drawable.avatar,
        title = "Page 2",
        description = "Lorem ipsum dejsd sjdsj xskxla"
    )

    object  third : OnBoardingPage (
        image = R.drawable.avatar,
        title = "Page 3",
        description = "Lorem ipsum dejsd sjdsj xskxla"
    )
}