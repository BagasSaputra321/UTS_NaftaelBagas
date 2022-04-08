package com.NaftaelBagas.Affirmation_App.Model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Afirmasi(
    @StringRes val stringResourcesId: Int,
    @DrawableRes val imageResourcesId: Int) {}