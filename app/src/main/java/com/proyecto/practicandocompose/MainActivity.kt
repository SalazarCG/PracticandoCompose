package com.proyecto.practicandocompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.proyecto.practicandocompose.ui.theme.PracticandoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            kotlin()
            Log.d("TAG", "Esto es una prueba")
        }
    }
}


@Composable
fun kotlin() {

    val numero = 2
    Column {
        when (numero) {

            1 -> Text(text = "El resultado es 1")
            2 -> Text(text = "El resultado es 2")
            3 -> Text(text = "El resultado es 3")
            4 -> Text(text = "El resultado es 4")
            else -> println("El resultado es inválido")
        }

    }
}


@Composable
fun Greeting() {

    Row(modifier = Modifier.padding(20.dp)) {

        Box(modifier = Modifier.fillMaxWidth()) {

            Column {

                Divider(Modifier.background(Color(0xFF030303)))



                Divider(Modifier.background(Color(0xFF030303)))

            }
        }
    }
}

@Composable
fun prueba1(){
    println("Prueba 1 de Git")
}

@Composable
fun pruebaGit1(){
    println("Git1")
}

