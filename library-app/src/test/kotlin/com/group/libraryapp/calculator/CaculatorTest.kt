package com.group.libraryapp.calculator

fun main(){
    val calculatorTest = CaculatorTest()
    calculatorTest.addTest()
}

class CaculatorTest {

    fun addTest(){
        // given
        val calculator = Caculator(5)

        // when
        calculator.add(3)

        // then
        if (calculator.number != 8) {
            throw IllegalStateException()
        }
    }
}