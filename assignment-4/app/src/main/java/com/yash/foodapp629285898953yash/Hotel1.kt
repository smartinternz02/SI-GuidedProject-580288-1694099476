package com.yash.foodapp629285898953yash



import androidx.compose.foundation.Image
import androidx.compose.foundation.border

import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


data class Dish(
    val id: Int,
    val name: String,
    val imageResId: Int,
    val price: Double,
    val discountedPrice: Double
)

@Composable
fun Hotel1Screen(navController: NavController) {
    val dishes = remember {

        listOf(
            Dish(1, "Paneer Butter Masala", R.drawable.buttermasala, 299.00, 450.00),
            Dish(2, "Butter Naan", R.drawable.naan, 45.00, 70.00),
            Dish(3, "Plain Rice", R.drawable.rice, 98.00, 125.00),
            Dish(3, "Plain Kofte", R.drawable.kofta, 180.00, 250.00),

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

@Composable
fun DishCard(dish: Dish) {


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.medium)
            .clickable { /* Handle click on the dish card */ }
            .shadow(elevation = 8.dp, shape = RoundedCornerShape(16.dp))



    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        ) {
            Image(
                painter = painterResource(id = dish.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = dish.name,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "₹${dish.price}", style = TextStyle(fontWeight = FontWeight.Bold))
                Text(
                    text = "₹${dish.discountedPrice}",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.LineThrough,
                        color = Color.Gray
                    )
                )
                Row {
                    Text(text = "Add to cart", style = TextStyle(fontWeight = FontWeight.Bold), modifier = Modifier
                        .padding(top = 2.dp)
                        .padding(end = 4.dp))
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier
                            .size(24.dp)
                            )
                }


            }
        }
    }
}

