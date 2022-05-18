package com.lderic.chess.gomoku

import com.lderic.chess.common.Board
import com.lderic.chess.common.Pos
import com.lderic.chess.common.Room
import com.lderic.chess.common.piece.Piece
import com.lderic.chess.common.piece.PieceType

class GomokuBoard(override val room: Room, override val size: Int = 15) : Board {
    private val points = hashMapOf<Pos, Piece>()

    init {
        for (x in 0 until size) {
            for (y in 0 until size) {
                val pos = Pos(x, y)
                points[pos] = GomokuPiece(this, pos)
            }
        }
    }

    override val placedPieces: List<Piece> = mutableListOf()

    override var currentPieceType: PieceType = PieceType.Common.EMPTY

    override operator fun get(x: Int, y: Int): Piece? = get(Pos(x, y))

    override operator fun get(pos: Pos): Piece? = points[pos]

    override fun place(x: Int, y: Int) = place(Pos(x, y))

    override fun place(pos: Pos) {
        val piece = get(pos)
        piece ?: return
        piece.type = currentPieceType
        nextType()
    }

    override fun isAvailable(x: Int, y: Int): Boolean = isAvailable(Pos(x, y))

    override fun isAvailable(pos: Pos): Boolean {
        val piece = get(pos)
        piece ?: return false

        return piece.type == PieceType.Common.EMPTY
    }

    override fun nextType() {
        TODO("Not yet implemented")
    }

    override fun isEnd(): Boolean {
        TODO("Not yet implemented")
    }
}