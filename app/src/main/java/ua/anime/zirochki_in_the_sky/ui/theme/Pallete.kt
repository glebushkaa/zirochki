package com.mcpe.mods.theme.locals

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import ua.anime.zirochki_in_the_sky.ui.theme.DarkBlue90
import ua.anime.zirochki_in_the_sky.ui.theme.LightGreen
import ua.anime.zirochki_in_the_sky.ui.theme.Orange
import ua.anime.zirochki_in_the_sky.ui.theme.Red
import ua.anime.zirochki_in_the_sky.ui.theme.TextGray

/**
 * Created by gle.bushkaa email(gleb.mokryy@gmail.com) on 8/24/2023
 */

data class Palette(
    val primary: Color = DarkBlue90,
    val onPrimary: Color = Color.White,
    val secondary: Color = Orange,
    val onSecondary: Color = Color.White,
    val tertiary: Color = Color.White,
    val onTertiary: Color = Color.White,
    val background: Color = Color.White,
    val backgroundVariant: Color = LightGray,
    val onBackground: Color = Color.Black,
    val surface: Color = Color.White,
    val onSurface: Color = Color.Black,
    val error: Color = Red,
    val onError: Color = Color.White,
    val textLink: Color = LightGreen,
    val outline: Color = TextGray,
)

val lightPalette = Palette(
    primary = DarkBlue90,
    onPrimary = Color.White,
    secondary = Orange,
    onSecondary = Color.White,
    tertiary = Color.White,
    onTertiary = Color.White,
    background = Color.White,
    backgroundVariant = LightGray,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Color.Black,
    error = Red,
    onError = Color.White,
    textLink = LightGreen,
    outline = TextGray,
)
