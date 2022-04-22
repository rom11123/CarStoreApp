package com.example.carstoreapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.example.carstoreapp.R
import com.example.carstoreapp.adapters.CarFilterAdapter
import com.example.carstoreapp.adapters.CarInformationAdapter
import com.example.carstoreapp.base.BaseFragment
import com.example.carstoreapp.data.objects.CarFilterObj
import com.example.carstoreapp.data.objects.CarInfoObject

class CarInformationFragment : BaseFragment() {
    private var toolbar: Toolbar? = null
    private val carFilterAdapter = CarFilterAdapter { item ->
        carInformationAdapter.update(CarInfoObject.cars.filter { it.firm == item.firm })

    }

    private val carInformationAdapter = CarInformationAdapter {
        addFragment(CarDetailsFragment.newInstance(it))

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        carInformationAdapter.update(CarInfoObject.cars)
        carFilterAdapter.update(CarFilterObj.carFilterObjects)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? = inflater.inflate(R.layout.fragment_car_information, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<RecyclerView>(R.id.vertikal_recycler).apply {
            adapter = carInformationAdapter
        }

        view.findViewById<RecyclerView>(R.id.horizontal_Recycler).apply {
            adapter = carFilterAdapter

        }
        toolbar = view.findViewById<Toolbar>(R.id.toolbar)
        setupListeners()

    }

    private fun setupListeners() {
        toolbar?.setNavigationOnClickListener {
            carInformationAdapter.update(CarInfoObject.cars)

        }


    }
}


