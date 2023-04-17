The contribution amount should be deducted from the member's salary and deposited into the scheme account.The member should be able to view the contribution amount and account balance in their account statement.The system should generate reports to enable the administrator to monitor the contribution amounts and account balances of the members.

package com.sacral.FLS-108.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotationCreationPremiumFundContributionCalculationRepository extends JpaRepository<QuotationCreationPremiumFundContributionCalculation, Long> {
    List<QuotationCreationPremiumFundContributionCalculation> findByAccountValueLessThan(double accountValue);
    List<QuotationCreationPremiumFundContributionCalculation> findByComplianceAS15NewVariant(boolean complianceAS15NewVariant);
    List<QuotationCreationPremiumFundContributionCalculation> findByMemberSalaryAndAgeAndOtherRelevantFactors(double memberSalary, int age, OtherRelevantFactors otherRelevantFactors);
    List<QuotationCreationPremiumFundContributionCalculation> findByMemberSalaryAndAccountBalanceInAccountStatement(double memberSalary, double accountBalance);
    List<QuotationCreationPremiumFundContributionCalculation> findByMemberContributionAmountAndFrequency(double contributionAmount, String frequency);
    List<QuotationCreationPremiumFundContributionCalculation> findByReplenishmentRequestStatusInAccountStatement(String replenishmentRequestStatus);
}