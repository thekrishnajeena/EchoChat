package com.krishnajeena.echochat.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.krishnajeena.echochat.R

@Preview(showBackground = true)
@Composable
fun AuthScreen(modifier: Modifier = Modifier) {

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween){

        Text("Welcome\n to EchoChat",
            fontSize = 30.sp,
            modifier = Modifier.padding(10.dp)
            )

        Card (modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.CenterHorizontally)
            .padding(5.dp)){

            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(2.dp)) {
                Text(text = "Sign in with Email")
            }

            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(top = 0.dp)
                .padding(2.dp)) {
                Text(text = "Continue with Google")
            }

        }


    }
}

@Preview(showBackground = true)
@Composable
fun EmailSignIn(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()){

        Column(modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Image(painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "EchoChat Icon")
            Text("Sign In with Email")
            OutlinedTextField(value = "", onValueChange = {}, label = { Text("Your Email") },
                modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp))
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()
                .padding(top = 10.dp, start = 10.dp, end = 10.dp, bottom = 0.dp)) {
                Text("Continue")
            }
            Button(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(top = 0.dp)
                .padding(10.dp)) {
                Text("Continue with Google")
            }

        }

    }
}