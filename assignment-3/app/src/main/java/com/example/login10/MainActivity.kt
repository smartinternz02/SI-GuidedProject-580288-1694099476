package com.example.login10

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login10.ui.theme.Login10Theme
import com.example.login10.ui.theme.Neon20
import com.example.login10.ui.theme.Purple40
import com.example.login10.ui.theme.PurpleGrey40
import com.example.login10.ui.theme.Yellow10


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login10Theme {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Imagetop()
                    Spacer(modifier = Modifier.height(16.dp))
                    Textbox()
                    Spacer(modifier = Modifier.height(6.dp))
                    Textbox11()
                    Spacer(modifier = Modifier.height(16.dp))
                    MyTextFeild(labelValue = stringResource(id = R.string.firstname))
                    Spacer(modifier = Modifier.height(16.dp))
                    MyTextFeild3(labelValue = stringResource(id = R.string.pass))
                    Spacer(modifier = Modifier.height(16.dp))
                    Textbox2()
                    Spacer(modifier = Modifier.height(6.dp))
                    SimpleButton1()
                    Spacer(modifier = Modifier.height(6.dp))
                    SimpleButton2()
                    Spacer(modifier = Modifier.height(6.dp))
                    SimpleButton3()




                }

            }
        }
    }
}

@Composable
fun Textbox() {
   Text(text = "Navigation Page" , style = MaterialTheme.typography.displayMedium.copy(color = Color(0xFF999999)))
}

@Composable
fun Textbox11() {
    Text(text = "Fill Your details to proceed" , style = MaterialTheme.typography.bodySmall.copy(color = Color(0xFF999999)))
}

@Composable
fun Textbox2() {
    Text(text = "Click any of below to proceed" ,
        color = Color(0xFF2cb1ff))
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFeild(labelValue:String){
    val textValue= remember{
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
        , // Set background color here
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Neon20,
            focusedLabelColor = Neon20,
            cursorColor = Neon20,

            ),
        keyboardOptions = KeyboardOptions.Default ,
        value =textValue.value,
        onValueChange ={
            textValue.value=it
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = null)
        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFeild3(labelValue:String){
    val password= remember{
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
        , // Set background color here
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Neon20,
            focusedLabelColor = Neon20,
            cursorColor = Neon20

            ),
        keyboardOptions = KeyboardOptions.Default,
        value =password.value,
        onValueChange ={
            password.value=it
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Lock, contentDescription = null)
        },
    )

}

@Composable
fun SimpleButton1() {
    val context = LocalContext.current

    Button(
        modifier = Modifier
            .padding(16.dp)
            .height(40.dp),
        onClick = {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.flipkart.com")

            try {
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
            }
        },
    ) {
        Row  (
            modifier=Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.flipkarty),
                contentDescription = "Flipkart Image",
                modifier = Modifier
                    .size(20.dp)
                    .padding(end = 3.dp)

            )
            Text(text = "Flipkart" , modifier = Modifier)
        }

    }
}
@Composable
fun SimpleButton2() {
    val context = LocalContext.current

    Button(
        modifier = Modifier
            .padding(16.dp)
            .height(40.dp),
        onClick = {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.amazon.com")

            try {
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
            }
        },
    ) {
        Row  (
            modifier=Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.amazon),
                contentDescription = "Amazon Image",
                modifier = Modifier
                    .size(20.dp)
                    .padding(end = 3.dp)

            )
            Text(text = "Amazon" , modifier = Modifier)
        }

    }
}
@Composable
fun SimpleButton3() {
    val context = LocalContext.current

    Button(
        modifier = Modifier
            .padding(16.dp)
            .height(40.dp),
        onClick = {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.snapdeal.com")

            try {
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
            }
        },
    ) {
        Row  (
            modifier=Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.snap),
                contentDescription = "Snapdeal Image",
                modifier = Modifier
                    .size(20.dp)
                    .padding(end = 3.dp)

            )
            Text(text = "Snapdeal" , modifier = Modifier)
        }

    }
}
@JvmOverloads
@Composable
fun Imagetop(
    modifier: Modifier = Modifier.size(100.dp, 100.dp)
) {
    Image(
        painter = painterResource(id = R.drawable.yash),
        contentDescription = "Login Image",
        modifier = modifier
    )
}



@Preview
@Composable
fun apppreview() {
        Login10Theme {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Textbox()
                Spacer(modifier = Modifier.height(16.dp))
                MyTextFeild(labelValue = stringResource(id = R.string.firstname))
                Spacer(modifier = Modifier.height(16.dp))
                MyTextFeild3(labelValue = stringResource(id = R.string.pass))
                Spacer(modifier = Modifier.height(16.dp))
                SimpleButton1()
                Spacer(modifier = Modifier.height(16.dp))
                Textbox2()


            }

        }
    }




