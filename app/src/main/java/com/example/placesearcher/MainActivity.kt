package com.example.placesearcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.placesearcher.graphs.RootNavigationGraph
import com.example.placesearcher.ui.theme.PlaceSearcherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaceSearcherTheme {

                RootNavigationGraph(navController = rememberNavController())

            }

        }
    }
}
