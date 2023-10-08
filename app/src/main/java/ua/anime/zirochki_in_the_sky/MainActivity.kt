package ua.anime.zirochki_in_the_sky

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import ua.anime.zirochki_in_the_sky.ui.navigation.ModsNavHost
import ua.anime.zirochki_in_the_sky.ui.screens.SplashScreen
import ua.anime.zirochki_in_the_sky.ui.theme.ZirochkiIntTheStars

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZirochkiIntTheStars {
                val navController = rememberNavController()
                ModsNavHost(
                    modifier = Modifier
                        .fillMaxSize(),
                    controller = navController,
                )
            }
        }
    }
}