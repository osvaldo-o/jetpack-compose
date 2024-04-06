package ico.hellocompose.codelabs.google.starwars.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Character(@StringRes val name: Int, @StringRes val description: Int, @DrawableRes val image: Int)
