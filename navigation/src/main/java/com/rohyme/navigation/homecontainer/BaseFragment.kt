package com.rohyme.navigation.homecontainer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.rohyme.navigation.R
import kotlinx.android.synthetic.main.text_layout.view.*

/**
 * Created by rohyme on 7/14/20.
 **/

abstract class BaseFragment  : Fragment(){
    abstract var fragmentName : String
    abstract var navigationId : Int?
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.text_layout,container,false).apply {
            textView4.text = fragmentName
            textView4.setOnClickListener {
                navigationId?.let { findNavController().navigate(it) }
            }
        }
    }
}