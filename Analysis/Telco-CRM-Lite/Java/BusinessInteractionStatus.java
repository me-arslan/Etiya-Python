package com.etiya.crmlite.entities.concretes;


import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "BSN_INTER_ST")
public class BusinessInteractionStatus  extends BaseEntity {

    @Id
    @SequenceGenerator(name = "businessInteractionStatusSeq", sequenceName = "BSN_INTER_ST_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "businessInteractionStatusSeq")
    @Column(name = "BSN_INTER_ST_ID")
    private Long businessInteractionStatusId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCR")
    private String description;
    @Column(name = "SHRT_CODE")
    private String  shortCode;
    @Column(name = "IS_ACTV")
    private Long isActv;



    @OneToOne(mappedBy = "businessInteractionStatus", cascade = CascadeType.ALL)
    private BusinessInteraction businessInteractions;




}
