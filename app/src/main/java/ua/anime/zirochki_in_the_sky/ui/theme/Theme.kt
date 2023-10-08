package ua.anime.zirochki_in_the_sky.ui.theme

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 8/26/2023
 */

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.mcpe.mods.theme.locals.Elevation
import com.mcpe.mods.theme.locals.Offset
import com.mcpe.mods.theme.locals.Palette
import com.mcpe.mods.theme.locals.Shape
import com.mcpe.mods.theme.locals.Stroke
import com.mcpe.mods.theme.locals.lightPalette

val LocalPalette = staticCompositionLocalOf { Palette() }
val LocalOffset = staticCompositionLocalOf { Offset() }
val LocalShape = staticCompositionLocalOf { Shape() }
val LocalStroke = staticCompositionLocalOf { Stroke() }
val LocalElevation = staticCompositionLocalOf { Elevation() }

@Composable
fun ZirochkiIntTheStars(
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalPalette provides lightPalette,
        content = content,
    )
}

object ZirochkiIntTheStars {

    val palette: Palette
        @Composable
        get() = LocalPalette.current

    val offset: Offset
        @Composable
        get() = LocalOffset.current

    val shape: Shape
        @Composable
        get() = LocalShape.current

    val elevation: Elevation
        @Composable
        get() = LocalElevation.current

    val stroke: Stroke
        @Composable
        get() = LocalStroke.current
}
