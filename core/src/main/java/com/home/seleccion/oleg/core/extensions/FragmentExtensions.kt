package com.home.seleccion.oleg.core.extensions

import java.math.BigDecimal

fun BigDecimal.roundUI(): String {
    return setScale(2, BigDecimal.ROUND_HALF_EVEN).toString()
}