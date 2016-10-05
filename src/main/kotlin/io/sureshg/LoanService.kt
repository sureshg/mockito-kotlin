package io.sureshg


class LoanService(val calc: LoanCalculator) {
    fun getCustomerLoanAmount(customerId: Int) = calc.calcAmount(customerId)
}