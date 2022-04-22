package com.example.carstoreapp.data

import com.example.carstoreapp.data.enams.Firm
import java.io.Serializable

data class CarInformationData(
    val image:Int,
    val firm: Firm,
    val model:String,

    ):Serializable
