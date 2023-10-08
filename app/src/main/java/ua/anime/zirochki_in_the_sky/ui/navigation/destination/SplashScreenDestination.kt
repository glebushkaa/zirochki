package ua.anime.zirochki_in_the_sky.ui.navigation.destination

import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.coroutines.delay
import ua.anime.zirochki_in_the_sky.ui.navigation.routes.SplashScreenRoute
import ua.anime.zirochki_in_the_sky.ui.screens.SplashScreen

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 8/26/2023
 */

fun NavGraphBuilder.splashScreenDestination(
    homeNavigate: () -> Unit = {},
) {
    composable(route = SplashScreenRoute.route) {
        SplashScreen()

        LaunchedEffect(key1 = Unit) {
            delay(1000)
            homeNavigate()
        }
    }
}
