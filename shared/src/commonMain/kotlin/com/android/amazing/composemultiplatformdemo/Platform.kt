package com.android.amazing.composemultiplatformdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform