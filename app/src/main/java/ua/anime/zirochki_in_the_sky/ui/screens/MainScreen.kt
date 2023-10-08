package ua.anime.zirochki_in_the_sky.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.anime.zirochki_in_the_sky.R
import ua.anime.zirochki_in_the_sky.ui.extension.clickableWithoutRipple
import ua.anime.zirochki_in_the_sky.ui.theme.ZirochkiIntTheStars

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 10/7/2023.
 */

@Composable
fun MainScreen() {
    MainScreenContent()
}

@Composable
private fun MainScreenContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ZirochkiIntTheStars.palette.primary),
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = ZirochkiIntTheStars.offset.average
                ),
            text = "Eclipses: Perspective is Everything",
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 32.sp
        )

        Row(
            modifier = Modifier.align(Alignment.Center),
            horizontalArrangement = Arrangement.spacedBy(
                ZirochkiIntTheStars.offset.average
            )
        ) {
            Image(
                modifier = Modifier
                    .height(120.dp)
                    .clickableWithoutRipple { },
                painter = painterResource(id = R.drawable.ic_splash_eclipse),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
            Image(
                modifier = Modifier
                    .height(120.dp)
                    .clickableWithoutRipple {},
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.ic_eclipse_moon),
                contentDescription = null
            )
        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreenContent()
}