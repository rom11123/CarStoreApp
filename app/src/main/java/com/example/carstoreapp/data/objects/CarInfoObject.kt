package com.example.carstoreapp.data.objects

import com.example.carstoreapp.R
import com.example.carstoreapp.data.CarInformationData
import com.example.carstoreapp.data.enams.Firm

object CarInfoObject {
    val cars = mutableListOf<CarInformationData>(
        CarInformationData(R.drawable.mercedeseclass,Firm.MERCEDES,"e class"),
        CarInformationData(R.drawable.mercedesgclass,Firm.MERCEDES,"g class"),
        CarInformationData(R.drawable.mercedes,Firm.MERCEDES,"gt63"),
        CarInformationData(R.drawable.mercedes,Firm.MERCEDES,"gt63"),
        CarInformationData(R.drawable.mercedes,Firm.MERCEDES,"gt63"),
        CarInformationData(R.drawable.mercedes,Firm.MERCEDES,"gt63"),
        CarInformationData(R.drawable.mercedes,Firm.MERCEDES,"gt63"),
        CarInformationData(R.drawable.bmwe,Firm.BMW,"e60"),
        CarInformationData(R.drawable.bmwseven,Firm.BMW,"7 series"),
        CarInformationData(R.drawable.bmwseven,Firm.BMW,"7 series"),
        CarInformationData(R.drawable.bmwseven,Firm.BMW,"7 series"),
        CarInformationData(R.drawable.bmwx,Firm.BMW,"x series"),
        CarInformationData(R.drawable.toyotacamry,Firm.TOYOTA,"Camry"),
        CarInformationData(R.drawable.toyotaelectrocar,Firm.TOYOTA,"electro"),
        CarInformationData(R.drawable.toyotaelectrocar,Firm.TOYOTA,"electro"),
        CarInformationData(R.drawable.toyotaelectrocar,Firm.TOYOTA,"electro"),
        CarInformationData(R.drawable.toyotaprado,Firm.TOYOTA,"Prado"),
    )
}