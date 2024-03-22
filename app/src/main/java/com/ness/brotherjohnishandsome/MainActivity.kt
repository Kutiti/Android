package com.ness.kundroid2

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ness.brotherjohnishandsome.ui.theme.BrotherJOHNishandsomeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrotherJOHNishandsomeTheme {

            }
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //   Greeting("Android")
                    login()
                }
            }
        }
    }


@Composable
fun login() {
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}


    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp))

    {
        Text(text = "eMobilis",
            //color = Color.RED,
            fontSize =30.sp,
            fontFamily = FontFamily.Cursive
        )
        OutlinedTextField(
            value = email ,
            onValueChange = {email=it},
            label = { Text(text = "Email Address")},
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
        OutlinedTextField(
            value = password ,
            onValueChange = {password=it},
            label = { Text(text = "Enter Password") },
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )

        Button(onClick = {/*TODO*/ },modifier = Modifier.fillMaxWidth()){
            Text(text = "login", fontSize = 22.sp)
        }



    }
}
@Preview
@Composable
private fun loginprev(){
    login()
}