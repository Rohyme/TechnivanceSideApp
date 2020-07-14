package com.rohyme.navigation.homecontainer.starScreen

import android.os.Bundle
import android.util.Log
import android.view.View
import com.rohyme.navigation.homecontainer.BaseFragment

/**
 * Created by rohyme on 7/14/20.
 **/
class StarScreen5  : BaseFragment() {
    override var fragmentName: String = "star Screen 5"
    override var navigationId: Int? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("hereWEARE",arguments.toString())
        arguments?.getString("catTitle")?.let { Log.e("starScreen5",it) }
        arguments?.getInt("parentCategory")?.let { Log.e("starScreen5",it.toString()) }
    }
}