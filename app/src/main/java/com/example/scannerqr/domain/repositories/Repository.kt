package com.example.scannerqr.domain.repositories

import com.example.scannerqr.domain.entities.ImageQR

interface Repository {

    fun scanCamera(): ImageQR

    fun scanFromStorage(): ImageQR

    fun zoomImage(sign: Int) //? 0 - +

    fun turnOnLight()

    fun turnOffLight()
}