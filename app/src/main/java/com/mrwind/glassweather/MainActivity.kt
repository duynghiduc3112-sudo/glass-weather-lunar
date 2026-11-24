
package com.mrwind.glassweather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GlassWeatherApp()
        }
    }
}

@Composable
fun GlassWeatherApp() {

    val backgroundColor = Color(0xFF101318)
    val cardColor = Color(0xFF222831)
    val accentColor = Color(0xFF38BDF8)

    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = accentColor,
            background = backgroundColor,
            surface = cardColor
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = backgroundColor
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(22.dp),
                horizontalAlignment = Alignment.Start
            ) {

                Text(
                    text = "THỜI TIẾT & ÂM LỊCH",
                    color = Color.White,
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Chào mừng bạn đến với Mr.Wind",
                    color = Color.LightGray,
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.height(30.dp))

                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    color = cardColor
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {

                        Text(
                            text = "DỰ BÁO THỜI TIẾT",
                            color = accentColor,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(18.dp))

                        Text(
                            text = "--°C",
                            color = Color.White,
                            fontSize = 48.sp,
                            fontWeight = FontWeight.Light
                        )

                        Text(
                            text = "Đang chờ dữ liệu thời tiết",
                            color = Color.LightGray,
                            fontSize = 14.sp
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Địa điểm: Chưa thiết lập",
                                color = Color.White,
                                fontSize = 12.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    color = cardColor
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Text(
                            text = "LỊCH DƯƠNG & ÂM",
                            color = accentColor,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = "Ngày tháng năm",
                            color = Color.White,
                            fontSize = 19.sp,
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = "Thông tin âm lịch sẽ được cập nhật",
                            color = Color.LightGray,
                            fontSize = 13.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = "by Mr.Wind",
                    modifier = Modifier.align(Alignment.End),
                    color = accentColor,
                    fontSize = 12.sp
                )
            }
        }
    }
}
