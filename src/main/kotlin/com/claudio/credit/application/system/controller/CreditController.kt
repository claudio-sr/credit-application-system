package com.claudio.credit.application.system.controller

import com.claudio.credit.application.system.dto.CreditDto
import com.claudio.credit.application.system.entity.Credit
import com.claudio.credit.application.system.service.impl.CreditService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/credits")
class CreditController(
    private val creditService: CreditService
) {

    @PostMapping
    fun saveCredit(@RequestBody creditDto: CreditDto): String {
        val credit: Credit = this.creditService.save(creditDto.toEntity())
        return "Credit ${credit.creditCode} - Customer ${credit.customer?.firstName} saved!"
    }
}