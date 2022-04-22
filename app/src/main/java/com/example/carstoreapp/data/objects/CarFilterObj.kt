package com.example.carstoreapp.data.objects

import com.example.carstoreapp.R
import com.example.carstoreapp.data.CarFilter
import com.example.carstoreapp.data.enams.Firm

object CarFilterObj {
    val carFilterObjects = mutableListOf<CarFilter>(
        CarFilter(R.drawable.mercedesznak,Firm.MERCEDES),
        CarFilter(R.drawable.bmwznak,Firm.BMW),
        CarFilter(R.drawable.toyotaznak,Firm.TOYOTA),

    )
}