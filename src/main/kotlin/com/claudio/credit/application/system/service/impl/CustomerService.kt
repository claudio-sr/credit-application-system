package com.claudio.credit.application.system.service.impl

import com.claudio.credit.application.system.entity.Customer
import com.claudio.credit.application.system.exception.BusinessException
import com.claudio.credit.application.system.repository.CustomerRepository
import com.claudio.credit.application.system.service.ICustomerService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class CustomerService(private val customerRepository: CustomerRepository): ICustomerService {
    override fun save(customer: Customer): Customer {
        return this.customerRepository.save(customer)
    }

    override fun findById(id: Long): Customer {
        return this.customerRepository.findById(id).orElseThrow {
            throw BusinessException("Id $id not found")
        }
    }

    override fun delete(id: Long) {
        this.customerRepository.deleteById(id)
    }
}