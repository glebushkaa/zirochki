package ua.anime.zirochki_in_the_sky.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ua.anime.zirochki_in_the_sky.ui.navigation.destination.homeScreenDestination
import ua.anime.zirochki_in_the_sky.ui.navigation.destination.splashScreenDestination
import ua.anime.zirochki_in_the_sky.ui.navigation.routes.HomeScreenRoute
import ua.anime.zirochki_in_the_sky.ui.navigation.routes.SplashScreenRoute

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 8/26/2023
 */

@Composable
fun ModsNavHost(
    modifier: Modifier = Modifier,
    controller: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = controller,
        startDestination = SplashScreenRoute.route,
    ) {
        splashScreenDestination {
            controller.navigate(HomeScreenRoute.route)
        }
        homeScreenDestination()
    }
}
