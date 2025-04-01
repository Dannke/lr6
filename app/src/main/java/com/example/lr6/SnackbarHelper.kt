package com.example.lr6

import android.content.Context
import android.view.ViewGroup
import androidx.core.view.updateLayoutParams
import com.google.android.material.snackbar.Snackbar

object SnackbarHelper {
    fun configSnackbar(context: Context, snackbar: Snackbar) {
        addMargins(snackbar)
        setRoundBordersBg(context, snackbar)
        snackbar.view.elevation = 6f
    }

    private fun addMargins(snackbar: Snackbar) {
        snackbar.view.updateLayoutParams<ViewGroup.MarginLayoutParams> {
            setMargins(12, 12, 12, 12)
        }
    }

    private fun setRoundBordersBg(context: Context, snackbar: Snackbar) {
        snackbar.view.background = context.getDrawable(R.drawable.bg_snackbar)
    }
}
