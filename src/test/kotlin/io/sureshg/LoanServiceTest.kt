package io.sureshg

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

/**
 * Loan service test class.
 */
class LoanServiceTest {

    @Test
    fun testCustomerLoanAmount() {
        val loanCalc = mock(LoanCalculator::class.java)
        `when`(loanCalc.calcAmount(3)).thenReturn(300.0)

        val service = LoanService(loanCalc)
        val loanAmount = service.getCustomerLoanAmount(3)
        assertEquals(300.0, loanAmount)
    }
}