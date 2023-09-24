package com.yash.foodapp629285898953yash

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Hotel3Screen(navController: NavController) {
    val dishes = remember {

        listOf(
            Dish(1, "Chole Kulche", R.drawable.buttermasala, 299.00, 450.00),
            Dish(2, "Chole Bhature", R.drawable.naan, 45.00, 70.00),
            Dish(3, "Paneer Noodles", R.drawable.rice, 98.00, 125.00),
            Dish(3, "Fried Rice", R.drawable.kofta, 180.00, 250.00),

            )

    }

    LazyColumn(
        modifier = Modifier
            .padding(20.dp)
    ) {
        items(dishes) { dish ->
            DishCard(dish)
            Spacer(modifier = Modifier.height(16.dp))
        }

    }
}

