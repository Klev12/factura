package com.example.Facture.model

import jakarta.persistence.*

@Entity
@Table(name = "Detail")
class Detail{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var quantity: Long? = null
    var price: Double? = null
    @Column (name="invoice_id")
    var invoiceId: Long? = null
    @Column (name="product_id")
    var productId: Long? = null
}