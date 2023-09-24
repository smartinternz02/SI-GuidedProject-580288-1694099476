package com.yash.foodapp629285898953yash

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController =navController,
        startDestination = Screen.Hotel.route)
    {
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.Signup.route
        ){
            SignupScreen(navController=navController)
        }
        composable(
            route = Screen.Hotel.route
        ){
            HotelScreen(navController=navController)
        }
        composable(
            route = Screen.Hotel1.route
        ){
            Hotel1Screen(navController=navController)
        }
        composable(
            route = Screen.Hotel2.route
        ){
            Hotel2Screen(navController = navController)
        }
        composable(
            route = Screen.Hotel3.route
        ){
            Hotel3Screen(navController=navController)
        }
    }
}