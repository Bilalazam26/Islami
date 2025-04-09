package com.bilalazzam.islami.features.quran_feature.presentation.model

data class AyahUI(
    val numberInSorah: Int,
    val text: String,
    val juz: Int,
    val page: Int,
    val sajdah: Boolean
)
