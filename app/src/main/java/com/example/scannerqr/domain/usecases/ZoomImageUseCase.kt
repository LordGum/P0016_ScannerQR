package com.example.scannerqr.domain.usecases

import com.example.scannerqr.domain.repositories.Repository

class ZoomImageUseCase(
    private val repository: Repository
) {
    operator fun invoke(sign: Int) = repository.zoomImage(sign)
}
