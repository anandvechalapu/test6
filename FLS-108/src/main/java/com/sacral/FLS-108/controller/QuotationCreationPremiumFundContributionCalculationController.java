package com.sacral.FLS-108.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.FLS-108.model.QuotationCreationPremiumFundContributionCalculation;
import com.sacral.FLS-108.model.OtherRelevantFactors;
import com.sacral.FLS-108.service.QuotationCreationPremiumFundContributionCalculationService;

@RestController
public class QuotationCreationPremiumFundContributionCalculationController {

    @Autowired
    QuotationCreationPremiumFundContributionCalculationService quotationCreationPremiumFundContributionCalculationService;
    
    @PostMapping(value = "/deductContributionAmountFromMemberSalary")
    public void deductContributionAmountFromMemberSalary(@RequestBody QuotationCreationPremiumFundContributionCalculation quotationCreationPremiumFundContributionCalculation) {
        quotationCreationPremiumFundContributionCalculationService.deductContributionAmountFromMemberSalary(quotationCreationPremiumFundContributionCalculation);
    }

    @GetMapping(value = "/getContributionAmount/{quotationCreationPremiumFundContributionCalculation}")
    public double getContributionAmount(@PathVariable QuotationCreationPremiumFundContributionCalculation quotationCreationPremiumFundContributionCalculation) {
        return quotationCreationPremiumFundContributionCalculationService.getContributionAmount(quotationCreationPremiumFundContributionCalculation);
    }

    @GetMapping(value = "/getAccountBalanceInAccountStatement/{quotationCreationPremiumFundContributionCalculation}")
    public double getAccountBalanceInAccountStatement(@PathVariable QuotationCreationPremiumFundContributionCalculation quotationCreationPremiumFundContributionCalculation) {
        return quotationCreationPremiumFundContributionCalculationService.getAccountBalanceInAccountStatement(quotationCreationPremiumFundContributionCalculation);
    }

    @GetMapping(value = "/getReportByAccountValue/{accountValue}")
    public List<QuotationCreationPremiumFundContributionCalculation> getReportByAccountValue(@PathVariable double accountValue) {
        return quotationCreationPremiumFundContributionCalculationService.getReportByAccountValue(accountValue);
    }

    @GetMapping(value = "/getReportByComplianceAS15NewVariant/{complianceAS15NewVariant}")
    public List<QuotationCreationPremiumFundContributionCalculation> getReportByComplianceAS15NewVariant(@PathVariable boolean complianceAS15NewVariant) {
        return quotationCreationPremiumFundContributionCalculationService.getReportByComplianceAS15NewVariant(complianceAS15NewVariant);
    }

    @GetMapping(value = "/getReportByMemberSalaryAndAgeAndOtherRelevantFactors/{memberSalary}/{age}/{otherRelevantFactors}")
    public List<QuotationCreationPremiumFundContributionCalculation> getReportByMemberSalaryAndAgeAndOtherRelevantFactors(@PathVariable double memberSalary, 
                                                                                                                    @PathVariable int age, 
                                                                                                                    @PathVariable OtherRelevantFactors otherRelevantFactors) {
        return quotationCreationPremiumFundContributionCalculationService.getReportByMemberSalaryAndAgeAndOtherRelevantFactors(memberSalary, age, otherRelevantFactors);
    }

    @GetMapping(value = "/getReportByMemberSalaryAndAccountBalanceInAccountStatement/{memberSalary}/{accountBalance}")
    public List<QuotationCreationPremiumFundContributionCalculation> getReportByMemberSalaryAndAccountBalanceInAccountStatement(@PathVariable double memberSalary, 
                                                                                                                            @PathVariable double accountBalance) {
        return quotationCreationPremiumFundContributionCalculationService.getReportByMemberSalaryAndAccountBalanceInAccountStatement(memberSalary, accountBalance);
    }

    @GetMapping(value = "/getReportByMemberContributionAmountAnd