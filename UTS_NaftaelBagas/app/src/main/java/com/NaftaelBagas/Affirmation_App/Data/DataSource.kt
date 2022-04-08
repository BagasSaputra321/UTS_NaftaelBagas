package com.NaftaelBagas.Affirmation_App.Data

import com.NaftaelBagas.Affirmation_App.Model.Afirmasi
import com.NaftaelBagas.affirmation_app.R

class DataSource {
    fun loadAfirmasi(): List<Afirmasi>{
        return listOf<Afirmasi>(
            Afirmasi(R.string.Kalimat1, R.drawable.Exhaust),
            Afirmasi(R.string.Kalimat2, R.drawable.Brake),
            Afirmasi(R.string.Kalimat3, R.drawable.BackLamp),
            Afirmasi(R.string.Kalimat4, R.drawable.RearLamp),
            Afirmasi(R.string.Kalimat5, R.drawable.RearMirror),
            Afirmasi(R.string.Kalimat6, R.drawable.Seat),
            Afirmasi(R.string.Kalimat7, R.drawable.Tire),
            Afirmasi(R.string.Kalimat8, R.drawable.WindShield),
            Afirmasi(R.string.Kalimat9, R.drawable.ShockBreaker),
            Afirmasi(R.string.Kalimat10, R.drawable.UpsidedownShock)
        )
    }
}