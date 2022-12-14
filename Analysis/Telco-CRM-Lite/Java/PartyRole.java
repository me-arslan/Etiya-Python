package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PARTY_ROLE")
public class PartyRole extends BaseEntity {
    @Id
    @SequenceGenerator(name = "partyRoleSeq",sequenceName ="PARTY_ROLE_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partyRoleSeq")
    @Column(name = "PARTY_ROLE_ID")
    private Long partyRoleId;

    @Column(name = "ST_ID")
    private Long stId;

    @ManyToOne
    @JoinColumn(name = "PARTY_ID")
    private Party party;

    @ManyToOne
    @JoinColumn(name= "PARTY_ROLE_TP_ID")
    private PartyRoleTp partyRoleTp;

    @OneToOne(mappedBy = "partyRole",cascade = CascadeType.ALL)
    private Customer customer;

}
