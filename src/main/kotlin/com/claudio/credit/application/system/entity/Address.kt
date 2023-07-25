package com.claudio.credit.application.system.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded
import jdk.jfr.Enabled

@Embeddable
data class Address(
    @Column(nullable = false)
    var zipCode: String = "",

    @Column(nullable = false)
    var street: String = ""
)
