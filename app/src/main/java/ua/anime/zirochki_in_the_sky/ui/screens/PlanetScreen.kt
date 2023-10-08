package ua.anime.zirochki_in_the_sky.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.anime.zirochki_in_the_sky.R
import ua.anime.zirochki_in_the_sky.ui.theme.ZirochkiIntTheStars

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 10/7/2023.
 */

@Composable
fun PlanetScreen() {
    PlanetScreenContent()
}

@Composable
private fun PlanetScreenContent() {
    var firstPlanetX = remember { mutableFloatStateOf(0f) }
    var secondPlanetX = remember { mutableFloatStateOf(0f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                ZirochkiIntTheStars.palette.primary
            )
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(ZirochkiIntTheStars.palette.secondary),
            text = "Shapka",
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Сонячне затемнення - Астрономічне явище, коли Місяць повністю або частково закриває Сонце. Це явище виникає тільки на деякий час та спостерігати за ним можна тільки з певного куточку земного шару."
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Image(
                modifier = Modifier.align(Alignment.CenterEnd),
                painter = painterResource(id = R.drawable.ic_moon),
                contentDescription = null
            )
            Image(
                modifier = Modifier,
                painter = painterResource(id = R.drawable.ic_earth),
                contentDescription = null
            )
        }
    }

}

@Preview
@Composable
private fun PlanetScreenPreview() {
    PlanetScreenContent()
}