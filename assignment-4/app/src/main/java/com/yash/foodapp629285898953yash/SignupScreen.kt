package com.yash.foodapp629285898953yash

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun SignupScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize().background(Color.Black),
        border = BorderStroke(0.dp, Color.Black)
    ) { Image(painter = painterResource(id = R.drawable.signupbgdark23), contentDescription = "login", modifier = Modifier.fillMaxSize().padding(bottom = 21.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()

                .padding(top = 20.dp),




        ) {
            Image(
                painter = painterResource(id = R.drawable.discount),
                contentDescription = "Login Image",
                modifier = Modifier.padding(top = 0.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            text1(label = "Signup to Grab the offer", size = 25, mycolor =Color(0xFFc40000), modify = Modifier.padding(start = 40.dp) )
            Spacer(modifier = Modifier.height(50.dp))
            text2(label = "Create an Account", size = 20, mycolor =Color.DarkGray, modify = Modifier.padding(start = 90.dp) )
            Spacer(modifier = Modifier.height(30.dp))
            outlinetextfeild_person(text11 = "Username")
            Spacer(modifier = Modifier.height(10.dp))
            outlinetextfeild_email(text11 = "Email")
            Spacer(modifier = Modifier.height(10.dp))
            passwordinput(labelpass = "Enter Password")
            Spacer(modifier = Modifier.height(10.dp))
            passwordinput(labelpass = "Confirm Password")
            Spacer(modifier = Modifier.height(10.dp))
            Buttonsignup(text = "Signup",navController)
            LinkSignup(text = "Signin",navController)
            
            



        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun outlinetextfeild_person(text11:String){
    var text by remember { mutableStateOf("") }
    val context = LocalContext.current
    OutlinedTextField(
        value = text,
        onValueChange ={newText->
            text = newText
        },
        modifier = Modifier.padding(start = 67.dp),
//        enabled = false  ****************this property need to be used in case you want the user to do certain things to fill the box
        label = { Text(text = text11)},
//        maxLines = 1,   ***********if we have log of text lets say in some address how many lines our box can expand
        leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Email")
            }
        },
        trailingIcon = {
            IconButton(onClick = {
                Toast.makeText(context,"Enter any Username", Toast.LENGTH_SHORT).show()
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
fun outlinetextfeild_email(text11:String){
    var text by remember { mutableStateOf("") }
    val context = LocalContext.current
    OutlinedTextField(
        value = text,
        onValueChange ={newText->
            text = newText
        },
        modifier = Modifier.padding(start = 67.dp),
//        enabled = false  ****************this property need to be used in case you want the user to do certain things to fill the box
        label = { Text(text = text11)},
//        maxLines = 1,   ***********if we have log of text lets say in some address how many lines our box can expand
        leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
            }
        },
        trailingIcon = {
            IconButton(onClick = {
                Toast.makeText(context,"Enter Your Email", Toast.LENGTH_LONG).show()
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





@Composable
fun text1(label:String,size:Int,mycolor:Color,modify:Modifier){

    Text(text = label,
        fontSize = size.sp,
        letterSpacing = 2.sp,
        fontWeight = FontWeight(800),
        fontFamily = FontFamily.SansSerif,
        color = mycolor,
        modifier = modify )

}

@Composable
fun text2(label:String,size:Int,mycolor:Color,modify:Modifier){

    Text(text = label,
        fontSize = size.sp,
        letterSpacing = 4.sp,
        fontWeight = FontWeight(800),
        fontFamily = FontFamily.SansSerif,
        color = mycolor,
        modifier = modify )

}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun passwordinput(labelpass:String){
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
        modifier = Modifier.padding(start = 67.dp),
//        placeholder = { Text(text = "Password")},
        label = { Text(text = labelpass)},
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
fun Buttonsignup(text:String,navController: NavController) {
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


@Composable
fun LinkSignup(text:String,navController: NavController) {
    Button(onClick = {navController.navigate(route = Screen.Login.route){
        popUpTo(Screen.Login.route){inclusive=true}}},
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
            Text(text = "Already have an account?  ")
            Text(text = text, modifier = Modifier, color = Color.Blue)
        }

    }
}

