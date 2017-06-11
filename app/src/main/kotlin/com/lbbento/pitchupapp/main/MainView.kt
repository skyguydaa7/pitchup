package com.lbbento.pitchupapp.main

import com.lbbento.pitchupapp.ui.BaseView

interface MainView : BaseView {
    fun setupGauge()
    fun updateNote(note: String)
    fun updateToDefaultStatus()
    fun updateIndicator(diffInCents: Float)
    fun getCurrentNote(): String
    fun informError()
    fun updateCurrentFrequency(currentFreq: Float)
}