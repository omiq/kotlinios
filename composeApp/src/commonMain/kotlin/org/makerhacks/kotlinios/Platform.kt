package org.makerhacks.kotlinios

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform