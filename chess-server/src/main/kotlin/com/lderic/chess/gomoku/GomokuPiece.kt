package com.lderic.chess.gomoku

import com.lderic.chess.common.Board
import com.lderic.chess.common.Pos
import com.lderic.chess.common.piece.Piece
import com.lderic.chess.common.piece.PieceType

class GomokuPiece(
    override val board: Board,
    override val pos: Pos
) : Piece {
    override var type: PieceType = PieceType.Common.EMPTY

    override val left: Piece?
        get() = board[pos.x - 1, pos.y]
    override val right: Piece?
        get() = board[pos.x + 1, pos.y]
    override val up: Piece?
        get() = board[pos.x, pos.y + 1]
    override val down: Piece?
        get() = board[pos.x, pos.y - 1]
}