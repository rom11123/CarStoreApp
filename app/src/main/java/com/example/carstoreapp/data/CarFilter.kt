package com.example.carstoreapp.data

import com.example.carstoreapp.data.enams.Firm
import java.io.Serializable

data class CarFilter(
    val imageView:Int,
    val firm:Firm
):Serializable
