package com.example.hackerranks

import java.math.BigDecimal
import java.math.RoundingMode

object PlusMinus {
    fun plusMinus(arr: Array<Int>): String {
        val positiveNumbers = arr.filter { it > 0 }.size.toBigDecimal()
        val negitiveNumbers = arr.filter { it < 0 }.size.toBigDecimal()
        val zeros = arr.filter { it == 0 }.size.toBigDecimal()


        if (arr.isNotEmpty()) {
            val pr = positiveNumbers.divide(arr.size.toBigDecimal(), 6, RoundingMode.HALF_UP)
            val nr = negitiveNumbers.divide(arr.size.toBigDecimal(), 6, RoundingMode.HALF_UP)
            val zr = zeros.divide(arr.size.toBigDecimal(), 6, RoundingMode.HALF_UP)

            return "$pr\n$nr\n$zr"
        }else{
            return "0.00000\n0.00000\n0.00000"
        }

    }
}