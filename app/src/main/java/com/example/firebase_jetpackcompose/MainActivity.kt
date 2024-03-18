package com.example.firebase_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.firebase_jetpackcompose.ui.theme.FirebaseJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseJetpackComposeTheme {
                Login()
            }
        }
    }
}

@Composable
fun Login(){

}

