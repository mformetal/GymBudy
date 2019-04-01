package mformetal.gymbuddy.extensions

fun <T : Any> Boolean.takeIfFalse(doIfTrue: () -> T) : T? = if (not()) doIfTrue() else null