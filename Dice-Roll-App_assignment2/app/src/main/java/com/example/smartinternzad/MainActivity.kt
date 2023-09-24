package com.example.smartinternzad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.smartinternzad.ui.theme.SmartInternzADTheme
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private lateinit var resultTextView: TextView;
    private lateinit var rollButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        resultTextView=findViewById(R.id.resultTextView3)
        rollButton=findViewById(R.id.rollButton)
        rollButton.setOnClickListener{
            rollDice()
        }

    }
    private fun rollDice(){
        var random = Random(234);
        print(random)
        var randomNumber = random.nextInt(6)+1
        val resultText = "You rolled a $randomNumber"
        resultTextView.text=resultText
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SmartInternzADTheme {
        Greeting("Android")
    }
}