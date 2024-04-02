package ico.hellocompose.codelabs.google.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(@StringRes val name: Int, val amount: Int, @DrawableRes val image: Int)
