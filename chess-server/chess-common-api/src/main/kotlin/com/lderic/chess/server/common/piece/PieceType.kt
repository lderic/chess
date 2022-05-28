package com.lderic.chess.server.common.piece

interface PieceType {
    val name: String

    companion object {
        val None = object : PieceType {
            override val name: String = "None"
        }
    }
}