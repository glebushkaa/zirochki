package ua.anime.zirochki_in_the_sky.ui.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ua.anime.zirochki_in_the_sky.ui.navigation.routes.HomeScreenRoute
import ua.anime.zirochki_in_the_sky.ui.screens.MainScreen

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 8/29/2023
 */

fun NavGraphBuilder.homeScreenDestination(
) {
    composable(route = HomeScreenRoute.route) {
        MainScreen()
    }
}
