package xyz.tasikcode.tasikcodeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        val navController = this.findNavController(R.id.navHostFragmentMain)
        NavigationUI.setupWithNavController(navBottomMain, navController)
    }
}
