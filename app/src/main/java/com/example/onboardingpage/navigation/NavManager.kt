package com.example.onboardingpage.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onboardingpage.onBoardViews.MainOnBoarding
import com.example.onboardingpage.views.HomeView

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "onBoarding",){
        composable("onBoarding"){
            MainOnBoarding()
        }
        composable("Home"){
            HomeView()
        }
    }
}