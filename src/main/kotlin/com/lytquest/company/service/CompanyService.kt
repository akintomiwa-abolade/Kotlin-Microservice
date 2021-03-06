package com.lytquest.company.service

import com.lytquest.company.model.Company

interface CompanyService {
    fun createCompany(company: Company):String
    fun getAllCompany():List<Company>
    fun getCompanyByName(name: String):Company
}