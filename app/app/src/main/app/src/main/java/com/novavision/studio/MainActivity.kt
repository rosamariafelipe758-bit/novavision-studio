
package com.novavision.studio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Background = Color(0xFF0B0B16)
private val Purple = Color(0xFF7545FF)
private val CardColor = Color(0xFF171729)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NovaVisionApp()
        }
    }
}

@Composable
fun NovaVisionApp() {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Purple,
            background = Background,
            surface = CardColor
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Background)
                .padding(22.dp)
        ) {
            Text(
                "NovaVision",
                color = Color.White,
                fontSize = 28.sp
            )

            Text(
                "STUDIO",
                color = Purple,
                fontSize = 13.sp
            )

            Spacer(Modifier.height(35.dp))

            Text(
                "Transforme suas ideias em realidade.",
                color = Color.White,
                fontSize = 25.sp
            )

            Spacer(Modifier.height(12.dp))

            Text(
                "Edição profissional no seu bolso.",
                color = Color.LightGray
            )

            Spacer(Modifier.height(30.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text("＋ Nova composição")
            }

            Spacer(Modifier.height(25.dp))

            Text(
                "SEUS PROJETOS",
                color = Color.White,
                fontSize = 18.sp
            )

            Spacer(Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        CardColor,
                        RoundedCornerShape(16.dp)
                    )
                    .padding(22.dp)
            ) {
                Text(
                    "Nenhum projeto ainda.\nCrie sua primeira composição!",
                    color = Color.LightGray
                )
            }

            Spacer(Modifier.height(25.dp))

            Text(
                "FERRAMENTAS",
                color = Color.White,
                fontSize = 18.sp
            )

            Spacer(Modifier.height(15.dp))

            Text(
                "✂  Editor de vídeo",
                color = Color.White
            )

            Spacer(Modifier.height(15.dp))

            Text(
                "✦  Laboratório de efeitos",
                color = Color.White
            )

            Spacer(Modifier.height(15.dp))

            Text(
                "▣  Biblioteca de presets",
                color = Color.White
            )

            Spacer(Modifier.weight(1f))

            Text(
                "NOVAVISION STUDIO • 0.1.0",
                color = Color.Gray,
                fontSize = 11.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}
