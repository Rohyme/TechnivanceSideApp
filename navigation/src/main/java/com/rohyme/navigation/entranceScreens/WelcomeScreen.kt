package com.rohyme.navigation.entranceScreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.rohyme.navigation.R
import kotlinx.android.synthetic.main.fragment_welcome.view.*

class WelcomeScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome,container,false).apply {
            textView2.setOnClickListener {
                findNavController().navigate(R.id.action_welcomeScreen2_to_homeScreen)
            }
        }
    }
}