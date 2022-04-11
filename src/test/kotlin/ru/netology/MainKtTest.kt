package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculationVkPay() {
        //arrange
        val transferAmount = 5000
        val amountOfPreviousTransfers = 0
        //act
        val result = calculationVkPay(
            transferAmount = transferAmount,
            amountOfPreviousTransfers = amountOfPreviousTransfers
        )
        //assert
        assertEquals(5000, result)
    }

    @Test
    fun calculationMastercardMaestro() {
        //arrange
        val transferAmount = 5000
        val amountOfPreviousTransfers = 0
        //act
        val result = calculationMastercardMaestro(
            transferAmount = transferAmount,
            amountOfPreviousTransfers = amountOfPreviousTransfers
        )
        //assert
        assertEquals(50.0, result, 0.001)
    }
    @Test
    fun calculationVisaMir_Max_Commission() {
        //arrange
        val transferAmount = 5000
        val amountOfPreviousTransfers = 0
        //act
        val result = calculationVisaMir(
            transferAmount = transferAmount,
            amountOfPreviousTransfers = amountOfPreviousTransfers
        )
        //assert
        assertEquals(37.5, result, 0.001)
    }
    @Test
    fun calculationVisaMir_Min_Commission() {
        //arrange
        val transferAmount = 3000
        val amountOfPreviousTransfers = 0
        //act
        val result = calculationVisaMir(
            transferAmount = transferAmount,
            amountOfPreviousTransfers = amountOfPreviousTransfers
        )
        //assert
        assertEquals(35.0, result, 0.001)
    }

}