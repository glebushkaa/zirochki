package ua.anime.zirochki_in_the_sky.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.anime.zirochki_in_the_sky.R
import ua.anime.zirochki_in_the_sky.ui.theme.ZirochkiIntTheStars

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 10/7/2023.
 */

@Composable
fun SplashScreen() {
    SplashScreenContent()
}

@Composable
private fun SplashScreenContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ZirochkiIntTheStars.palette.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(
                    ZirochkiIntTheStars.offset.large
                ),
            painter = painterResource(id = R.drawable.ic_splash_eclipse),
            contentDescription = null
        )
        Text(
            text = "Eclipses",
            fontSize = 32.sp,
        )
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreenContent()
}