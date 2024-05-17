package com.example.ets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.ets.ui.theme.ETSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting()
        }
    }

}

@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF00FF7F)), // Set background color to light green
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp)) // Add space at the top

            // MyITS Mahasiswa text
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text(
                    text = "MyITS",
                    color = Color.Black, // Set the text color
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Mahasiswa",
                    color = Color.Black, // Set the text color
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(8.dp)) // Add space between "MyITS Mahasiswa" and the user icon

            // User icon
            Image(
                painter = painterResource(id = R.drawable.foto), // Replace with your drawable resource
                contentDescription = "User Icon",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .clip(CircleShape)
                    .background(Color.White) // Optional: background color for the icon
                    .padding(8.dp)
            )

            Spacer(modifier = Modifier.height(16.dp)) // Add space between the icon and the input fields

            // Input field for username
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Username") },
                modifier = Modifier.padding(16.dp)
            )

            // Input field for password
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Password") },
                modifier = Modifier.padding(16.dp)
            )

            // Login button
            Button(
                onClick = { /* Handle login */ },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Login")
            }
        }
    }
}


@Composable
fun Greeting() {
    ETSTheme {
        LoginPage()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting()
}
