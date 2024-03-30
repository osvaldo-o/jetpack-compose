package ico.hellocompose.codelabs.google.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourced: Int,@DrawableRes val imageResourceId: Int)
