package com.example.carstoreapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.carstoreapp.R
import com.example.carstoreapp.base.BaseFragment
import com.example.carstoreapp.data.CarInformationData

private const val ARG_PARAM = "param1"


class CarDetailsFragment : BaseFragment() {
    private var toolbar: Toolbar? = null
    private var detailsFirm: TextView? = null
    private var detailsModel: TextView? = null
    private var detailsImage: ImageView? = null
    private var infoText:TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? = inflater.inflate(R.layout.fragment_car_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar = view.findViewById(R.id.toolbar_details)
        detailsFirm = view.findViewById(R.id.details_firm)
        detailsModel = view.findViewById(R.id.details_model)
        detailsImage = view.findViewById(R.id.details_image_car)
        infoText = view.findViewById(R.id.details_info_text)

        val carInformationData:CarInformationData = arguments?.getSerializable(ARG_PARAM)as CarInformationData
        detailsFirm?.text = carInformationData.firm.name
        detailsModel?.text = carInformationData.model
        detailsImage?.setImageResource(carInformationData.image)
        when(carInformationData.firm.name){
            "MERCEDES"-> infoText?.text =" Mercedes is good car"
            "BMW"-> infoText?.text = "Bmw is good car"
            "TOYOTA"-> infoText?.text = "Toyota is good car"
        }
        setToolbar()
    }

    private fun setToolbar(){
       toolbar?.setNavigationOnClickListener {
           parentFragmentManager.popBackStack()
       }
    }


    companion object {

        @JvmStatic
        fun newInstance(carInformation:CarInformationData) =
            CarDetailsFragment().apply {
                arguments = Bundle().apply {
                  putSerializable(ARG_PARAM,carInformation)

                }
            }
    }
}