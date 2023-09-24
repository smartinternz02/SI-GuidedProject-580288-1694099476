package com.yash.foodapp629285898953yash

sealed class Screen(val route:String){
    object Login:Screen(route = "login_screen")
    object Signup:Screen(route = "signup_screen")
    object Hotel:Screen(route = "hotel_screen")
    object Hotel1:Screen(route = "hotel1_screen")
    object Hotel2:Screen(route = "hotel2_screen")
    object Hotel3:Screen(route = "hotel3_screen")

//    object List:Screen(route = "list_screen")
}
