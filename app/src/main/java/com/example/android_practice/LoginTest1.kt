package com.example.android_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginTest1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // 컨텐츠 출력 부분
        }
    }
}

@Composable
fun DividScreen2(){
    Surface()
    {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red),
            horizontalAlignment = Alignment.CenterHorizontally)  // 중앙정렬
        {
            Box(modifier = Modifier
                .weight(0.3f)//높이
            )

            Text(text = "알찬 쇼핑",
                fontSize = 60.sp,
                modifier = Modifier
                    //.weight(0.5f) //높이
                    .background(color = Color.Yellow)
            )

            Text(text = "Green Box",
                modifier = Modifier
                    .weight(1f) //높이
                    .background(color = Color.Green)
            )

            Box(modifier = Modifier
                .width(80.dp)
                .weight(0.5f) //높이
                .background(color = Color.Cyan)
            ) {
                Text(text = "Cyan Box")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    // 프리뷰 부분
    DividScreen2()
}