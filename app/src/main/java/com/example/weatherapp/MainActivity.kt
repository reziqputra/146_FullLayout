package com.example.weatherapp

import android.media.Image
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*



import androidx.compose.foundation.layout.R

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "Weather App",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
            fontSize = 30.sp,
            lineHeight = 50.sp,
        )

        Spacer(modifier = Modifier.height(13.dp))

        BoxPict()

        Spacer(modifier = Modifier.height(13.dp))

        Lokasi()

        Spacer(modifier = Modifier.height(13.dp))

        BoxBottom()
    }
}

@Composable
fun BoxPict() {
    val img = painterResource(
        id = com.example.weatherapp.R.drawable.img_111
    )

    Box(
        modifier = Modifier
            .clip(
                RoundedCornerShape(20.dp)
            )
            .background(color = Color.LightGray)
            .padding(13.dp)
            .size(350.dp)

    ) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Image(painter = img, contentDescription = null, modifier = Modifier.size(250.dp))

            Row(modifier = Modifier .align(CenterHorizontally)) {
                Text(text = "Rain", textAlign = TextAlign.Center,fontWeight = FontWeight.Bold, fontSize = 20.sp, )
            }
        }
    }
}

@Composable
fun Lokasi(){
    Text(text = "19ºC", fontWeight = FontWeight.Bold, fontSize = 50.sp,)
    Row{
        Image(painter = painterResource(id = com.example.weatherapp.R.drawable.ic_baseline_location_on_24), contentDescription = "", modifier = Modifier.size(35.dp))
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Yogyakarta", fontSize = 30.sp, fontWeight = FontWeight.Bold)
    }
    Spacer(modifier = Modifier.padding(3.dp))
    Text(text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta", fontSize = 10.sp, textAlign = TextAlign.Center, color = Color.Gray)
}


@Composable
fun BoxBottom(){
    Box(contentAlignment = Center,
        modifier = Modifier
            .clip(
                RoundedCornerShape(20.dp)
            )
            .background(color = Color.LightGray)
            .padding(13.dp)
            .size(350.dp)
            .fillMaxWidth()

    ){
        Column {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround,modifier = Modifier.fillMaxWidth().padding(15.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Humidity", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                    Text(text = "98%", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "UV Index", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                    Text(text = "9/10", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround,modifier = Modifier.fillMaxWidth().padding(15.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Sunrise", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                    Text(text = "05.00 AM", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Sunset", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                    Text(text = "05,40 PM", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }




        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherAppTheme {

    }
}