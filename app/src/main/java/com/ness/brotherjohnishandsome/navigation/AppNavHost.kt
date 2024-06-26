package com.ness.brotherjohnishandsome.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME){
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUTE_HOME){
            Homescreen(navController)
        }
        composable(ROUTE_ABOUT){
            Aboutscreen(navController)
        }

        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }


    }







        )









}






)