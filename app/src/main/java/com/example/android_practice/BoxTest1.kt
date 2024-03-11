package com.example.android_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class BoxTest1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxExample0()


            /*
            BoxTest1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }*/
        }
    }
}


@Composable
fun BoxExample0() {  // 좌상단 블루박스
    Box(
        modifier = Modifier
            .background(color = Color.Blue)
            .size(150.dp, 200.dp)
    )
}

@Composable
fun FullScrean(){  // 전체화면 색칠
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Red)){

    }
}

@Composable
fun DividScreen(){
    Surface()
    {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red),
            horizontalAlignment = Alignment.CenterHorizontally)  // 중앙정렬
        {
            Box(modifier = Modifier
                .width(100.dp)
                .background(color = Color.Gray))
            {
                Text(text = "Gray Box")
            }

            Box(modifier = Modifier
                .width(80.dp)
                .weight(0.3f) //높이
                .background(color = Color.Cyan))
            {
                Text(text = "Cyan Box")
            }

            Text(text = "Yellow Box",
                modifier = Modifier
                    .weight(0.5f) //높이
                    .background(color = Color.Yellow)
            )

            Text(text = "Green Box",
                modifier = Modifier
                    .weight(1f) //높이
                    .background(color = Color.Green))

            Box(modifier = Modifier
                .width(80.dp)
                .weight(0.5f) //높이
                .background(color = Color.Cyan))
            {
                Text(text = "Cyan Box")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FullScrean()
    BoxExample0()
    DividScreen()
}