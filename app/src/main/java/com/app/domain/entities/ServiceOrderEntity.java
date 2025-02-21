package com.app.domain.entities;

import java.util.Date;

public class ServiceOrderEntity {
    private int Id;
    private String DocumentID;
    private String BudgetCode;
    private String EquipDesc;
    private String Model;
    private String SerialNum;
    private String Details;
    private String Problems;
    private String UrgencyLevel;
    private Date DeliveryDate;
    private Date createdAt;
    private String TechResponse;
    private String FinalCoust;
    private String PaymentForm;
    
    // Construtores

    public ServiceOrderEntity(
    		String documentId,
    		String bugdgetCode, 
    		String equipDesc, 
    		String model, 
    		String serialNum, 
    		String details, 
    		String problems,
    		String urgencyLevel,
    		Date deliveryDate,
    		Date createdat,
    		String techResponse,
    		String finalCoust,
    		String paymentForm
    		) {
    	
        this.DocumentID = documentId;
        this.BudgetCode = bugdgetCode;
        this.EquipDesc = equipDesc;
        this.Model = model;	
        this.SerialNum = serialNum;
        this.Details = details;
        this.Problems = problems;
        this.UrgencyLevel = urgencyLevel;
        this.DeliveryDate = deliveryDate;
        this.createdAt = createdat;
        this.TechResponse = techResponse;
        this.FinalCoust = finalCoust;
        this.PaymentForm = paymentForm;
    }

    // Getters e Setters
    public int getId() { return this.Id; }
    public void setId(int id) { this.Id = id; }

    public String getDocumentID() { return this.DocumentID; }

    public String getBudgetCode() { return this.BudgetCode; }

    public String getEquipDesc() { return this.EquipDesc; }

    public String getModel() { return this.Model; }

    public String getSerialNum() { return this.SerialNum; }

    public String getDetails() { return this.Details; }
    
    public String getProblems() { return this.Problems; }
    
    public String getUrgencyLevel() { return this.UrgencyLevel; }
    
    public Date getDelivaryDate() { return this.DeliveryDate; }
    
    public Date getCreatedAt() { return this.createdAt; }

    public String getTechResponse() { return this.TechResponse; }
    
    public String getFinalCoust() { return this.FinalCoust; }
    
    public String getPaymentForm() { return this.PaymentForm; }

}
