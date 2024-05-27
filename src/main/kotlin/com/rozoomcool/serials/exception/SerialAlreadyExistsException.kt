package com.rozoomcool.serials.exception

class SerialAlreadyExistsException(
    override val message: String = "Serial already exists"
): Exception()