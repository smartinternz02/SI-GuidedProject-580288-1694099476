package com.yash.foodapp629285898953yash

import android.widget.Toast
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(30.dp), horizontalAlignment = Alignment.CenterHorizontally


        ) {
            Image(
                painter = painterResource(id = R.drawable.login),
                contentDescription = "Login Image",
                modifier = Modifier.padding(top = 50.dp)
            )
            Text(
                text = "Chwiggy",
                fontSize = 40.sp,
                letterSpacing = 7.sp,
                fontWeight = FontWeight(800),
                fontFamily = FontFamily.SansSerif,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom =60.dp)
            )

            Text(
                text = "Login to proceed",
                fontSize = 20.sp,
                letterSpacing = 4.sp,
                fontWeight = FontWeight(800),
                fontFamily = FontFamily.Monospace,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom =10.dp)
            )

            outlinetextfeild1()
            Spacer(modifier =Modifier.height(6.dp))
            passwordinput()
            Button1(text = "Login",navController)
            Link2(text = "Sign Up",navController)


            googlebutton()





        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun outlinetextfeild1(){
    var text by remember { mutableStateOf("") }
    val context = LocalContext.current
    OutlinedTextField(
        value = text,
        onValueChange ={newText->
            text = newText
        },
//        enabled = false  ****************this property need to be used in case you want the user to do certain things to fill the box
        label = { Text(text = "Email")},
//        maxLines = 1,   ***********if we have log of text lets say in some address how many lines our box can expand
        leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
            }
        },
        trailingIcon = {
            IconButton(onClick = {
                Toast.makeText(context,"Enter Your Email", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Info, contentDescription = "Info")
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Next), //IME action is the action that tells of type the button that needs to be visible at bottom right of the keyboard
        keyboardActions = KeyboardActions(onNext ={
//            specify the work here
        })
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun passwordinput(){
    var password by remember{ mutableStateOf("") }
    var passwordvisibility by remember{ mutableStateOf(false) }
    var icon=if(passwordvisibility) {
        painterResource(id = R.drawable.visibility)
    }else painterResource(id = R.drawable.removed)

    OutlinedTextField(
        value = password,
        onValueChange = { newPassword ->
            password = newPassword
        },
//        placeholder = { Text(text = "Password")},
        label = { Text(text = "Password")},
        leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Password")},
        trailingIcon = {
            IconButton(onClick = {
                passwordvisibility=!passwordvisibility
            }) {
                Icon(painter = icon,
                    contentDescription ="Visibility Icon", modifier = Modifier
                        .height(27.dp)
                        .width(27.dp))
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Next),
        visualTransformation = if(passwordvisibility) VisualTransformation.None
        else PasswordVisualTransformation()

    )
}


@Composable
fun Button1(text:String,navController: NavController) {
        Button(onClick = {navController.navigate(route = Screen.Hotel.route)},
            modifier = Modifier
                .padding(top = 10.dp)
                .padding(start = 50.dp)
                .padding(end = 50.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(0.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF002729),
                contentColor = Color.LightGray

            ),
            contentPadding = PaddingValues(vertical = 5.dp)
        ) {
            Text(text = text)
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun googlebutton(
    text:String = "Sign Up with Google",
    loadingText:String="Creating Account..."
){
    var clicked by remember { mutableStateOf(false) }
    Surface(
        onClick ={ clicked=!clicked },
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        color = MaterialTheme.colorScheme.surface,
        modifier = Modifier.padding(top = 15.dp)
    ) {
        Row(modifier = Modifier
            .padding(start = 12.dp, end = 16.dp, top = 12.dp, bottom = 12.dp)
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ), //this is for smooth expansion of button
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = R.drawable.google),
                contentDescription ="google Button",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .padding(end = 10.dp),
                tint = Color.Unspecified
            )
            Text(text = if(clicked){loadingText} else{text}, modifier = Modifier.padding(end = 5.dp))
            if(clicked){
                CircularProgressIndicator(
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp),
                    strokeWidth = 2.dp,
                    color = Color.Green
                )
            }
        }

    }
}



@Composable
fun Link2(text:String,navController: NavController) {
    Button(onClick = {navController.navigate(route = Screen.Signup.route)},
        modifier = Modifier
            .padding(top = 10.dp)
            .padding(start = 50.dp)
            .padding(end = 50.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(0.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF002729),
            contentColor = Color.LightGray

        ),
        contentPadding = PaddingValues(vertical = 5.dp)
    ) {
        Row {
            Text(text = "Create New Account  ")
            Text(text = text, modifier = Modifier, color = Color.Blue)
        }
        
    }
}