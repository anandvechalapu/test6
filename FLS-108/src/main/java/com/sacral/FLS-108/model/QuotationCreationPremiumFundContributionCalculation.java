package com.sacral.FLS-108.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuotationCreationPremiumFundContributionCalculation {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private double accountValue;
    private boolean complianceAS15NewVariant;
    private double memberSalary;
    private int age;
    private OtherRelevantFactors otherRelevantFactors;
    private double accountBalance;
    private double contributionAmount;
    private String frequency;
    private String replenishmentRequestStatus;

    //getters and setters
    
}

package com.sacral.FLS-108.model;

public class OtherRelevantFactors {
    private boolean hasPreviousInsurance;
    private int yearsOfInsurance;
    private boolean isSelfEmployed;
    private double otherIncome;
    private double otherExpenses;
    private double medicalHistory;

    //getters and setters
}