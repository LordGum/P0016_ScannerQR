package com.example.scannerqr.domain.usecases

import com.example.scannerqr.domain.repositories.Repository

class ScanCameraUseCase(
    private val repository: Repository
) {
    operator fun invoke() = repository.scanCamera()
}