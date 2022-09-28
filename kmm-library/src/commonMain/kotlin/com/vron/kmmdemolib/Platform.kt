package com.vron.kmmdemolib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform