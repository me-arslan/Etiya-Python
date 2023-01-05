package com.etiya.crmlite.entities.concretes;
//Kampanyanin içerdigi tekliflerin tutuldugu tablodur.


import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CMPG_PROD_OFR")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CampaignProductOffering  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "campaignProductOfferingSeq", sequenceName = "CMPG_PROD_OFR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "campaignProductOfferingSeq")
    @Column(name = "CMPG_PROD_OFR_ID")
    private Long campaignProductOfferingId;  //
    @Column(name = "PROD_OFR_NAME")
    private String productOfferName ;
    @Column(name = "PRIO")
    private Long description ;



    @ManyToOne
    @JoinColumn(name = "CMPG_ID")
    private CampaignMarketing campaignMarketing;

    @ManyToOne
    @JoinColumn(name = "PROD_OFR_ID")
    private ProductionOffering productOffering;


}
