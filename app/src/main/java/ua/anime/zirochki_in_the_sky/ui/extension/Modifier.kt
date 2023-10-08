package ua.anime.zirochki_in_the_sky.ui.extension

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.ui.Modifier

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 10/7/2023.
 */

fun Modifier.clickableWithoutRipple(
    click: () -> Unit
): Modifier {
    return this@clickableWithoutRipple.clickable(
        indication = null,
        interactionSource = MutableInteractionSource(),
        onClick = click
    )
}