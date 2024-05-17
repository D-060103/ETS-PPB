package com.example.jadwal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jadwal.ui.theme.JadwalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JadwalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JadwalKuliahMahasiswa(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun JadwalKuliahMahasiswa(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF00FF7F)) // Set background color to the specified color
            .padding(16.dp)
    ) {
        // Title
        Text(
            text = "Jadwal Kuliah Mahasiswa",
            fontWeight = FontWeight.ExtraBold,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        // Divider
        Divider(
            color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .align(Alignment.CenterHorizontally)
        )

        // Semester
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = "Semester X",
                color = Color(0xFF00FF7F), // Set text color
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.ExtraBold
            )
        }

        // Days of the week
        Column(
            modifier = Modifier.padding(top = 16.dp)
        ) {
            for (day in listOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu")) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                        .padding(16.dp)
                        .padding(vertical = 8.dp)
                        .padding(bottom = 8.dp) // Add space between boxes
                ) {
                    Text(
                        text = day,
                        color = Color(0xFF00FF7F), // Set text color
                        fontWeight = FontWeight.ExtraBold,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JadwalKuliahMahasiswaPreview() {
    JadwalTheme {
        JadwalKuliahMahasiswa()
    }
}
