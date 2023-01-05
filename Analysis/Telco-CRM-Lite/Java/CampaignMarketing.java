package com.etiya.crmlite.entities.concretes;
//Kampanya bilgilerinin tutuldugu tablodur.

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "CMPG")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CampaignMarketing  extends BaseEntity {

    @Id
    @SequenceGenerator(name = "marketingCampaignSeq", sequenceName = "CMPG_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marketingCampaignSeq")
    @Column(name = "CMPG_ID")
    private Long marketingCampaignId;

    @OneToMany(mappedBy = "campaignMarketing")
    List<CampaignProductOffering> campaignProductOfferings;
}
