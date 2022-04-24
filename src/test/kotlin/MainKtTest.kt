import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalculation_NoCommission_MasterCard() {
        val typeOfCard = TypeOfCard.MasterCard
        val amountOfPreviousTransfers = 2_000_000
        val transferAmount = 150_000
        val expectedCommission = 0

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            amountOfPreviousTransfers = amountOfPreviousTransfers,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_NoCommission_Maestro() {
        val typeOfCard = TypeOfCard.Maestro
        val amountOfPreviousTransfers = 2_500_000
        val transferAmount = 100_000
        val expectedCommission = 0

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            amountOfPreviousTransfers = amountOfPreviousTransfers,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_NoPreviousTransfers_Maestro() {
        val typeOfCard = TypeOfCard.Maestro
        val amountOfPreviousTransfers = 0
        val transferAmount = 10_000_000
        val expectedCommission = 80_000

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            amountOfPreviousTransfers = amountOfPreviousTransfers,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_Commission_MasterCard() {
        val typeOfCard = TypeOfCard.MasterCard
        val amountOfPreviousTransfers = 7_300_500
        val transferAmount = 200_000
        val expectedCommission = 21_200

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            amountOfPreviousTransfers = amountOfPreviousTransfers,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_Commission_Maestro() {
        val typeOfCard = TypeOfCard.Maestro
        val amountOfPreviousTransfers = 8_000_000
        val transferAmount = 150_000
        val expectedCommission = 20_900

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            amountOfPreviousTransfers = amountOfPreviousTransfers,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_MinCommission_Visa() {
        val typeOfCard = TypeOfCard.Visa
        val transferAmount = 150_000
        val expectedCommission = 3_500

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_MinCommission_Mir() {
        val typeOfCard = TypeOfCard.Mir
        val transferAmount = 100_000
        val expectedCommission = 3_500

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_Commission_Visa() {
        val typeOfCard = TypeOfCard.Visa
        val transferAmount = 500_000
        val expectedCommission = 3_750

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_Commission_Mir() {
        val typeOfCard = TypeOfCard.Mir
        val transferAmount = 1_000_000
        val expectedCommission = 7_500

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_NoPreviousTransfers_Mir() {
        val typeOfCard = TypeOfCard.Mir
        val amountOfPreviousTransfers = 0
        val transferAmount = 30_000
        val expectedCommission = 3_500

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            amountOfPreviousTransfers = amountOfPreviousTransfers,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

    @Test
    fun commissionCalculation_Commission_VKPay() {
        val typeOfCard = TypeOfCard.VKPay
        val transferAmount = 5_000_000
        val expectedCommission = 0

        val actualCommission = commissionCalculation(
            typeOfCard = typeOfCard,
            transferAmount = transferAmount
        )

        assertEquals(expectedCommission, actualCommission)
    }

}