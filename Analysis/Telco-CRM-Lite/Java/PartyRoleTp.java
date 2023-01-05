package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PARTY_ROLE_TP")
public class PartyRoleTp extends BaseEntity {

    @Id
    @SequenceGenerator(name = "partyRoleTpSeq",sequenceName ="IND_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partyRoleTpSeq")
    @Column(name = "PARTY_ROLE_TP_ID")
    private Long partyRoleTpId;

    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCR")
    private String description;
    @Column(name = "SHRT_CODE")
    private String shortCode;
    @Column(name = "IS_ACTV")
    private Long isActive;


    @OneToMany(mappedBy = "partyRoleTp")
    private List<PartyRole> partyRoles;

}
