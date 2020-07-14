package com.rohyme.navigation.entranceScreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.rohyme.navigation.R
import com.rohyme.navigation.utils.setupWithNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        if (savedInstanceState == null){
            Log.e("home","${intent.data}")
            setUpBottomFragment()
        }
    }



    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setUpBottomFragment()
    }


    private var currentNavController: LiveData<NavController>? = null

    private fun setUpBottomFragment() {
        val navGraphsId = listOf(
            R.navigation.navgraph_home,
            R.navigation.navgraph_messages,
            R.navigation.navgraph_add_friend,
            R.navigation.navgraph_star,
            R.navigation.navgraph_friends
        )
        val controller = bottomNav.setupWithNavController(
            navGraphIds = navGraphsId,
            fragmentManager = supportFragmentManager,
            containerId = R.id.multipleFlowsHolder,
            intent = intent)
        controller.observe(this, Observer {navController ->
             setupActionBarWithNavController(navController)
        })
        currentNavController = controller
    }
    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }

}
