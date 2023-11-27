package com.example.Facture.model

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "Invoice")
class Invoice{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var code: String? = null
    @Column (name="create_ad")
    var createAd: Date? = null
    var total: Double? = null
    @Column (name="client_id")
    var clientId: Long? = null
}