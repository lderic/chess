package com.lderic.chess.common

import com.lderic.chess.common.piece.Piece
import com.lderic.chess.common.piece.PieceType

interface Board {
    val room: Room

    val placedPieces: List<Piece>

    var currentPieceType: PieceType

    /**
     * This size means how many pieces can be put on the side of the board
     */
    val size: Int

    operator fun get(x: Int, y: Int): Piece?

    operator fun get(pos: Pos): Piece?

    fun place(x: Int, y: Int)

    fun place(pos: Pos)

    fun isAvailable(pos: Pos): Boolean

    fun isAvailable(x: Int, y: Int): Boolean

    /**
     * Jump to the text piece type
     */
    fun nextType()

    fun isEnd(): Boolean
}