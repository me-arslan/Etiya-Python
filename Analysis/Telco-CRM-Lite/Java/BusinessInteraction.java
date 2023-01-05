package com.etiya.crmlite.entities.concretes;
//Müsteri ya da müsteri bilesenleri üzerinde yapilan  talep ve karsilama islemlerinin(isteklerin) tutuldugu tablodur.

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "BSN_INTER")
public class BusinessInteraction extends BaseEntity {
    @Id
    @SequenceGenerator(name = "businessInteractionSeq", sequenceName = "BSN_INTER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "businessInteractionSeq")
    @Column(name = "BSN_INTER_ID")
    private Long businessInteractionId;
    @Column(name ="DESCR")
    private String description;
    @Column(name ="CUST_ID")
    private Long customerId;

    @Column(name ="ROW_ID")
    private Long rowId;
    @Column(name ="DATA_TP_ID")
    private Long dataTpId;

    @OneToMany(mappedBy = "businessInteraction")
    List<CustomerOrderItem> customerOrderItems;

    @OneToMany(mappedBy = "businessInteraction")
    List<BusinessInteractionItem> businessInteractionItems;

    @ManyToOne
    @JoinColumn(name = "BSN_INTER_SPEC_ID")
    private BusinessInteractionSpec businessInteractionSpec;

    @OneToOne
    @JoinColumn(name = "BSN_INTER_ST_ID",unique = true)
    private BusinessInteractionStatus businessInteractionStatus;

    //--------------------------------------------------------------
    @OneToMany(mappedBy = "parentBusinessInteraction")              //
            List<BusinessInteraction> childBusinessInteraction;     //
                                                                   //
    @ManyToOne                                                     //
    @JoinColumn(name = "PRNT_BSN_INTER_ID")                        //
    private BusinessInteraction parentBusinessInteraction;         //
//--------------------------------------------------------------

}
