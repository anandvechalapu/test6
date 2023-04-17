package com.sacral.FLS-108.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.FLS-108.model.QuotationCreationPremiumFundContributionCalculation;
import com.sacral.FLS-108.repository.QuotationCreationPremiumFundContributionCalculationRepository;

@Service
public class QuotationCreationPremiumFundContributionCalculationService {
    @Autowired
    QuotationCreationPremiumFundContributionCalculationRepository quotationCreationPremiumFundContributionCalculationRepository;

    public void deductContributionAmountFromMemberSalary(QuotationCreationPremiumFundContributionCalculation quotationCreationPremiumFundContributionCalculation) {
        double contributionAmount = quotationCreationPremiumFundContributionCalculation.getContributionAmount();
        double memberSalary = quotationCreationPremiumFundContributionCalculation.getMemberSalary();
        memberSalary = memberSalary - contributionAmount;
        quotationCreationPremiumFundContributionCalculation.setMemberSalary(memberSalary);
        quotationCreationPremiumFundContributionCalculationRepository.save(quotationCreationPremiumFundContributionCalculation);
    }

    public double getContributionAmount(QuotationCreationPremiumFundContributionCalculation quotationCreationPremiumFundContributionCalculation) {
        return quotationCreationPremiumFundContributionCalculation.getContributionAmount();
    }

    public double getAccountBalanceInAccountStatement(QuotationCreationPremiumFundContributionCalculation quotationCreationPremiumFundContributionCalculation) {
        return quotationCreationPremiumFundContributionCalculation.getAccountBalanceInAccountStatement();
    }

    public List<QuotationCreationPremiumFundContributionCalculation> getReportByAccountValue(double accountValue) {
        return quotationCreationPremiumFundContributionCalculationRepository.findByAccountValueLessThan(accountValue);
    }

    public List<QuotationCreationPremiumFundContributionCalculation> getReportByComplianceAS15NewVariant(boolean complianceAS15NewVariant) {
        return quotationCreationPremiumFundContributionCalculationRepository.findByComplianceAS15NewVariant(complianceAS15NewVariant);
    }

    public List<QuotationCreationPremiumFundContributionCalculation> getReportByMemberSalaryAndAgeAndOtherRelevantFactors(double memberSalary, int age, OtherRelevantFactors otherRelevantFactors) {
        return quotationCreationPremiumFundContributionCalculationRepository.findByMemberSalaryAndAgeAndOtherRelevantFactors(memberSalary, age, otherRelevantFactors);
    }

    public List<QuotationCreationPremiumFundContributionCalculation> getReportByMemberSalaryAndAccountBalanceInAccountStatement(double memberSalary, double accountBalance) {
        return quotationCreationPremiumFundContributionCalculationRepository.findByMemberSalaryAndAccountBalanceInAccountStatement(memberSalary, accountBalance);
    }

    public List<QuotationCreationPremiumFundContributionCalculation> getReportByMemberContributionAmountAndFrequency(double contributionAmount, String frequency) {
        return quotationCreationPremiumFundContributionCalculationRepository.findByMemberContributionAmountAndFrequency(contributionAmount, frequency);
    }

    public List<QuotationCreationPremiumFundContributionCalculation> getReportByReplenishmentRequestStatusInAccountStatement(String replenishmentRequestStatus) {
        return quotationCreationPremiumFundContributionCalculationRepository.findByReplenishmentRequestStatusInAccountStatement(replenishmentRequestStatus);
    }
}