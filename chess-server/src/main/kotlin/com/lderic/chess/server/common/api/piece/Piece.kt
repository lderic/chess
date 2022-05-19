package com.lderic.chess.server.common.api.piece

interface Piece {
    val board: Board

    val type: PieceType

    val left: Piece

    val right: Piece

    val up: Piece

    val down: Piece

    val leftUp: Piece

    val leftDown: Piece

    val rightUp: Piece

    val rightDown: Piece

    fun moveTo(x: Int, y: Int)

    companion object {
        val None = object : Piece {
            override val board: Board = Board.None

            override val type: PieceType = PieceType.None

            override val left: Piece = this

            override val right: Piece = this

            override val up: Piece = this

            override val down: Piece = this

            override val leftUp: Piece = this

            override val leftDown: Piece = this

            override val rightUp: Piece = this

            override val rightDown: Piece = this

            override fun moveTo(x: Int, y: Int) {
                throw IllegalStateException("Cannot move None piece")
            }
        }
    }
}
