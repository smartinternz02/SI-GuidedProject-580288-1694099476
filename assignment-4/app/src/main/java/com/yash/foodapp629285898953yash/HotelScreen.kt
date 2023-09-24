package com.yash.foodapp629285898953yash

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HotelScreen(navController: NavController) {
    Column(){
        Surface(
            color = MaterialTheme.colorScheme.surface,
            shadowElevation = 5.dp,
            modifier = Modifier
                .padding(top = 0.dp)
                .fillMaxWidth()
                .background(Color(0xFFC32C57))
        ) {
            Row(modifier= Modifier
                .background(Color.White)
                .fillMaxWidth()
                , horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Row(verticalAlignment = Alignment.CenterVertically ) {
                    Image(painter = painterResource(id = R.drawable.login), contentDescription = ""
                        , modifier = Modifier
                            .height(60.dp)
                            .padding(8.dp)

                    )
                    Text(
                        text = "Chwiggy",
                        fontSize = 27.sp,
                        letterSpacing = 4.sp,
                        fontWeight = FontWeight(900),
                        fontFamily = FontFamily.Cursive,
                        color = Color.DarkGray,
                    )
                }


                Text(text = "Login",modifier= Modifier
                    .padding(end = 20.dp)
                    .clickable { navController.navigate(route = Screen.Login.route) }
                    , fontSize = 18.sp
                    , fontWeight = FontWeight(900)
                    , fontFamily = FontFamily.Monospace
                    ,color=Color.DarkGray

                )
            }
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 25.dp)
                .padding(end = 25.dp), verticalArrangement = Arrangement.SpaceEvenly
        ) {
            item{
            Surface(
                shape = RoundedCornerShape(15.dp),
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 5.dp,
                modifier = Modifier
                    .padding(top = 15.dp)
                    .background(Color(0xFFC32C57))
            ) {
                Row(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                        .clickable { navController.navigate(route = Screen.Hotel1.route) },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img2),
                        contentDescription = "google",
                        modifier = Modifier
                            .width(120.dp)
                            .border(2.dp, Color.Black)
                    )
                    Column(modifier = Modifier, verticalArrangement = Arrangement.Top) {
                        HeadingText(hotelname = "Sangam Eats")
                        Row {
                            Icon(
                                painter = painterResource(id = androidx.appcompat.R.drawable.abc_ic_star_black_16dp),
                                contentDescription = "",
                                modifier = Modifier.padding(3.dp)
                            )
                            RatingText(rating = "4.0 (5k+) . 32 mins")
                        }
                        Text(
                            text = "Aligang .4.5km",
                            modifier = Modifier.padding(3.dp),
                            color = Color.DarkGray
                        )
                    }
                }
            }


            //********************************************

            Surface(
                shape = RoundedCornerShape(15.dp),
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 5.dp,
                modifier = Modifier
                    .padding(top = 15.dp)
                    .background(Color(0xFFC32C57))
            ) {
                Row(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                        .clickable { navController.navigate(route = Screen.Hotel2.route) },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.res5),
                        contentDescription = "google",
                        modifier = Modifier
                            .width(120.dp)
                            .border(2.dp, Color.Black)
                    )
                    Column(modifier = Modifier, verticalArrangement = Arrangement.Top) {
                        HeadingText(hotelname = "Eat Good")
                        Row {
                            Icon(
                                painter = painterResource(id = androidx.appcompat.R.drawable.abc_ic_star_black_16dp),
                                contentDescription = "",
                                modifier = Modifier.padding(3.dp)
                            )
                            RatingText(rating = "4.6 (9k+) . 12 mins")
                        }
                        Text(
                            text = "Rohini .1.5km",
                            modifier = Modifier.padding(3.dp),
                            color = Color.DarkGray
                        )
                        Text(text = "45% off upto 100", modifier = Modifier, color = Color.Red, fontWeight = FontWeight(700))
                    }
                }
            }

            //********************************************

            Surface(
                shape = RoundedCornerShape(15.dp),
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 5.dp,
                modifier = Modifier
                    .padding(top = 15.dp)
                    .background(Color(0xFFC32C57))
            ) {
                Text(text = "Buy 1 and Get 1 absolutely free", modifier = Modifier
                    .padding(top = 190.dp)
                    .background(Color.Red)
                    .fillMaxWidth(), textAlign = TextAlign.Center, color = Color.LightGray, fontWeight = FontWeight(700),)
                Row(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                        .clickable { navController.navigate(route = Screen.Hotel3.route)},
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.res6),
                        contentDescription = "google",
                        modifier = Modifier
                            .width(120.dp)
                            .border(2.dp, Color.Black)
                    )
                    Column(modifier = Modifier, verticalArrangement = Arrangement.Top) {
                        HeadingText(hotelname = "Spicy Bite")
                        Row {
                            Icon(
                                painter = painterResource(id = androidx.appcompat.R.drawable.abc_ic_star_black_16dp),
                                contentDescription = "",
                                modifier = Modifier.padding(3.dp)
                            )
                            RatingText(rating = "4.8 (2k+) . 22 mins")
                        }
                        Text(
                            text = "Gomti Nagar .2.5km",
                            modifier = Modifier.padding(3.dp),
                            color = Color.DarkGray
                        )
                    }

                }

            }


            //********************************************

            Surface(
                shape = RoundedCornerShape(15.dp),
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 5.dp,
                modifier = Modifier
                    .padding(top = 15.dp)
                    .background(Color(0xFFC32C57))
            ) {
                Text(text = "Closed", modifier = Modifier
                    .padding(top = 175.dp)
                    .fillMaxWidth(), textAlign = TextAlign.Center, color = Color.DarkGray, fontWeight = FontWeight(700), fontSize = 30.sp, letterSpacing = 8.sp)
                Row(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .clickable {
                            //**********************Navigation Event Here*********************
                        },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.res7),
                        contentDescription = "google",
                        modifier = Modifier
                            .width(120.dp)
                            .border(2.dp, Color.Black)
                    )
                    Column(modifier = Modifier, verticalArrangement = Arrangement.Top) {
                        HeadingText(hotelname = "Chat Vala")
                        Row {
                            Icon(
                                painter = painterResource(id = androidx.appcompat.R.drawable.abc_ic_star_black_16dp),
                                contentDescription = "",
                                modifier = Modifier.padding(3.dp)
                            )
                            RatingText(rating = "4.2 (8k+) . 28 mins")
                        }
                        Text(
                            text = "Aligang .4.7km",
                            modifier = Modifier.padding(3.dp),
                            color = Color.DarkGray
                        )
                    }
                }
            }

            //********************************************

            Surface(
                shape = RoundedCornerShape(15.dp),
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 5.dp,
                modifier = Modifier
                    .padding(top = 15.dp)
                    .background(Color(0xFFC32C57))
            ) {
                Row(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                        .clickable {
                            //**********************Navigation Event Here*********************
                        },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img2),
                        contentDescription = "google",
                        modifier = Modifier
                            .width(120.dp)
                            .border(2.dp, Color.Black)
                    )
                    Column(modifier = Modifier, verticalArrangement = Arrangement.Top) {
                        HeadingText(hotelname = "Sangam Eats")
                        Row {
                            Icon(
                                painter = painterResource(id = androidx.appcompat.R.drawable.abc_ic_star_black_16dp),
                                contentDescription = "",
                                modifier = Modifier.padding(3.dp)
                            )
                            RatingText(rating = "4.0 (5k+) . 32 mins")
                        }
                        Text(
                            text = "Aligang .4.5km",
                            modifier = Modifier.padding(3.dp),
                            color = Color.DarkGray
                        )
                    }
                }
            }

        }
    }
}
}


@Composable
fun HeadingText(hotelname:String){
    Text(text =hotelname,
        modifier = Modifier,
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif
        )
}

@Composable
fun RatingText(rating:String){
    Text(text = rating,
        modifier = Modifier.padding(1.dp),
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif
        )
}

